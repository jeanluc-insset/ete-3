package fr.insset.jeanluc.ete.api;

/**
 *
 * @author jldeleage
 */
public class EteException extends Exception {

    public EteException() {
    }

    public EteException(String message) {
        super(message);
    }

    public EteException(String message, Throwable cause) {
        super(message, cause);
    }

    public EteException(Throwable cause) {
        super(cause);
    }

    public EteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
