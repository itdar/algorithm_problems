package codility;

public class Fibonacci {

    public static int fib(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;

        return fib(num-2) + fib(num-1);
    }

    public static void main(String args[]) {
        // 0 1 2 3 5  8 13 21 34 55
//        int result = fib(10);
        int result = fibDynamic(10);

        System.out.println(result);
    }

    public static int fibDynamic(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;

        int[] plate = new int[num+1];
        plate[1] = 1;

        for (int i = 2; i < plate.length; ++i) {
            plate[i] = plate[i-2] + plate[i-1];
        }

        return plate[num];
    }

}
