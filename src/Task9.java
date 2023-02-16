public class Task9 {
    public static void main(String[] args) {
        CustomDouble a = new CustomDouble(1, 0.5);
        CustomDouble b = new CustomDouble(2, 0.3);
        a.plus(b);
        System.out.println(Calculator.devide(a, b));
        System.out.println(Calculator.mltp(a, b));
        System.out.println(Calculator.sum(1.2, 1.2));
    }
}
