package visitorpattern;

public class Triangle implements Visitable {
    public double length;
    public double height;

    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTriangle(this);
    }
}
