public class recursion {
    public static void main(String[] args) {
        int n = 10;
        double result = recursionFunc(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }

    public static double recursionFunc(int n) {
        if (n <= 1) {
            return n;
        }
        return recursionFunc(n - 1) + recursionFunc(n - 2);
    }
}
