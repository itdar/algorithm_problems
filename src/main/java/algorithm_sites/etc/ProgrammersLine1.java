package algorithm_sites.etc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProgrammersLine1 {

    private static List<String> combDelimiters = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String delimiters = sc.nextLine();
        String list = sc.nextLine();
//        String delimiters = ".?";
//        String list = "abc";

        ///////////////////////////////////

        if (delimiters.isEmpty() || list.isEmpty()) {
            System.out.println(0);
            return;
        }

        int L = list.length();
        int D = delimiters.length();

        char[] charBuilder = new char[L-1];
        for (int i = 0; i < delimiters.length(); ++i) {
            recursiveDelimiter(delimiters, i, charBuilder, 0, L-2);
        }

        List<String> results = new LinkedList<>();
        for (String combDelimiter : combDelimiters) {
            StringBuilder sb = new StringBuilder();

            int index = 0;
            while (index < list.length()) {
                sb.append(list.charAt(index));
                if (index < combDelimiter.length()) {
                    sb.append(combDelimiter.charAt(index));
                }
                ++index;
            }

            results.add(sb.toString());
        }

        // print
        System.out.println(results.size());
        for (String result : results) {
            System.out.println(result);
        }
    }

    private static void recursiveDelimiter(String delimiters, int index, char[] charBuilder, int depth, int endDepth) {
        charBuilder[depth] = delimiters.charAt(index);

        if (depth >= endDepth) {
            combDelimiters.add(new String(charBuilder));
            return;
        }

        for (int i = 0; i < delimiters.length(); ++i) {
            recursiveDelimiter(delimiters, i, charBuilder, depth+1, endDepth);
        }
    }

}
