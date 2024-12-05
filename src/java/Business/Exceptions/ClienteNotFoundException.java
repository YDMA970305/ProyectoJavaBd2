package Business.Exceptions;

/**
 *
 * @author Yesid Martinez
 */
// esta clase nos permite manejar las excepciones en caso de que no se encuentre un cliente
public class ClienteNotFoundException extends Exception {

    public ClienteNotFoundException(String message) {
        super(message);
    }

}
