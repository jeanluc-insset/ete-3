package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.Nav;
import fr.insset.jeanluc.ete.gel.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;



public class AtPreImpl  extends fr.insset.jeanluc.ete.gel.impl.NavigableImpl  implements AtPre {


    //========================================================================//


    public Nav getNavigation() {
        return navigation;
    }

    public void setNavigation(Nav inValue) {
        navigation = inValue;
    }


    //========================================================================//


    private Nav navigation;


}


