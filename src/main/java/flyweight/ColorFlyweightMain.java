package flyweight;

import flyweight.with.CarEx;
import flyweight.with.ColorFactory;
import flyweight.without.Car;

public class ColorFlyweightMain {
    public static void main(String[] args) {
        //without flyweight
        final Car car1 = new Car("Red");
        final Car car2 = new Car("Green");
        final Car car3 = new Car("Red");
        car1.draw();
        car2.draw();
        car3.draw();

        //with flyweigth
        final ColorFactory clrFactory = new ColorFactory();
        final CarEx carEx1 = new CarEx(clrFactory.get("Red"));
        final CarEx carEx2 = new CarEx(clrFactory.get("Green"));
        final CarEx carEx3 = new CarEx(clrFactory.get("Red"));
        carEx1.draw();
        carEx2.draw();
        carEx3.draw();


    }
}
