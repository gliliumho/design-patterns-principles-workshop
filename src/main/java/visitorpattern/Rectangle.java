package visitorpattern;

public class Rectangle implements Visitable {
    public double length;
    public double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);
    }
}
