package algorithm_sites.acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acmicpc_018868_MultiVerse {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputStrings = br.readLine().split(" ");
        int m = Integer.parseInt(inputStrings[0]);
        int n = Integer.parseInt(inputStrings[1]);

        int[][] inputs = new int[m][n];
        for (int j = 0; j < m; ++j) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < n; ++i) {
                inputs[j][i] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        int[][][] compares = new int[m][n][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    if (inputs[i][j] == inputs[i][k]) {
                        compares[i][j][k] = Status.SAME.value;
                    } else if (inputs[i][j] > inputs[i][k]) {
                        compares[i][j][k] = Status.GT.value;
                    } else { // inputs[i][j] < inputs[i][k]
                        compares[i][j][k] = Status.LT.value;
                    }
                }
            }
        }

        int count = 0;

        int[][] current;
        boolean isSame;
        boolean found;
        for (int i = 0; i < m; ++i) {

            current = compares[i];

            for (int g = i+1; g < m; ++g) {

                isSame = true;

                for (int j = 0; j < n; ++j) {
                    for (int k = 0; k < n; ++k) {
                        if (current[j][k] != compares[g][j][k]) {
                            isSame = false;
                            break;
                        }
                    }
                }

                if (isSame) {
                    ++count;
                }
            }

        }

        System.out.println(count);
    }

    enum Status {
        SAME(1), GT(2), LT(3);

        private final int value;

        Status(int value) {
            this.value = value;
        }
    }
}
