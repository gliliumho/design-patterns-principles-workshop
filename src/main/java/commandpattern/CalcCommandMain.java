package commandpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CalcCommandMain {
    private static final String resultTemplate = "Result: ";

    public static void main(String[] args) {
        final List<Command> history = new ArrayList<>();
        final Stack<Command> undoStack = new Stack<>();
        final Calculator calculator = new Calculator();

        final Command addCommand1 = new AddCommand(calculator, 100);
        final Command undoCommand1 = new AddCommand(calculator, -100);
        addCommand1.execute();
        history.add(addCommand1);
        undoStack.add(undoCommand1);
        System.out.println(resultTemplate + calculator.getResult());

        final Command addCommand2 = new AddCommand(calculator, 33);
        final Command undoCommand2 = new AddCommand(calculator, -33);
        addCommand2.execute();
        history.add(addCommand2);
        undoStack.add(undoCommand2);
        System.out.println(resultTemplate + calculator.getResult());

        final Command undoCmd = undoStack.pop();
        undoCmd.execute();
        undoStack.pop().execute();
        System.out.println(resultTemplate + calculator.getResult());

    }
}
