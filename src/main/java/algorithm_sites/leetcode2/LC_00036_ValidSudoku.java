package algorithm_sites.leetcode2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC_00036_ValidSudoku {

    private int[] xx = new int[] {-1,0,1};
    private int[] yy = new int[] {-1,0,1};

    private List<Integer> list;

    private int[][] centers = new int[][]
        {{1,1},{1,4},{1,7}
        ,{4,1},{4,4},{4,7}
        ,{7,1},{7,4},{7,7}};

    public boolean isValidSudoku(char[][] board) {
        list = Arrays.asList(1,2,3,4,5,6,6,7,8,9);

        for (int[] center : centers) {
            Set<Integer> set = new HashSet<>(list);
            for (int x : xx) {
                for (int y : yy) {
                    int a = center[0] + x;
                    int b = center[1] + y;

                    if (set.contains(Character.getNumericValue(board[a][b]))) {
                        set.remove(Character.getNumericValue(board[a][b]));
                    } else if (Character.getNumericValue(board[a][b]) == -1){
                    } else {
                        return false;
                    }
                }
            }
        }

        for (int i = 0; i < board.length; ++i) {
            Set<Integer> set = new HashSet<>(list);

            for (int j = 0; j < board[i].length; ++j) {
                if (set.contains(Character.getNumericValue(board[i][j]))) {
                    set.remove(Character.getNumericValue(board[i][j]));
                } else if (Character.getNumericValue(board[i][j]) == -1){
                } else {
                    return false;
                }
            }
        }

        for (int i = 0; i < board[0].length; ++i) {
            Set<Integer> set = new HashSet<>(list);

            for (int j = 0; j < board.length; ++j) {
                if (set.contains(Character.getNumericValue(board[j][i]))) {
                    set.remove(Character.getNumericValue(board[j][i]));
                } else if (Character.getNumericValue(board[j][i]) == -1){
                } else {
                    return false;
                }
            }
        }

        return true;
    }

}
