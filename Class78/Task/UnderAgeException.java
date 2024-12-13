package Class78.Task;

public class UnderAgeException extends Exception{
    @Override
    public String getMessage() {
        return "Age is not for marriage";
    }
}
