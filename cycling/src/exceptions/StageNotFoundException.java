package exceptions;

public class StageNotFoundException extends CyclingException {
    public StageNotFoundException(String message) {
        super(message);
    }
}
