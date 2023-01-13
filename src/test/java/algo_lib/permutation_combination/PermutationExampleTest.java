package algo_lib.permutation_combination;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PermutationExampleTest {

    static int num = 0;

    @Test
    void test1() {
        int[] arr = {1,2,3};
        int n = arr.length;
        int r = 2;

        int[] output = new int [n];
        boolean[] visited = new boolean [n];

        //순열 (순서가 중요함, 순서가 영향을 끼침 (1,2 != 2,1) )
        System.out.println("*** 배열 중에 r 개 순열 ***");
        PermutationExample.permutation(arr, output, visited, 0, n, r);

        num = 0;

        //중복순열 (순서있게 배열 + 자기자신도 포함)
        System.out.println("*** 배열 중에 r 개 중복순열 ***");
        PermutationExample.rePermutation(arr, output, 0, n, r);
    }

}
