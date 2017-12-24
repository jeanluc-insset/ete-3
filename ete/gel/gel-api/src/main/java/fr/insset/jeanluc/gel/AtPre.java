package fr.insset.jeanluc.gel;

// New release using a dialect and dependances
import fr.insset.jeanluc.gel.Navigation;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;



@Generated("ete - jean-luc@insset.fr  ete-toolchain/src/main/mda/modules/java/api.vm")
public interface AtPre  extends fr.insset.jeanluc.gel.Navigable  {


    public default String getSymbol() {
        return "@";
    }


    //========================================================================//


        // fr.insset.jeanluc.gel
    // 
        public Navigation getNavigation();
    public void setNavigation(Navigation inValue);


}