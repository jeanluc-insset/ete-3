package fr.insset.jeanluc.ete.xlang.impl;

import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.xlang.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class AllocationImpl  extends fr.insset.jeanluc.ete.xlang.impl.StatementImpl  implements Allocation {


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


