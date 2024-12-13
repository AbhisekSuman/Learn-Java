package Class78.Task;

public class OverAgeException extends Exception{
    @Override
    public String getMessage() {
        return "This age is not valid according to Over Age restriction";
    }
}
