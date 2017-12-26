package fr.insset.jeanluc.gel.impl;

import fr.insset.jeanluc.gel.Navigation;
import fr.insset.jeanluc.gel.*;
import java.util.List;



public class AtPreImpl  extends fr.insset.jeanluc.gel.impl.NavigableImpl  implements AtPre {


    //========================================================================//


    public Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation(Navigation inValue) {
        navigation = inValue;
    }



    //========================================================================//


        private Navigation navigation;
    

}


