public class Task3 {
    public static void main(String[] args) {
        final int b = factRec(5);
        final int a = factorial(5);
        System.out.println("5!= " +a);
        System.out.println("rec 5!= " + b);
    }
    public static int factRec(final int a){

        if (a == 1){

            return 1;
        }
        return a * factorial(a - 1);
    }
    static int factorial(final int a){
        int result=1;
        for (int i = 1; i <= a; i++)
        {
            result *= i;
        }
        return  result;
    }
}

