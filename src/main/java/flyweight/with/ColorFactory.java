package flyweight.with;

import java.util.ArrayList;
import java.util.List;

public class ColorFactory {
    private List<ColorEx> colors = new ArrayList<>();

    public ColorEx get(String color) {
        for (final ColorEx clr : colors) {
            if (clr.toString().equalsIgnoreCase(color)) {
                return clr;
            }
        }
        final ColorEx newColor = new ColorEx(color);
        colors.add(newColor);
        return newColor;
    }
}
