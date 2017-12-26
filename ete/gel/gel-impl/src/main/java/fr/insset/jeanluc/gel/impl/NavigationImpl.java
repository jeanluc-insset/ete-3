package fr.insset.jeanluc.gel.impl;


import fr.insset.jeanluc.gel.*;


public class NavigationImpl implements Navigation {


    //========================================================================//


        public Feature gettoFeature() {
        return toFeature;
    }

    public void settoFeature(Feature inValue) {
        toFeature = inValue;
    }
            public Navigable getfrom() {
        return from;
    }

    public void setfrom(Navigable inValue) {
        from = inValue;
    }
            public Sequence<GelExpression> getparameter() {
        return parameter;
    }

    public void setparameter(Sequence<GelExpression> inValue) {
        parameter = inValue;
    }
    

    //========================================================================//


        private Feature toFeature;
            private Navigable from;
            private Sequence<GelExpression> parameter;
    

}


