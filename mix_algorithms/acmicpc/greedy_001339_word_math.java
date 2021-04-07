package acmicpc;

import java.util.*;

// Process
// 1. Input word count, words
// 2. Prepare uppercase alphabet plate for asigning number(0~ 9)
// 3. 

public class greedy_001339_word_math {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int wordCount = sc.nextInt();
        String[] words = new String[wordCount];
        int longestLength = -1;
        int longestIndex = -1;
        for (int i = 0; i < wordCount; ++i) {
            words[i] = sc.next();
            // if (words[i].length() > longestLength) {
            //     longestIndex = i;
            //     longestLength = words[i].length();
            // }
        }

        int maxSum = 0;

        // char[][] wordsPlate = new char[words.length][longestLength];
        // for (int i = 0; i < words.length; ++i) {
        //     String word = words[i];
        //     for (int j = 0; j < longestLength - word.length(); ++j) {
        //         wordsPlate[i][j] = ' ';
        //     }
        //     int index = 0;
        //     for (int j = longestLength - word.length(); j < longestLength; ++j) {
        //         wordsPlate[i][j] = word.charAt(index++);
        //     }
        // }

        // for (int i = 0; i < wordsPlate.length; ++i) {
        //     for (int j = 0; j < wordsPlate[i].length; ++j) {
        //         System.out.print(wordsPlate[i][j] + " ");
        //     }
        //     System.out.println("");
        // }

        System.out.println(maxSum);
    }
}
