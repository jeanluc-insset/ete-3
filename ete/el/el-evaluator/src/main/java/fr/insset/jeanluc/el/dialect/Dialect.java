package fr.insset.jeanluc.el.dialect;



import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.datatype.UnlimitedNatural;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import java.util.HashSet;
import java.util.Set;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 * A dialect makes easier template creation.<br>
 * For instance it contains methods to manipulate strings such as converting
 * from camel case to separated words, changing the case of the initial
 * character of a string and so on. It can contain enhancements to MOF as well,
 * such as looking for dependencies, some stereotypes...
 *
 * @author jldeleage
 */
public interface Dialect {

    public final static String  DIALECT                 = "dialect";

    public final static String  INPUT                   = "input",
                                SECRET                  = "password",
                                SELECT_ONE              = "select_one",
                                SELECT_MANY             = "select_many",
                                CALENDAR                = "calendar",
                                MANY_CALENDARS          = "many_calendars",
                                CHECKBOX                = "checkbox",
                                SUBCOMPONENT            = "subcomponent";


    public final static String  SIMPLE                  = "simple",
                                MANY_SIMPLE             = "many_simple",
                                DATE                    = "date",
                                MANY_DATES               = "many_dates",
                                ONE2MANY                = "one2many",
                                COMP_ONE2MANY           = "comp_one2many",
                                COMP_ONE2ONE            = "comp_one2one",
                                BIDIR_ONE2ONE           = "bidir_one2one",
                                BIDIR_COMP_ONE2MANY     = "bidir_comp_one2many",
                                BIDIR_ONE2MANY          = "bidir_one2many",
                                BIDIR_MANY2ONE          = "bidir_many2one",
                                MANY2ONE                = "many2one",
                                MANY2MANY               = "many2many",
                                BIDIR_MANY2MANY         = "bidir_many2many";



    /**
     * "i2uc" = "initial to upper case"
     * 
     * @param inString
     * @return 
     */
    public default String    i2uc(String inString) {
        if (inString == null) {
            return null;
        }
        if ("".equals(inString)) {
            return "";
        }
        return inString.substring(0, 1).toUpperCase() + inString.substring(1);
    }

    public default String    i2lc(String inString) {
        if (inString == null) {
            return null;
        }
        if ("".equals(inString)) {
            return "";
        }
        return inString.substring(0, 1).toLowerCase() + inString.substring(1);
    }


    /**
     * Takes a camel-case string and returns that string with spaces a lower
     * case characters instead of upper case characters.<br>
     * Does not modify the initial character.
     * 
     * @param inString
     * @return 
     */
    public default String cc2sw(String inString) {
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher m = pattern.matcher(inString);
        StringBuffer    sb = new StringBuffer();
        while (m.find()) {
            String substring = inString.substring(m.start(), m.end());
            if (m.start()==0) {
                m.appendReplacement(sb, substring);
            } else {
                m.appendReplacement(sb, " " + substring.toLowerCase());
            }
        }
        m.appendTail(sb);
        return sb.toString();
    }

    /**
     * Takes a snake-case string and returns that string with spaces a lower
     * case characters instead of upper case characters.<br>
     * Does not modify the initial character.
     * 
     * @param inString
     * @return 
     */
    public default String sc2sw(String inString) {
        return inString.replaceAll("_", " ");
    }


    public default String p2d(String inString) {
        return inString.replaceAll("::", "/").replaceAll(".", "/");
    }


    //========================================================================//


    public default Set<MofType> getDependencies(MofClass inClass) {
        Set<MofType>    result = new HashSet<>();
        for (MofProperty p : inClass.getOwnedAttribute()) {
            addDependency(p.getType(), result);
        }
        return result;
    }

    public default void addDependency(MofType inType, Set<MofType> inoutDependencies) {
        if (inType.isCollection()) {
            addDependency(((MofCollection)inType).getBaseType(), inoutDependencies);
            return;
        }
        else {
            if (inType instanceof MofClass) {
                inoutDependencies.add(inType);
            }
        }
    }


    //========================================================================//


    /**
     * moft2lt = "MOF Type to Local Type"
     * 
     * @param inString : MofType name
     * @return : type name in the local language
     */
    public default String moft2lt(String inString) {
        return inString;
    }

    public default String mt2lt(MofType inType) {
        return moft2lt(inType.getName());
    }


    /**
     * mofv2lv : "MOF Value to Local Value"<br>
     * 
     * @param inValue : the value to be converted
     * @return the converted value
     */
    public default Object mofv2lv(String inValue) {
        return inValue;
    }


    //========================================================================//
    //                                  O R M                                 //
    //========================================================================//

    /**
     * <div>
     * WARNING : the bidirectional many to many assoication is messy.
     * </div>
     * 
     * To build a persistence model, we need to find out whether the
     * property is an association, the kind of the association (OneToMany,
     * ManyToOne...) and whether it is navigable in both directions.
     *
     * 
     * @param  inProperty : the property to analyze
     * @return a value among : "simple", "oneToMany", "bidirOnToMany",
     * "manyToMany", "bidirManyToMany", "manyToOne", "compositeOneToMany",
     * 
     */
    public default String prop2orm(MofProperty inProperty) {
        MofType type = inProperty.getType();
        String  typeName = type.getName();
        if ("date".equals(typeName) || "dateType".equals(typeName)) {
            return DATE;
        }
        if (type.isCollection()) {
            MofCollection coll = (MofCollection) type;
            MofType baseType = coll.getBaseType();
            String  baseTypeName = baseType.getName();
            if ("date".equals(baseTypeName) || "dateType".equals(baseTypeName)) {
                return MANY_DATES;
            }
            if (! (baseType instanceof MofClass)) {
                return MANY_SIMPLE;
            }
            MofProperty opposite = inProperty.getOpposite();
            if (opposite == null || opposite.getName() == null) {
                return inProperty.isComposite() ? COMP_ONE2MANY : ONE2MANY;
            }
            // 
            if (inProperty.isComposite()) {
                // a bidirectional composition cannot be many to many
                return BIDIR_ONE2MANY;
            }
            // WARNING WARNING WARNING WARNING WARNING WARNING WARNING
            // TODO : we must not return the same result for both ends
            return opposite.getType().isCollection()? BIDIR_MANY2MANY : BIDIR_MANY2ONE;
        }
        if (! (type instanceof MofClass)) {
            return SIMPLE;
        }
        UnlimitedNatural upper = inProperty.getUpper();
        MofProperty opposite = inProperty.getOpposite();
        if (upper != null && "*".equals(upper.getValue())) {
            return opposite == null ? ONE2MANY : BIDIR_ONE2MANY;
        }
        return opposite != null && opposite.getName() != null ? BIDIR_MANY2ONE : MANY2ONE;
    }



    /**
     * Return a string identifying the HTML component to use to edit the value
     * of a property. The string is supposed to be the name of template to
     * render<br>
     * The map is&nbsp;:<ul>
     * </ul>
     * 
     * @param inType
     * @return 
     */
    public default String   prop2comp(MofProperty inProperty) {
        MofType type = inProperty.getType();
        if (type instanceof MofClass) {
            if (inProperty.isComposite()) {
                return SUBCOMPONENT;
            }
            return SELECT_ONE;
        }
        String typeName = type.getName();
        if ("date".equals(typeName) || "dateType".equals(typeName)) {
            return CALENDAR;
        }
        if ("String".equals(typeName) || "StringType".equals(typeName)) {
            if (inProperty.hasStereotype("password")) {
                return SECRET;
            }
            return INPUT;
        }
        if ("boolean".equals(typeName) || "booleanType".equals(typeName)) {
            return CHECKBOX;
        }
        return INPUT;
    }



    //========================================================================//

    /**
     * The mofv2lv method is static. In case of a dynamic need, one can call
     * converter which returns the text of the statement to run to convert
     * the value.
     * 
     * @param inValue
     * @param inMofType
     * @return 
     */
    public default String converter(String inValue, String inMofType) {
//        return inValue
        throw new UnsupportedOperationException("Not supported yet.");
    }


    //========================================================================//


    /**
     * TODO : make it more general to apply to any "inherited" stereotype<br>
     * TODO : make it more general to apply to any stereotype and any
     * named element.
     * 
     * @param inClass
     * @return 
     */
    public default boolean isEntity(MofClass inClass) {
        if (inClass.hasStereotype("Entity")) {
            return true;
        }
        MofPackage owningPackage = inClass.getOwningPackage();
        if (owningPackage != null) {
            return isEntityPackage(owningPackage);
        }
        return false;
    }


    public default boolean isEntityPackage(MofPackage inPackage) {
        MofPackage current = inPackage;
        while (current != null) {
            if (current.hasStereotype("entitypackage")) {
                return true;
            }
            current = current.getOwningPackage();
        }
        return false;
    }


    /**
     * Returns a symbol associated to a string.<br>
     * Useful for example to translate an abstract operator to an actual
     * operator : "not" is translated to "not" in some languages, to
     * "!" in C based languages, to "~" in some other languages... "diff"
     * is translated to "!=" or to "<>"...
     * 
     * @param inSymbol
     * @return 
     */
    public default String   getSymbol(String inSymbol) {
        return inSymbol;
    }


    /**
     * Creates a "constant" from an identifier by inserting an underscore
     * character before any inner upper case, then converting every character
     * to upper case.
     * 
     * @param name
     * @return 
     */
    public default String toConstant(String name) {
        if (name == null) {
            return "ANONYMOUS";
        }
        String regex = "([A-Z][a-z]+)";
        String replacement = "_$1";
        // insert _ before 
        name = name.replaceAll(regex, replacement);
        // remove the leading _
        if (name.charAt(1) <= 'Z') {
            name = name.substring(1);
        }
        return name.toUpperCase();
    }


    /**
     * Returns the symbol associated to the named element. If the named element
     * has a tag symbol named "symbol", that value is returned. Otherwise, the
     * method builds a constant from the name of the element.
     * @param NamedElement inElement : the elelement we need a symbol for.
     * @return : the associated symbol
     */
    public default String   getSymbol(NamedElement inElement) {
        Object valueOf = inElement.getValueOf("symbol");
        if (valueOf != null) {
            return valueOf.toString();
        }
        return toConstant(inElement.getName());
    }



    public default void addQualifiedName(PackageableElement inElement, StringBuilder inoutBuilder) {
        MofPackage owningPackage = inElement.getOwningPackage();
        if (owningPackage != null) {
            addQualifiedName(owningPackage, inoutBuilder);
            inoutBuilder.append("::");
        }
        inoutBuilder.append(inElement.getName());
    }




    public default String getQualifiedName(NamedElement inElement) {
        if (inElement instanceof PackageableElement) {
            StringBuilder builder = new StringBuilder();
            addQualifiedName((PackageableElement) inElement, builder);
            return builder.toString();
        }
        return inElement.getQualifiedName();
    }


}
