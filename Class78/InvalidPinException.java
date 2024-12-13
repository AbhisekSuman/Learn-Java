package Class78;

public class InvalidPinException extends Exception {
    @Override
    public String getMessage() {
        return "Wrong Pin. Please try again";
    }
}
