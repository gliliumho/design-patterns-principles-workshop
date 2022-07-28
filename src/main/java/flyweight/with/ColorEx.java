package flyweight.with;

public class ColorEx {
    private String color;

    public ColorEx(String color) {
        this.color = color;
        System.out.println("Color object created.");
    }

    @Override
    public String toString() {
        return color;
    }
}
