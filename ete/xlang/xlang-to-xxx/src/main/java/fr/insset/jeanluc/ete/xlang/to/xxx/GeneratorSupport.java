

package fr.insset.jeanluc.ete.xlang.to.xxx;

import fr.insset.jeanluc.el.dialect.JavaDialect;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jldeleage
 */
public class GeneratorSupport extends DynamicVisitorSupport implements Generator, JavaDialect {

    public GeneratorSupport() {
        this("    ");
    }

    public GeneratorSupport(String indentation) {
        this.indentation = indentation;
    }


    public final void setSymbol(Class inClass, String inSymbol) {
        symbols.put(inClass, inSymbol);
    }

    @Override
    public String getSymbol(NamedElement anObject) {
        Class inClass = anObject.getClass();
        String symbol = getSymbol(inClass);
        if (symbol != null) {
            return symbol;
        }
        try {
            Method method = inClass.getMethod("getSymbol", new Class[0]);
            return (String) method.invoke(anObject, new Object[0]);
        } catch (NoSuchMethodException | SecurityException
                    | IllegalAccessException | IllegalArgumentException
                    | InvocationTargetException ex) {
            Logger.getLogger(GeneratorSupport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return " ";
    }


    public String getSymbol(Class inClass) {
        String symbol = symbols.get(inClass);
        if (symbol != null) {
            return symbol;
        }
        Class superclass = inClass.getSuperclass();
        if (superclass != null) {
            symbol = getSymbol(superclass);
            if (symbol != null) {
                return symbol;
            }
        }
        Class[] interfaces = inClass.getInterfaces();
        for (Class aClass : interfaces) {
            symbol = getSymbol(aClass);
            if (symbol != null) {
                return symbol;
            }
        }
        return null;
    }



    private     Map<Class, String>  symbols = new HashMap<>();
    private     String              indentation;

}
