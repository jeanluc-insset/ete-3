package fr.insset.jeanluc.ete.xlang.generator.impl;

import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.generator.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;



public class GeneratorImpl  implements Generator {


    //========================================================================//


    public List<Statement> getStatements(String inKey) {
        return statements.get(inKey);
    }
    public void setStatements(String inKey, List<Statement> inValue) {
        statements.put(inKey, inValue);
    }
        

    //========================================================================//


    private Map<String, List<Statement>> statements;


}


