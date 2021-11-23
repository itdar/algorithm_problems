package algorithm_sites.goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class CrossTheBridge {

    static int countBits(int n){
        int nn = n;
        int cnt = 0;
        while(n>0){
            if((n&1) == 1)
                cnt++;
            n = n/2;
        }
        n = nn;
        return cnt;
    }
    static int solveBridgeAndTorchProblem(int mask, int direction, int timeToCross[], int dp[][])
    {
        int n = timeToCross.length;
        // if nobody is left to transfer
        if (mask==0)
            return 0;
        if(dp[mask][direction]!=-1)
            return dp[mask][direction];
        int transferredMask = ((1<<n)-1)^mask;
        int res = 0;
        // transfer people from left to right (from destination to start)
        if(direction == 1) {
            int minRow = Integer.MAX_VALUE, person=0;
            for(int i = 0; i < n; ++i) {
                // choose the person with smallest time to cross bridge
                if((transferredMask & (1 << i)) > 0) {
                    if (minRow > timeToCross[i]) {
                        person = i;
                        minRow = timeToCross[i];
                    }
                }
            }
            // now send this person to let and solve for smaller problem
            res = timeToCross[person] + solveBridgeAndTorchProblem(mask|(1 << person),direction^1, timeToCross, dp);
        }
        else {
            // countBits() counts the bits in mask
            if (countBits(mask) == 1) {
                for (int i=0;i<n;++i) {
                    // since there is only a single person on starting side, return him
                    if((mask&(1<<i))!=0) {
                        res = timeToCross[i];
                        break;
                    }
                }
            }
            else {
                // find the minimum time by solving for each pair
                res = Integer.MAX_VALUE;
                for(int i=0;i<n;++i) {
                    // if ith person is not on right side, then do nothing
                    if((mask&(1<<i))== 0)
                        continue;
                    // else find another person and try to cross the bridge
                    for(int j=i+1;j<n;++j) {
                        if((mask&(1<<j))>0){
                            // time to cross the bridge for current pair
                            int val = Math.max(timeToCross[i], timeToCross[j]);
                            // solve for smaller subproblems
                            val += solveBridgeAndTorchProblem(mask^(1<<i)^(1<<j), direction^1,timeToCross,dp);
                            // update the answer
                            res = Math.min(res, val);
                        }
                    }
                }
            }
        }
        return dp[mask][direction] = res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] timeToCross = new int[n];
        for(int i=0;i<n;i++)
            timeToCross[i] = sc.nextInt();
        int dp[][] = new int[1<<20][2];
        for(int i=0;i<(1<<20);i++){
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        int mask = (1<<n)-1;
        int answer = solveBridgeAndTorchProblem(mask, 0, timeToCross, dp);
        System.out.println(answer);
    }
}
