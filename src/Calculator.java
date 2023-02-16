public class Calculator {
    public static <T extends Number> double sum(final T firstNumber, final T secondNumber) {
        return firstNumber.doubleValue() + secondNumber.doubleValue(); }

    public static <T extends Number> double diff(final T firstNumber, final T secondNumber) {
        return firstNumber.doubleValue() - secondNumber.doubleValue(); }

    public static <T extends Number> double mltp(final T firstNumber, final T secondNumber) {
        return firstNumber.doubleValue() * secondNumber.doubleValue(); }

    public static <T extends Number> double devide(final T firstNumber, final T secondNumber) {
        return firstNumber.doubleValue() / secondNumber.doubleValue(); }

    public static double mltp(final CustomDouble firstNumber, final CustomDouble secondNumber) {
        return firstNumber.toDouble() * secondNumber.toDouble();}

    public static double devide(final CustomDouble firstNumber, final CustomDouble secondNumber) {
        return firstNumber.toDouble() / secondNumber.toDouble(); }
}