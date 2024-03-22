package exceptions;

public class RiderNotFoundException extends CyclingException {
    public RiderNotFoundException(String message) {
        super(message);
    }
}