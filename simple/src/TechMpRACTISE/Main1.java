package TechMpRACTISE;

import java.util.EnumSet;

// Enum for colors with associated RGB values
enum Colour {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    YELLOW(255, 255, 0),
    ORANGE(255, 165, 0),
    PURPLE(128, 0, 128);
	
    private final int red;
    private final int green;
    private final int blue;

    // Constructor to initialize the RGB values
    Colour(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    // Method to retrieve RGB values as a string
    public String getRGB() {
        return "(" + red + ", " + green + ", " + blue + ")";
    }
}

// Class to manage color palette and generate color schemes
class ColorPalette {
    private final EnumSet<Colour> palette;

    // Constructor initializes the palette
    public ColorPalette() {
        palette = EnumSet.noneOf(Colour.class);
    }

    // Method to add color to the palette
    public void addColor(Colour color) {
        palette.add(color);
    }

    // Method to generate a triadic color scheme based on a base color
    public EnumSet<Colour> generateTriadicScheme(Colour baseColor) {
        EnumSet<Colour> scheme = EnumSet.of(baseColor);
        Colour[] triadicColors = findTriadicColors(baseColor);
        for (Colour color : triadicColors) {
            scheme.add(color);
        }
        return scheme;
    }

    // Method to generate an analogous color scheme based on a base color
    public EnumSet<Colour> generateAnalogousScheme(Colour baseColor) {
        EnumSet<Colour> scheme = EnumSet.of(baseColor);
        Colour[] analogousColors = findAnalogousColors(baseColor);
        for (Colour color : analogousColors) {
            scheme.add(color);
        }
        return scheme;
    }

    // Private helper method to find the two triadic colors for a given base color
    private Colour[] findTriadicColors(Colour baseColor) {
        int index = baseColor.ordinal();
        Colour[] allColors = Colour.values();

        Colour firstTriadic = allColors[(index + 2) % allColors.length]; // 2 positions ahead
        Colour secondTriadic = allColors[(index + 4) % allColors.length]; // 4 positions ahead

        return new Colour[]{firstTriadic, secondTriadic};
    }

    // Private helper method to find the two analogous colors for a given base color
    private Colour[] findAnalogousColors(Colour baseColor) {
        int index = baseColor.ordinal();
        Colour[] allColors = Colour.values();

        Colour firstAnalogous = allColors[(index + 1) % allColors.length]; // 1 position ahead
        Colour secondAnalogous = allColors[(index + 5) % allColors.length]; // 5 positions ahead

        return new Colour[]{firstAnalogous, secondAnalogous};
    }
}

// Main class to run the program
public class Main1 {
    public static void main(String[] args) {
        // Create a new ColorPalette instance
        ColorPalette palette = new ColorPalette();

        // Add some colors to the palette
        palette.addColor(Colour.RED);
        palette.addColor(Colour.GREEN);
        palette.addColor(Colour.BLUE);
        Colour baseColor = Colour.RED;
        EnumSet<Colour> triadicScheme = palette.generateTriadicScheme(baseColor);
        System.out.println("Triadic Scheme: ");
        for (Colour color : triadicScheme) {
            System.out.println(color + " " + color.getRGB());
        }
        EnumSet<Colour> analogousScheme = palette.generateAnalogousScheme(baseColor);
        System.out.println("Analogous Scheme: ");
        for (Colour color : analogousScheme) {
            System.out.println(color + " " + color.getRGB());
        }
    }
}

