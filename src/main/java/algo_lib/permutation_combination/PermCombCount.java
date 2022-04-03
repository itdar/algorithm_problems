package algo_lib.permutation_combination;

public class PermCombCount {

    /**
     *  중복없는
     *  순열 개수 (nPr)
     */
    public int permCountOf(int n, int r) {
        return factorial(n) / factorial(n-r);
    }

    /**
     *  중복가능
     *  순열 개수 (n^r)
     */
    public int permRepetCountOf(int n, int r) {
        return (int) Math.pow(n, r);
    }

    /**
     *  중복없는
     *  조합 개수 (nCr)
     */
    public int combCountOf(int n, int r) {
        int tempN = 1;
        int tempR = 1;

        for (int i = 0; i < (n-r); ++i) {
            tempN *= (n-i);
        }

        for (int i = 1; i <= (n-r); ++i) {
            tempR *= i;
        }

        return tempN / tempR;
    }

    /**
     *  중복가능
     *  조합 개수 (nHr)
     */
    public int combRepetCountOf(int n, int r) {
        return combCountOf(n+r-1, r);
    }

    public int factorial(int number) {
        int result = 1;

        for (int i = 1; i <= number; ++i) {
            result *= i;
        }

        return result;
    }

}
