package visitorpattern;

import static java.lang.Math.PI;

public class AreaVisitor implements Visitor {
    private double area = 0;

    public double getArea() {
        return area;
    }

    @Override
    public void visitRectangle(Rectangle rect) {
        this.area += (rect.length * rect.width);
    }

    @Override
    public void visitCircle(Circle circle) {
        this.area += (Math.pow(circle.radius, 2) * PI);
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        this.area += (triangle.height * triangle.length) / 2;
    }
}
