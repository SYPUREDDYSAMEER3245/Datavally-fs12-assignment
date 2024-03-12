public class DivisionHandler {
    public static void main (String[] args) {
        int numerator = 10;
        int denominator = 0;
        try {
            divideNumbers(numerator, denominator);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        }
        int result = numerator / denominator;
        System.out.println("Result of division: " + result);
    }
}
