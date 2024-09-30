package calculations;

public class ComplexCalculator extends AbstractCalculator{
    public ComplexCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);
    }

    @Override
    public CustomNumber add(CustomNumber a, CustomNumber b) {
        return add.calc(a, b);
    }

    @Override
    public CustomNumber subtract(CustomNumber a, CustomNumber b) {
        return subtract.calc(a, b);
    }

    @Override
    public CustomNumber multiply(CustomNumber a, CustomNumber b) {
        return multiply.calc(a, b);
    }

    @Override
    public CustomNumber divide(CustomNumber a, CustomNumber b) {
        return divide.calc(a, b);
    }
}
