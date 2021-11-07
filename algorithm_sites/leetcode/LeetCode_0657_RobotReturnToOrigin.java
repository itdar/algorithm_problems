package algorithm_sites.leetcode;

public class LeetCode_0657_RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {
        int upDown = 0;
        int leftRight = 0;

        for (int i = 0; i < moves.length(); ++i) {
            if (moves.charAt(i) == 'R') {
                ++leftRight;
                continue;
            }

            if (moves.charAt(i) == 'L') {
                --leftRight;
                continue;
            }

            if (moves.charAt(i) == 'U') {
                ++upDown;
                continue;
            }

            if (moves.charAt(i) == 'D') {
                --upDown;
                continue;
            }
        }

        return (upDown == 0) && (leftRight == 0);
    }

}
