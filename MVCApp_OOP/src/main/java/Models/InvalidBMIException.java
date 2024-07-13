package Models;

public class InvalidBMIException  extends RuntimeException{
    
    @Override
    public String getMessage()
    {
        return "BMI Cannot be Negative";
    }
}
