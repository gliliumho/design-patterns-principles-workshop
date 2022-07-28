package visitorpattern;

public interface Visitor {
    void visitRectangle(Rectangle rect);
    void visitCircle(Circle circle);
    void visitTriangle(Triangle triangle);
}
