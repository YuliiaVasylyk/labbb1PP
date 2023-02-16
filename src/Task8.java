public class Task8 {
    public static void main(String[] args) {
        CustomDouble a = new CustomDouble(1, 0.6);
        CustomDouble b = new CustomDouble(0, 0.7);
        a.minus(b);
        a.sout();
        CustomDouble c = new CustomDouble(-3, 0.7);
        CustomDouble d = new CustomDouble(6, 0.2);
        c.minus(d);
        c.sout();
        CustomDouble a1 = new CustomDouble(1, 0.6);
        CustomDouble b1 = new CustomDouble(1, 0.6);
        if (a.moreEqualThan(b))
            System.out.println("true1");
        if (c.lessThan(d))
            System.out.println("true2");
        if (a1.equals(b1))
            System.out.println("true3");

    }
}
