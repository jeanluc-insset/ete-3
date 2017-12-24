package fr.insset.jeanluc.ete.api.impl;



import fr.insset.jeanluc.el.evaluator.JSR341Evaluator;
import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;



/**
 *
 * @author jldeleage
 */
public class ParameterAction extends ActionSupport {

    public final static String      PARAMETER = "parameter-action";
    public final static String      PARAM     = "param-action";


    @Override
    public MofPackage preProcess(MofPackage inPackage) throws EteException {
        String parameterName = (String)this.getLocalParameter("name");
        Object parameterValue = getValue(inPackage, this.getLocalParameter("value"));
        if (parameterName != null) {
            if (parameterValue != null) {
                getParent().addParameter(parameterName, parameterValue);
            }       // parameterValue != null
            else {
                Object defaultValue = getValue(inPackage, this.getLocalParameter("default"));
                parameterValue = getParameter(parameterName);
                if (parameterValue == null && defaultValue != null) {
                    System.out.println("Passage du parametre " + parameterName
                        + " avec la valeur par défaut " + defaultValue);
                    getParent().addParameter(parameterName, defaultValue);
                }
            }
        }       // parameterName != null
        return super.postProcess(inPackage);
    }

    private Object getValue(MofPackage inPackage, Object inValue) {
        if (inValue == null) {
            return null;
        }
        if (inValue instanceof String) {
            JSR341Evaluator evaluator = new JSR341Evaluator(inPackage, getAllParameters());
            inValue = evaluator.evaluate((String)inValue);
        }
        return inValue;
    }

}
