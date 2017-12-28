package fr.insset.jeanluc.ete.as.impl;


// import fr.insset.jeanluc.ete.meta.model.emof.Feature;
// import fr.insset.jeanluc.ete.meta.model.types.impl.TypedElementImpl;
import fr.insset.jeanluc.ete.as.*;
// import fr.insset.jeanluc.gel.GelExpression;
// import fr.insset.jeanluc.gel.impl.NavigableImpl;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Generated;



@Generated("ete - jean-luc@insset.fr  ete-toolchain/src/main/mda/modules/java/impl.vm")
public class ForLoopImpl  extends fr.insset.jeanluc.ete.as.impl.LoopImpl  implements ForLoop {

    public ForLoopImpl() {
    }


    //========================================================================//





    //========================================================================//
    //                A C C E S S O R S   and   M U T A T O R S               //
    //========================================================================//



    
    public List<Statement> getInitialization() {
        return initialization;
    }

    public void setInitialization(List<Statement> inValue) {
        initialization = inValue;
    }

        public void addInitialization(Statement inValue) {
        initialization.add(inValue);
    }
    
        
    public List<Statement> getIncrementation() {
        return incrementation;
    }

    public void setIncrementation(List<Statement> inValue) {
        incrementation = inValue;
    }

        public void addIncrementation(Statement inValue) {
        incrementation.add(inValue);
    }
    
    

    //========================================================================//
    //                           O P E R A T I O N S                          //
    //========================================================================//




    //========================================================================//
    //                   I N S T A N C E   V A R I A B L E S                  //
    //========================================================================//


        private List<Statement> initialization = new LinkedList<>();
            private List<Statement> incrementation = new LinkedList<>();
    




}


