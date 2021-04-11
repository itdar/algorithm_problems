package algorithm_sites.acmicpc;

import java.io.*;

class AlphabetCount {
    public static void main(String args[]) throws IOException {
        int[] lowerCases = new int[26];
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();

        for (int i = 0; i < string.length(); ++i) {
            ++lowerCases[string.charAt(i) - 97];
        }
        
        for (int i = 0; i < lowerCases.length; ++i) {
            System.out.print(lowerCases[i] + " ");
        }
    }
}