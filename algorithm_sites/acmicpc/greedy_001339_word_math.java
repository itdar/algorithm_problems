package algorithm_sites.acmicpc;

import java.util.*;

// Process
// 1. Input countWord, words
// 2. Make alphabet weight array
// 3. 모든 문자열(words string)의 모든 문자(char)들을 확인한다 
//  3.1. 문자들(char)이 있는 자릿수 위치에 맞게 가중치를 더해주며 weight array 채운다.
// 4. 각 문자들의 가중치에 맞게 숫자를 부여한다.
// 5. 문자들을 숫자로 바꾼다.
// 6. 숫자들 합을 구한다.
// 7. 합을 반환한다.

class WordMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.
        int countWord = sc.nextInt();
        int[] lenWords = new int[countWord];
        String[] words = new String[countWord];
        int maxLength = -1;
        for (int i = 0; i < countWord; ++i) {
            words[i] = sc.next();
            lenWords[i] = words[i].length();
            if (maxLength < lenWords[i]) {
                maxLength = lenWords[i];
            }
        }

        // 2. 3.
        int[] alphabetWeights = new int[26];
        for (int i = 0; i < words.length; ++i) {
            for (int j = 0; j < words[i].length(); ++j) {
                alphabetWeights[words[i].charAt(j) - 65] += Math.pow(10, (words[i].length()-1 - j));
            }
        }

        // 4.
        int[] alphabetNumber = new int[26];
        int number = 9;
        for (int i = 0; i < alphabetWeights.length; ++i) {
            int max = 0;
            int maxIndex = -1;
            for (int j = 0; j < alphabetWeights.length; ++j) {
                if (max < alphabetWeights[j]) {
                    maxIndex = j;
                    max = alphabetWeights[j];
                }
            }
            if (maxIndex >= 0) {
                alphabetWeights[maxIndex] = 0;
                alphabetNumber[maxIndex] = number--;
            }
        }

        // 4. 5.
        int maxSum = 0;
        for (int i = 0; i < words.length; ++i) {
            StringBuilder sb = new StringBuilder("");
            for (int j = 0; j < words[i].length(); ++j) {
                sb.append(alphabetNumber[words[i].charAt(j) - 65]);
            }
            maxSum += Integer.parseInt(sb.toString());
        }

        System.out.println(maxSum);

        // System.out.println("");
        // for (int i = 0; i < alphabetWeights.length; ++i) {
        //     System.out.print(alphabetWeights[i] + " ");
        // }System.out.println("");

    }
}

// // 틀린 것 - 처음에 각 숫자별로 여러자리에 나와서 총합에 영향 주는 것을 고려하지 않음.
// // Process
// // 1. Input countWord, words
// // 2. 알파벳별 숫자 치환표를 준비한다.
// // 3. 입력 받은 단어들로 치환표를 채운다.
// // 4. 입력 받은 단어들과 치환표를 이용해서 숫자 만든다.
// // 5. 최대 숫자들 더한다.
// // 4. 더한 최대합 반환한다.

// class WordMath {
//     public static void main(String args[]) {
        
//         Scanner sc = new Scanner(System.in);

//         // 1.
//         int countWord = sc.nextInt();
//         int[] lenWords = new int[countWord];
//         String[] words = new String[countWord];
//         int maxLength = -1;
//         for (int i = 0; i < countWord; ++i) {
//             words[i] = sc.next();
//             lenWords[i] = words[i].length();
//             if (maxLength < lenWords[i]) {
//                 maxLength = lenWords[i];
//             }
//         }

//         // 2.
//         int[] alphabetNumber = new int[26];
//         for (int i = 0; i < alphabetNumber.length; ++i) {
//             alphabetNumber[i] = -1;
//         }

//         // 3.
//         int currentNumber = 9;
//         while (maxLength > 0) {
//             for (int i = 0; i < words.length; ++i) {
//                 if (words[i].length() - maxLength >= 0) {
//                     if (alphabetNumber[words[i].charAt(words[i].length() - maxLength) - 65] < 0) {
//                         alphabetNumber[words[i].charAt(words[i].length() - maxLength) - 65] = currentNumber;
//                         --currentNumber;
//                     }
//                 }
//             }
//             --maxLength;
//         }

//         // 4. 5.
//         int maxSum = 0;
//         for (int i = 0; i < words.length; ++i) {
//             StringBuilder sb = new StringBuilder("");
//             for (int j = 0; j < words[i].length(); ++j) {
//                 sb.append(alphabetNumber[words[i].charAt(j) - 65]);
//             }
//             maxSum += Integer.parseInt(sb.toString());
//         }

//         // System.out.println("\ndebug");
//         // for (int i = 0; i < alphabetNumber.length; ++i) {
//         //     System.out.print(alphabetNumber[i] + " ");
//         // } System.out.println("");

//         System.out.println(maxSum);
//     }
// }
