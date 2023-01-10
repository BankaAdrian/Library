package pl.adrianbanka.Library.Exceptions;

    public class InvalidDataException extends RuntimeException {
        public InvalidDataException(String message) {
            super(message);
        }
    }
