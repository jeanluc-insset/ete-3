package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.Navigation;
import fr.insset.jeanluc.ete.gel.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;



public class AtPreImpl  extends fr.insset.jeanluc.ete.gel.impl.NavigableImpl  implements AtPre {


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


