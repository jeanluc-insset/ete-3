package fr.insset.jeanluc.gel.impl;


import fr.insset.jeanluc.gel.*;
import fr.insset.jeanluc.gel.Navigation;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Generated;



@Generated("ete - jean-luc@insset.fr  ete-toolchain/src/main/mda/modules/java/impl.vm")
public class AtPreImpl  extends fr.insset.jeanluc.gel.impl.NavigableImpl  implements AtPre {

    public AtPreImpl() {
    }


    //========================================================================//


    public String getSymbol() {
        return "@";
    }



    //========================================================================//
    //                A C C E S S O R S   and   M U T A T O R S               //
    //========================================================================//



    
    public  fr.insset.jeanluc.gel.Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation( fr.insset.jeanluc.gel.Navigation inValue) {
        navigation = inValue;
    }

    
    

    //========================================================================//
    //                           O P E R A T I O N S                          //
    //========================================================================//




    //========================================================================//
    //                   I N S T A N C E   V A R I A B L E S                  //
    //========================================================================//


        private  fr.insset.jeanluc.gel.Navigation navigation;
    




}


