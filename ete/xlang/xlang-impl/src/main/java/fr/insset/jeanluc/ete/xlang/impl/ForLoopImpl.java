package fr.insset.jeanluc.ete.xlang.impl;

import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class ForLoopImpl  extends fr.insset.jeanluc.ete.xlang.impl.LoopImpl  implements ForLoop {


    //========================================================================//


    public List<Statement> getInitialization() {
        return initialization;
    }

    public void setInitialization(List<Statement> inValue) {
        initialization = inValue;
    }
    public List<Statement> getIncrementation() {
        return incrementation;
    }

    public void setIncrementation(List<Statement> inValue) {
        incrementation = inValue;
    }



    //========================================================================//


    private List<Statement> initialization;
    private List<Statement> incrementation;


}


