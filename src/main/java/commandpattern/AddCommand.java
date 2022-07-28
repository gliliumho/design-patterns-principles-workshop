package commandpattern;

public class AddCommand implements Command {
    private final Calculator calc;
    private final int operator;

    public AddCommand(Calculator calc, int operator) {
        this.calc = calc;
        this.operator = operator;
    }

    @Override
    public void execute() {
        calc.add(operator);
    }

    @Override
    public String toString() {
        return String.format("Add %d to %s", operator, calc.toString());
    }
}
