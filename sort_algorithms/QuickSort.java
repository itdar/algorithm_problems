package sort_algorithms;

import java.util.LinkedList;
import java.util.List;

public class QuickSort {

    public static void main(String args[]) {

        int[] numbers = new int[] {1,7,43,2,67,81,2,45,52,6,5432,83};
//        int[] numbers = new int[] {1,2,1,81,6,5432,83};
//        int[] numbers = new int[] {7,2,1,81,7,6,5432,83};

        System.out.println("Start");
        for (int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + " ");
        } System.out.println("\n");

        numbers = quickSort(numbers, 0, numbers.length-1);

        System.out.format("\nFinish result\n");
        for (int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + " ");
        } System.out.println("");
    }

    /**
     * 메모리맵 그려봐야함
     * @param numbers
     * @param start
     * @param end
     * @return
     */
    public static int[] quickSort(int[] numbers, int start, int end) {
        if (start < end) {
            int pivotIndex = start;
            int pivot = numbers[pivotIndex];
            int left = start+1;
            int right = end;

            while (left < right) {
                while (numbers[left] < pivot) ++left;
                while (numbers[right] > pivot) --right;
                if (left < right) {
                    swap(numbers, left, right);
                }
            }
            // Point, 위의 loop 끝나면 항상 right가 left보다 왼쪽으로 가게 됨, 그 때, pivot 값과 right값을 바꿀지 확인해서 바꾼다.
            if (pivot > numbers[right])
                swap(numbers, pivotIndex, right);

            quickSort(numbers, start, right-1);
            quickSort(numbers, right+1, end);
        }

        return numbers;
    }

    public static void swap(int[] numbers, int frontIndex, int rearIndex) {
        int temp = numbers[frontIndex];
        numbers[frontIndex] = numbers[rearIndex];
        numbers[rearIndex] = temp;
    }

}