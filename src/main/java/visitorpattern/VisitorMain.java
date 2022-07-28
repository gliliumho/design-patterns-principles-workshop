package visitorpattern;

import java.util.ArrayList;
import java.util.List;

public class VisitorMain {
    public static void main(String[] args) {
        //user code
        List<Visitable> shapes = new ArrayList<>();
        shapes.add(new Rectangle(5, 2));
        shapes.add(new Circle(3));
        shapes.add(new Triangle(4, 2));
        //...Add more shapes in random seq

        final AreaVisitor areaVisitor = new AreaVisitor();
        for (Visitable shape : shapes) {
            shape.accept(areaVisitor);
        }
        final double area = areaVisitor.getArea();
        System.out.println(area);
    }
}
