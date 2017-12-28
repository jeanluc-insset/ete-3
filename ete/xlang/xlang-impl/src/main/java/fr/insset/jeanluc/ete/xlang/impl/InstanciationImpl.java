package fr.insset.jeanluc.ete.xlang.impl;

import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.xlang.*;
import java.util.List;



public class InstanciationImpl  extends fr.insset.jeanluc.gel.impl.GelExpressionImpl  implements Instanciation {


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


