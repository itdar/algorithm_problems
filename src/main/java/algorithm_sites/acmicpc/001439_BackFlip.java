package algorithm_sites.acmicpc;

// Process
// 1. String only containing 0 1
// 2. Iterate all
//  2.1. Count all countinuous area
// 3. Return count

// 시작과 끝이 같으면, 시작 그룹과 다른 그룹의 개수 반환 
// // e.g. 01011010 의 경우는 0 그룹 개수가 1 그룹 개수보다 1개 많음
// 시작과 끝이 다르면, 0, 1 아무 그룹 개수나 반환
// // e.g. 0101101 의 경우는 0 그룹 개수와 1 그룹 개수가 같음

import java.io.*;

class BackFlip {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = br.readLine();

        int count = 0;
        
        if (string.length() > 1) {
            for (int i = 1; i < string.length(); ++i) {
                if (string.charAt(i) == string.charAt(i-1)) {

                } else {
                    ++count;
                }
            }
        }
        
        System.out.println((count+1)/2);
        
    }
}
