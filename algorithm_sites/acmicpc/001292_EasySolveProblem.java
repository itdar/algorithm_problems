package algorithm_sites.acmicpc;

import java.io.*;

class EasySolveProblem {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        
        int sum = 0;
        
        boolean isDone = false;
        int i = 1;
        int n = 1;
        while (i <= 1000 && !isDone) {
            for (int k = 0; k < n && !isDone; ++k) {
                if (i >= start && i <= end) {
                    sum += n;
                } else if (i > end) {
                    isDone = true;
                }
                
                ++i;
            }
            ++n;
        }
        
        System.out.println(sum);
    }
}