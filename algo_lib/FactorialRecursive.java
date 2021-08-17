package algo_lib;

public class FactorialRecursive {

    public static void main(String args[]) {
        int n = 5;

        int result = recursiveFactorial(n);

        System.out.println(result);
    }

    public static int recursiveFactorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * recursiveFactorial(n-1);
    }

}
