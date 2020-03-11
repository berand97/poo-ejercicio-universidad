package unac.edu.co.Exception;

public class InsufficientNoteException extends Exception {
    private String message;

    public InsufficientNoteException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
