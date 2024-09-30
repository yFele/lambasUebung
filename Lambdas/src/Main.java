import NumberTester.NumberTester;

public class Main {

    public static void main(String[] args) {
    numberTester();
    }

    private static void numberTester() {
        NumberTester tester = new NumberTester("C:\\Users\\User\\Desktop\\2024,25\\POS\\Lambdas\\Hausuebung\\lambasUebung\\Lambdas\\src\\NumberTester\\text.csv");
        tester.setOddEvenTester(number -> number % 2 == 0);
        tester.setPrimeTester(number -> {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        });
        tester.setPalindromeTester(number -> {
            String reversed = new StringBuilder(String.valueOf(number)).reverse().toString(); // dreht String um -> wenn gleich ist es ein Palindrom
            return String.valueOf(number).equals(reversed);
        });
        tester.testFile();
    }










}
