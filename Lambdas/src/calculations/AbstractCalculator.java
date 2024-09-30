package calculations;

public abstract class AbstractCalculator {
    protected CalculationOperation add;
    protected CalculationOperation subtract;
    protected CalculationOperation multiply;
    protected CalculationOperation divide;

    public AbstractCalculator(CalculationOperation add,
                              CalculationOperation subtract,
                              CalculationOperation multiply,
                              CalculationOperation divide) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public abstract CustomNumber add(CustomNumber a, CustomNumber b);

    public abstract CustomNumber subtract(CustomNumber a, CustomNumber b);

    public abstract CustomNumber multiply(CustomNumber a, CustomNumber b);

    public abstract CustomNumber divide(CustomNumber a, CustomNumber b);
}

