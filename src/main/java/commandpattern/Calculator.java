package commandpattern;

public class Calculator {
    private int result = 0;

    public Calculator() {
        this.result = 0;
    }

    public void add(final int num) {
        this.result += num;
    }

    public int getResult() {
        return this.result;
    }
}
