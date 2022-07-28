package flyweight.without;

public class Car {
    private final Color color;

    public Car(String colorName) {
        this.color = new Color(colorName);
    }

    public void draw() {
        System.out.printf("Drawn %s car %n", color);
    }

    public Color getColor() {
        return color;
    }
}
