public class CustomsValidationException extends Exception {
    public CustomsValidationException(String message) {
        super(message);
    }
} 

public class ValidationUtils {
    public static void validateNumber(int number) throws CustomsValidationException {
        if ( (number < 0)) {
            throw new CustomsValidationException("Number cannot be negative");
            
        }
    }
    public static void main(String[] args) {
        int number = -5;
        try {
            validateNumber(number);
            System.out.println("Number is valid: " + number);
        } catch (CustomsValidationException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }
}
