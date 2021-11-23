package algorithm_sites.acmicpc;

import java.io.*;
import java.util.*;

// Process
// 1. Input 책개수, 한번에들수있는책개수, 책들좌표
// 2. 책들 좌표를 양수,음수 분리한다.
// 3. 양수는 내림차순 정렬한다.
// 4. 음수는 오름차순 정렬한다.
// 5. 양수들과 음수들 중, 절대값이 가장 큰 것을 찾는다.
//  5.1. 절대값이 가장 큰 것에서, 한번에들수있는책개수 만큼의 덩어리를 제한다.
//  5.2. 가장 큰 절대값을 움직인 거리에 더한다.
// 6. 양수들과 음수들 배열의 남은 것들을 한번에들수있는책개수 만큼씩 묶으며 이동한다.
//  6.1. (묶은 것들 중 가장 큰 절대값 * 2) 값을 움직인 거리에 더한다.
// 7. 양수들과 음수들 배열에서 (남은 것들 중 가장 큰 절대값 * 2) 값을 움직인 거리에 더한다.
// 8. 움직인 거리 반환한다.
// 9. 끝낸다.

class Library {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int movingDistance = 0;

        // 1.
        String[] firstLine = br.readLine().split(" ");
        int countBook = Integer.parseInt(firstLine[0]);
        int countCarry = Integer.parseInt(firstLine[1]);
        int[] books = new int[countBook];

        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < countBook; ++i) {
            books[i] = Integer.parseInt(tokenizer.nextToken());
        }

        // 2.
        List<Integer> positives = new LinkedList<>();
        List<Integer> negatives = new LinkedList<>();
        for (int i = 0; i < books.length; ++i) {
            if (books[i] < 0) {
                negatives.add(books[i]);
            } else {
                positives.add(books[i]);
            }
        }

        // 3. 4.
        Collections.sort(positives, Collections.reverseOrder());
        Collections.sort(negatives);

        // 5.
        int maxAbsPositive = 0;
        int maxAbsNegative = 0;
        if (positives.size() > 0)
            maxAbsPositive = positives.get(0);
        if (negatives.size() > 0)
            maxAbsNegative = Math.abs(negatives.get(0));
        int iterCount = 0;
        if (maxAbsPositive > maxAbsNegative) {
            movingDistance += maxAbsPositive;
            while (positives.size() > 0 && iterCount < countCarry) {
                positives.remove(0);
                ++iterCount;
            }
        } else {
            movingDistance += maxAbsNegative;
            while (negatives.size() > 0 && iterCount < countCarry) {
                negatives.remove(0);
                ++iterCount;
            }
        }

        // 6. 7.
        for (int i = 0; i < positives.size(); i += countCarry) {
            movingDistance += (positives.get(i) * 2);
        }
        for (int i = 0; i < negatives.size(); i += countCarry) {
            movingDistance += (Math.abs(negatives.get(i)) * 2);
        }
        
        // 8.
        System.out.println(movingDistance);
    }
    
}
