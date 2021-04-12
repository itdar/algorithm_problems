package algorithm_sites.acmicpc;

import java.io.*;

class CheckPalindrome {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        boolean isPalindrome = true;
        for (int i = 0; isPalindrome && i < input.length() / 2; ++i) {
            if (input.charAt(i) != input.charAt(input.length()-1-i)) {
                isPalindrome = false;
            }
        }

        if (isPalindrome)
            System.out.println(1);
        else
            System.out.println(0);
    }
}