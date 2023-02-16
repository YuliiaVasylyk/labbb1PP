public class Task1 {
    public static int numberOfSymbol(final String str, final char symbol) {
        return (int) str.chars().filter(ch -> ch == symbol).count();
    }

    public static boolean isGreatBySymbol(final String str1, final String str2, final char symbol) {
        return numberOfSymbol(str1, symbol) > numberOfSymbol(str2, symbol);
    }

    public static void main(final String[] args) {
        final String[] arr = {"viccd", "check", "crrr", "cccc", "collect", "call"};
        final char symbol = 'c';
        System.out.println("Before: ");
        outputResult(arr, symbol);
        sortBySymbol(arr, symbol);
        System.out.println();
        System.out.println("After: ");
        outputResult(arr, symbol);
    }

    public static void outputResult(final String[] strings, final char symbol) {
        for (final String str : strings) {
            System.out.println(str + " " + numberOfSymbol(str, symbol));
        }
    }

    public static void sortBySymbol(final String[] strings, final char symbol) {
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (isGreatBySymbol(strings[j], strings[j + 1], symbol)) {
                    final String tmp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = tmp;
                }
            }
        }
    }
}
