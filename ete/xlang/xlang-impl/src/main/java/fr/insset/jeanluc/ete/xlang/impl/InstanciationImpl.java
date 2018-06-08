package fr.insset.jeanluc.ete.xlang.impl;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.xlang.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class InstanciationImpl  extends fr.insset.jeanluc.ete.gel.impl.GelExpressionImpl  implements Instanciation {


    //========================================================================//


    public MofClass getMofClass() {
        return mofClass;
    }

    public void setMofClass(MofClass inValue) {
        mofClass = inValue;
    }






    //========================================================================//


    private MofClass mofClass;


}


