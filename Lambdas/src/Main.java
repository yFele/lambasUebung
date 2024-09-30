import NumberTester.NumberTester;
import calculations.ComplexCalculator;
import calculations.CustomNumber;
import calculations.RationalCalculator;
import calculations.VectorCalculator;

import java.util.Scanner;

public class Main {

    static RationalCalculator rationalCalculator;
    static ComplexCalculator complexCalculator;
    static VectorCalculator vectorCalculator;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
   // numberTester();
        calc();
    }



    private static int OperationMenu(String calculator) {
        System.out.println(calculator);
        System.out.println("Choose Operation: ");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        return Integer.parseInt(scanner.nextLine());
    }

    private static int CalculatorMenu() {
        System.out.println("Choose Calculator: ");
        System.out.println("1 - RationalCalculator");
        System.out.println("2 - VectorCalculator");
        System.out.println("3 - ComplexCalculator");
        System.out.println("4 - Exit");
        return Integer.parseInt(scanner.nextLine());
    }

    private static void ResultRational(CustomNumber result) {
        System.out.println("Result: ");
        System.out.println("ex " + result.getA());
        System.out.println("ey " + result.getB());
        System.out.println();
    }

    private static void ResultComplex(CustomNumber result) {
        System.out.println("Result: ");
        System.out.println(result.getA() + " + " + result.getB() + "i");
        System.out.println();
    }

    private static void ResultVector(CustomNumber result) {
        System.out.println("Result: ");
        System.out.println(result.getA());
        System.out.println(result.getB());
        System.out.println();
    }

    private static CustomNumber[] getNumbersRational() {
        System.out.println("Enter x a: ");
        double xA = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter x b: ");
        double xB = Double.parseDouble(scanner.nextLine());
        CustomNumber x = new CustomNumber(xA, xB);
        System.out.println("Enter y a: ");
        double yA = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter y b: ");
        double yB = Double.parseDouble(scanner.nextLine());
        CustomNumber y = new CustomNumber(yA, yB);
        System.out.println();
        return new CustomNumber[]{x, y};
    }

    private static CustomNumber[] getNumbersComplex() {
        System.out.println("Enter first real part number: ");
        double xA1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter first imaginary part number: ");
        double xB1 = Double.parseDouble(scanner.nextLine());
        CustomNumber x1 = new CustomNumber(xA1, xB1);
        System.out.println("Enter second real part number: ");
        double yA1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter second imaginary part number: ");
        double yB1 = Double.parseDouble(scanner.nextLine());
        CustomNumber y1 = new CustomNumber(yA1, yB1);
        System.out.println();
        return new CustomNumber[]{x1, y1};
    }

    private static CustomNumber[] getNumbersVector() {
        System.out.println("Enter first vector upper: ");
        double xA2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter first vector lower: ");
        double xB2 = Double.parseDouble(scanner.nextLine());
        CustomNumber x2 = new CustomNumber(xA2, xB2);
        System.out.println("Enter second vector upper: ");
        double yA2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter second vector lower: ");
        double yB2 = Double.parseDouble(scanner.nextLine());
        CustomNumber y2 = new CustomNumber(yA2, yB2);
        System.out.println();
        return new CustomNumber[]{x2, y2};
    }

    private static void setCalculatorLambdas() {
        rationalCalculator = new RationalCalculator((a, b) -> {

            return new CustomNumber(a.getA() + b.getA(), a.getB());
        }, (a, b) -> {

            return new CustomNumber(a.getA() - b.getA(), a.getB());
        }, (a, b) -> new CustomNumber(a.getA() * b.getA(), a.getB() * b.getB()), (x, y) -> {
            double zaehler = x.getA() * y.getB();
            double nenner = x.getB() * y.getA();
            return new CustomNumber(zaehler, nenner);
        });
        complexCalculator = new ComplexCalculator((a, b) -> new CustomNumber(a.getA() + b.getA(), a.getB() + b.getB()), (a, b) -> new CustomNumber(a.getA() - b.getA(), a.getB() - b.getB()), (a, b) -> new CustomNumber(a.getA() * b.getA(), a.getB() * b.getB()), (a, b) -> new CustomNumber(a.getA() / b.getA(), a.getB() / b.getB()));
        //vectorCalculator = new VectorCalculator((a, b) -> new CustomNumber(a.getA() + b.getA(), a.getB() + b.getB()), (a, b) -> new CustomNumber(a.getA() - b.getA(), a.getB() - b.getB()), (a, b) -> new CustomNumber(a.getA() * b.getB() - b.getA() * a.getB()),
       //         (a, b) -> new CustomNumber(a.getA() * b.getA() + a.getB() * b.getB())); 
    }

    public static void calc() {
        int calculator = CalculatorMenu();
        System.out.println();
        switch (calculator) {
            case 1:
                int choice = OperationMenu("RationalCalculator");
                System.out.println();
                CustomNumber[] numbers = getNumbersRational();
                switch (choice) {
                    case 1: //add
                        CustomNumber result = rationalCalculator.add(numbers[0], numbers[1]);
                        ResultRational(result);
                        break;
                    case 2: //subtract
                        CustomNumber result1 = rationalCalculator.subtract(numbers[0], numbers[1]);
                        ResultRational(result1);
                        break;

                    case 3: //multiply
                        CustomNumber result2 = rationalCalculator.multiply(numbers[0], numbers[1]);
                        ResultRational(result2);
                        break;

                    case 4: //divide
                        CustomNumber result3 = rationalCalculator.divide(numbers[0], numbers[1]);
                        ResultRational(result3);
                        break;
                }
                break;
            case 3:
                int choice1 = OperationMenu("ComplexCalculator");
                CustomNumber[] numbers1 = getNumbersComplex();
                switch (choice1) {
                    case 1: //add
                        CustomNumber result = complexCalculator.add(numbers1[0], numbers1[1]);
                        ResultComplex(result);
                        break;
                    case 2: //subtract
                        CustomNumber result1 = complexCalculator.subtract(numbers1[0], numbers1[1]);
                        ResultComplex(result1);
                        break;

                    case 3: //multiply
                        CustomNumber result2 = complexCalculator.multiply(numbers1[0], numbers1[1]);
                        ResultComplex(result2);
                        break;

                    case 4: //divide
                        CustomNumber result3 = complexCalculator.divide(numbers1[0], numbers1[1]);
                        ResultComplex(result3);
                        break;
                }
                break;
            case 2:
                int choice2 = OperationMenu("VectorCalculator");
                CustomNumber[] numbers2 = getNumbersVector();
                switch (choice2) {
                    case 1: //add
                        CustomNumber result = vectorCalculator.add(numbers2[0], numbers2[1]);
                        ResultVector(result);
                        break;

                    case 2: //subtract
                        CustomNumber result1 = vectorCalculator.subtract(numbers2[0], numbers2[1]);
                        ResultVector(result1);
                        break;

                    case 3: //multiply
                        CustomNumber result2 = vectorCalculator.multiply(numbers2[0], numbers2[1]);
                        ResultVector(result2);
                        break;

                    case 4: //divide
                        CustomNumber result3 = vectorCalculator.divide(numbers2[0], numbers2[1]);
                        ResultVector(result3);
                        break;
                }
                break;
            case 4:
                System.out.println("Exit");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }





}
