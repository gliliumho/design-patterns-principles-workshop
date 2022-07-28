package flyweight.with;

public class CarEx {
    private final ColorEx color;

    public CarEx(ColorEx color) {
        this.color = color;
    }

    public void draw(){
        System.out.printf("Drawn %s car %n", color);
    }
}
