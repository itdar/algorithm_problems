package algorithm_sites.programmers.kit202212;

import static java.lang.System.out;

import java.util.Arrays;

public class Programmers_DynamicProgramming_03 {

    public int solution(int m, int n, int[][] puddles) {
        int[][] plates = new int[n][m];
        int mod = 1_000_000_007;
        plates[0][0] = 1;

        for (int[] puddle : puddles) {
            plates[puddle[1] - 1][puddle[0] - 1] = -1;
        }

        for (int i = 0; i < plates.length; ++i) {
            for (int j = 0; j < plates[i].length; ++j) {
                if (plates[i][j] == -1) {
                    plates[i][j] = 0;
                    continue;
                }

                if (!(i == 0 && j == 0)) {
                    int left = 0;
                    int up = 0;

                    if (j > 0) {
                        left = plates[i][j-1];
                    }
                    if (i > 0) {
                        up = plates[i-1][j];
                    }

                    plates[i][j] = (up+left) % mod;
                }
            }
        }

//        out.println("\n\nnext");
//        for (int[] plate : plates) {
//            for (int i : plate) {
//                out.print(i + " ");
//            }
//            out.println();
//        }

        return plates[n-1][m-1] % mod;
    }

}
