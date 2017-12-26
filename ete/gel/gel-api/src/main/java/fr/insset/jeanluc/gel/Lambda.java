package fr.insset.jeanluc.gel;




public interface Lambda {


    //========================================================================//


        public Sequence<VariableDefinition> getvariables();
    public void setvariables(Sequence<VariableDefinition> inValue);
            public GelExpression getbody();
    public void setbody(GelExpression inValue);
    

}


