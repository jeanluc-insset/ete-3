package fr.insset.jeanluc.el.dialect;

import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.BOOLEAN_TYPE;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.DATE_TYPE;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.FLOAT_TYPE;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.INT_TYPE;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.STRING_TYPE;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.TYPE_SUFFIX;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.UNLIMITED_NATURAL_TYPE;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
//import fr.insset.jeanluc.ete.meta.model.datatype.UnlimitedNatural;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofOrderedSet;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofSequence;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofSet;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author jldeleage
 */
public interface JavaDialect extends Dialect {

    public default String moft2lt(String inString) {
        if (inString == null) {
            return "void";
        }
        String result = inString;
        switch (inString) {
//            case BOOLEAN_TYPE:
            case BOOLEAN_TYPE + TYPE_SUFFIX:
                result = "boolean";
                break;
//            case STRING_TYPE:
            case STRING_TYPE + TYPE_SUFFIX:
                result =  "String";
                break;
//            case INT_TYPE:
            case INT_TYPE + TYPE_SUFFIX :
                result = "int";
                break;
//            case FLOAT_TYPE:
            case FLOAT_TYPE + TYPE_SUFFIX:
                result = "double";
                break;
//            case DATE_TYPE:
            case DATE_TYPE + TYPE_SUFFIX:
//                result = "java.time.LocalDate";
                result = "java.util.Date";
                break;
//            case UNLIMITED_NATURAL_TYPE:
            case UNLIMITED_NATURAL_TYPE + TYPE_SUFFIX :
                result = "fr.insset.jeanluc.ete.meta.model.datatype.UnlimitedNatural";
                break;
        }
        return result;
    }


    @Override
    public default String mt2lt(MofType inType) {
        if (inType == null) {
            return "void";
        }
        if (inType.isCollection()) {
            MofCollection coll = (MofCollection) inType;
            System.out.println("Type of the coll : " + coll.getName());
            System.out.println("The type is ordered : " + coll.isOrdered());
            if (coll.isOrdered()) {
                return "List<" + mt2lt(coll.getBaseType()) + ">";
            }
            else {
                return "Set<" + mt2lt(coll.getBaseType()) + ">";
            }
        }
        return moft2lt(inType.getName());
    }


    @Override
    public default String getSymbol(String inSymbol) {
        switch (inSymbol) {
            case "opp" : return "-";
            case "not" : return "!";
            case "and" : return "&&";
            case "or"  : return "||";
            case "<>"  : return "!=";
            case "="   : return "==";
        }
        return inSymbol;
    }


    public default String getQualifiedName(NamedElement inNamedObject) {
        if (inNamedObject == null) {
            return "void";
        }
        Logger  logger = Logger.getLogger(getClass().getName());
        logger.log(Level.FINE, "JavaDialect.getQualifiedName(" + inNamedObject.getName() + ")");
        if (inNamedObject instanceof MofCollection) {
            logger.log(Level.FINER, "Collection");
            MofCollection coll = (MofCollection) inNamedObject;
            if (coll instanceof MofSequence) {
                String result = "List<" + getQualifiedName(coll.getBaseType()) + ">";
                logger.log(Level.FINER, "Sequence -> " + result);
                return result;
            }
            else if (coll instanceof MofSet) {
                return "Set<" + getQualifiedName(coll.getBaseType()) + ">";
            }
            else if (coll instanceof MofOrderedSet) {
                return "OrderedSet<" + getQualifiedName(coll.getBaseType()) + ">";
            }
            else {
                return "List<" + getQualifiedName(coll.getBaseType()) + ">";
            }
        }
        String qualifiedName = moft2lt(inNamedObject.getQualifiedName());
        Logger.getLogger("fr.insset.jeanluc.el.dialect.JavaDialect").fine("Qualified name of " + inNamedObject.getName() + " -> " + qualifiedName);
        return moft2lt(qualifiedName).replace("::", ".");
    }

    public default String getOperationBody(MofOperation inOperation) {
        return getOperationBody(inOperation, "        ");
    }

    public default String getOperationBody(MofOperation inOperation, String inIndentation) {
        if (inIndentation == null) {
            inIndentation = "        ";
        }
        return inIndentation  + "throw new RuntimeException(\"Not yet implemented\");\n";
    }

    public default NamedElement findEltByName(String inName, Collection inColl) {
        try {
            Stream<NamedElement> map = inColl.stream()
                    .map(JavaDialect::convertToNamedElement);
            Optional<NamedElement> findAny = map.filter(c -> inName.equals(c.getName())).findAny();
            if (findAny.isPresent()) {
                return findAny.get();
            }
        }
        catch (Exception e) {
            Logger.getGlobal().severe("Unable to find an element with name " + inName);
        }
        return null;
    }

    public default String toString(MofClass inClass) {
        Logger  logger = Logger.getLogger(getClass().getName());
        List<MofProperty>       stereotypedProperties = new LinkedList<>();
        List<MofProperty>       allProperties = inClass.getOwnedAttribute();
        switch (allProperties.size()) {
            case 0:
                return "return super.toString();";
            case 1:
                MofProperty first = allProperties.get(0);
                String      firstName = first.getName();
                firstName = iu(firstName);
                return "return get" + firstName + "();";
        }
        stereotypedProperties = allProperties
                .stream()
                .filter(p -> p.hasStereotype("tostring"))
                .collect(Collectors.toList());
        switch (stereotypedProperties.size()) {
            case 0:
                return "return super.toString();";
            case 1:
                return "return get" + iu(stereotypedProperties.get(0).getName()) + "();";
        }
        stereotypedProperties.sort((p1,p2)->{
            Object value1 = p1.getValueOf("order");
            if (value1 == null) {
                return 1;
            }
            logger.log(Level.FINE, "Class of value1 : " + value1.getClass());
            Object value2 = p2.getValueOf("order");
            return 0;
        });
        StringBuilder builder = new StringBuilder("        StringBuilder builder = new StringBuilder();\n");
        for (MofProperty prop : stereotypedProperties) {
            Object valueOf = prop.getValueOf("separator");
            if (valueOf != null) {
                builder.append("        builder.append(\"");
                builder.append(valueOf);
                builder.append("\");\n");
            }
            builder.append("        builder.append(get");
            builder.append(iu(prop.getName()));
            builder.append("());\n");
        }
        builder.append("        return builder.toString();");
        return builder.toString();
    }

    /**
     * "initUpper" : returns the same String but with its initial letter in
     * upper case
     * 
     * @param inString
     * @return 
     */
    public default String iu(String inString) {
        return inString.substring(0, 1).toUpperCase() + inString.substring(1);
    }

    /**
     * "initLower" : returns the same String but with its initial letter in
     * lower case
     * 
     * @param inString
     * @return 
     */
    public default String il(String inString) {
        return inString.substring(0, 1).toLowerCase() + inString.substring(1);
    }


    public static NamedElement convertToNamedElement(Object obj) {
        return (NamedElement)obj;
    }

}
