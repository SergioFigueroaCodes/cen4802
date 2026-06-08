public class FibonacciCalculator {
    /**
     * Calculates the nth Fibonacci number using recursion.
     *
     * @param n the position in the Fibonacci sequence
     * @return the Fibonacci number at position n
     */
    public static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int term = 10;
        int result = fibonacci(term);

        System.out.println("The " + term +
                "th term of the Fibonacci sequence is " + result + ".");
    }
}