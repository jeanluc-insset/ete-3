package fr.insset.jeanluc.gel;




public interface Navigation {


    //========================================================================//


        public Feature gettoFeature();
    public void settoFeature(Feature inValue);
            public Navigable getfrom();
    public void setfrom(Navigable inValue);
            public Sequence<GelExpression> getparameter();
    public void setparameter(Sequence<GelExpression> inValue);
    


}


