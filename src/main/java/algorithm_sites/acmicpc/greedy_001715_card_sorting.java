package algorithm_sites.acmicpc;

import java.util.*;
import java.io.*;

class CardSorting {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cards = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> cardPacks = new PriorityQueue<>();
        for (int i = 0; i < cards; ++i)
            cardPacks.add(Integer.parseInt(br.readLine()));

        int comparisonSum = 0;
        int first;
        int second;
        while (cardPacks.size() > 1) {
            first = cardPacks.poll();
            second = cardPacks.poll();
            comparisonSum += (first + second);
            cardPacks.add(first+second);
        }

        System.out.println(comparisonSum);
    }
}