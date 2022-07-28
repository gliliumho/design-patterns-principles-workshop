package flyweight.without;

public class Color {
    private String color;

    public Color(String color) {
        this.color = color;
        System.out.println("Color object created.");
    }

    @Override
    public String toString() {
        return color;
    }
}
