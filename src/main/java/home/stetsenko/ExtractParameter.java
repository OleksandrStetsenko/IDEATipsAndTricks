package home.stetsenko;

/**
 * CTRL+ALT+P - extract parameter
 * CTRL+ALT+C - extract constant
 */
public class ExtractParameter {

    public static void print() {
        System.out.println(generateText());
    }

    private static String generateText() {
        return "Hello, World!".toUpperCase();
    }

}
