package pl.adrianbanka.Library.Exceptions;

public class PublicationAlreadyExistException extends RuntimeException {
    public PublicationAlreadyExistException(String message) {
        super(message);
    }
}
