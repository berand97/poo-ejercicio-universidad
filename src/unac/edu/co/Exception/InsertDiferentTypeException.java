package unac.edu.co.Exception;

public class InsertDiferentTypeException extends Exception {
    private String message;

    public InsertDiferentTypeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
