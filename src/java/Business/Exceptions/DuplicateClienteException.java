package Business.Exceptions;

/**
 *
 * @author Yesid Martinez
 */
// esta clase nos permite manejar la Excepción cuando un valor esta duplicado y no es permitido.
public class DuplicateClienteException extends Exception {

    public DuplicateClienteException(String message) {
        super(message);

    }
}
