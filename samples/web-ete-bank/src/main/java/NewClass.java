

/**
 *
 * @author jldeleage
 */
public class NewClass {

    public static <T> T newInstance(Class<T> t) throws InstantiationException, IllegalAccessException {
        return t.newInstance();
    }
}
