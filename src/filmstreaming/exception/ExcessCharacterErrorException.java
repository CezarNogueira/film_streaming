package filmstreaming.exception;

public class ExcessCharacterErrorException extends RuntimeException {
    private String message;

    public ExcessCharacterErrorException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
