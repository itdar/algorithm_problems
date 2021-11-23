package algorithm_sites.acmicpc;

import java.util.*;

// Process
// 1. Input N
// 2. Iterate under N
//  2.1. Check decompositionSum
//   2.1.1. If so -> Break, and set result
// 3. Print result

class DecompositionSum {

    public static void main(String[] args) {
        int result = 0;

        // 1.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 2.
        String strN = Integer.toString(n);
        int number = 1;

        // System.out.println(number);

        while (number < n) {
            if (checkIfDecompositionSum(number, n)) {
                result = number;
                break;
            }
            ++number;
        }

        // 3.
        System.out.println(result);
    }

    private static boolean checkIfDecompositionSum(int number, int n) {
        String strN = Integer.toString(number);

        int length = strN.length();
        for (int i = length-1; i >= 0; --i) {
            number += Integer.parseInt(strN.substring(i, i+1));
        }

        return number == n;
    }
    
}
