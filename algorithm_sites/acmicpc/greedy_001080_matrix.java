package algorithm_sites.acmicpc;

import java.util.*;
import java.io.*;

// Process
// 1. Input n, m, matrixA,B
// 2. Check are matrixA,B same
// 3. Check n >= 3, m >= 3
// 4. Iterate 0 to n-2
//  4.1. Iterate 0 to m-2
//   4.1.1. Flip 3x3
//   4.1.2. Check if they are same now -> if so return count
// 5. Return count

class Matrix {

    public static boolean[][] flip3x3(boolean[][] boolMat, int col, int row) {
        for (int i = col; i < col+3; ++i) {
            for (int j = row; j < row+3; ++j) {
                boolMat[i][j] = !boolMat[i][j];
            }
        }
        return boolMat;
    }
    public static boolean checkAllSame(boolean[][] boolMat) {
        for (int i = 0; i < boolMat.length; ++i) {
            for (int j = 0; j < boolMat[i].length; ++j) {
                if (!boolMat[i][j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;

        // 1.
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] matrixA = new char[n][m];
        boolean[][] boolMat = new boolean[n][m];
		for (int i = 0; i < n; ++i) {
			String str = scanner.next();
			for (int j = 0; j < m; ++j)
				matrixA[i][j] = str.charAt(j);
		}
		for ( int i = 0; i < n; ++i) {
			String str = scanner.next();
			for ( int j = 0; j < m; ++j)
                if (matrixA[i][j] == str.charAt(j))
                    boolMat[i][j] = true;
                else
                    boolMat[i][j] = false;
		}

        // 2.
        boolean isAllSame = checkAllSame(boolMat);

        // 3.
        if ((n < 3 || m < 3) && !isAllSame)
            count = -1;

        // 4.
        if (!isAllSame) {
            for (int i = 0; !isAllSame && i < n-2; ++i) {
                for (int j = 0; !isAllSame && j < m-2; ++j) {
                    if (!boolMat[i][j]) {
                        boolMat = flip3x3(boolMat, i, j);
                        ++count;
                        isAllSame = checkAllSame(boolMat);
                    }
                }
            }
            if (!isAllSame)
                count = -1;
        }
        System.out.println(count);

        // System.out.println("=================");
        // System.out.println(count + "\t" + isAllSame);
        // System.out.println("=================");
        // for (int i = 0; i < n; ++i) {
        //     for (int j = 0; j < m; ++j) {
        //         System.out.print(matrixA[i][j] + " ");
        //     }
        //     System.out.println("");
        // }
        // for (int i = 0; i < n; ++i) {
        //     for (int j = 0; j < m; ++j) {
        //         System.out.print(boolMat[i][j] + " ");
        //     }
        //     System.out.println("");
        // }
    }
}
