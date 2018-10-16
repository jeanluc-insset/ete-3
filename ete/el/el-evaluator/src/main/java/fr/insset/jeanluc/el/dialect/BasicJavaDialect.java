package fr.insset.jeanluc.el.dialect;



import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.BOOLEAN_TYPE;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.DATE_TYPE;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.FLOAT_TYPE;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.INT_TYPE;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.STRING_TYPE;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.TYPE_SUFFIX;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.UNLIMITED_NATURAL_TYPE;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;


/**
 *
 * @author jldeleage
 */
public class BasicJavaDialect implements JavaDialect {

    public String getPrefix() {
        return modelPrefix;
    }

    public void setPrefix(String modelPrefix) {
        this.modelPrefix = modelPrefix;
    }


    @Override
    public String moft2lt(String inString) {
        if (inString == null) {
            return "void";
        }
        String result = getPrefix() + inString;
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




    private String  modelPrefix = "";

}
