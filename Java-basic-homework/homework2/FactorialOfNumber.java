public class FactorialOfNumber {
    public long factorialOfNumber(int n) {
        int factorialOfNumber;
        for (int i = n; i > 0; i--) {
            String formula = i + "*" + factorialOfNumber;
            factorialOfNumber = factorialOfNumber * i;
            System.out.println(formula);
        }
        return factorialOfNumber;
    }
    System.out.println(factorialOfNumber(10));
}