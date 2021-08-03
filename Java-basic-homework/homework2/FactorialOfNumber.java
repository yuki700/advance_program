public class FactorialOfNumber {
    public static long factorialOfNumber(int n) {
        int factorialOfNumber = 1;
        for (int i = n; i > 0; i--) {
            String formula = i + "*" + factorialOfNumber;
            factorialOfNumber = factorialOfNumber * i;
            System.out.println(formula);
        }
        return factorialOfNumber;
    }
    public static void main(String[] args) {
        System.out.println("factorialOfNumber is " + factorialOfNumber(10));
    }
}