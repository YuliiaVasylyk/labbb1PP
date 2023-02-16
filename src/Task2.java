public class Task2 {
    public static void main(final String[] args) {
        String string = "absolute";
        System.out.println("Word before: " + string);
        final char symbol = 'b';
        System.out.println("Given symbol: " + symbol);
        string = string.replaceAll(String.valueOf(symbol), "");
        System.out.println("Word after: " + string);
    }
}