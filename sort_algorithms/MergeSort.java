package sort_algorithms;

import java.util.LinkedList;
import java.util.List;

public class MergeSort {

    public static void main(String args[]) {

        int[] numbers = new int[] {1,7,43,2,67,81,2,45,52,6,5432,83};
//        int[] numbers = new int[] {1,2,1,81,6,5432,83};
//        int[] numbers = new int[] {7,2,1,81,7,6,5432,83};

        System.out.println("Start");
        for (int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + "\t");
        } System.out.println("\n");

        numbers = mergeSort(numbers, 0, numbers.length-1);

        System.out.format("\nFinish result\n");
        for (int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + "\t");
        } System.out.println("");
    }

    public static int[] mergeSort(int[] numbers, int start, int end) {
        if (start < end) {
            int mid = (start+end)/2;
            int[] leftArray = new int[mid-start+1];
            int[] rightArray = new int[end-mid];

            // Divide
            int tempIndex = 0;
            for (int i = start; i < mid-start+1; ++i) {
                leftArray[tempIndex++] = numbers[i];
            }
            tempIndex = 0;
            for (int i = mid-start+1; i < end+1; ++i) {
                rightArray[tempIndex++] = numbers[i];
            }

            leftArray = mergeSort(leftArray, 0, leftArray.length-1);
            rightArray = mergeSort(rightArray, 0, rightArray.length-1);

            // Merge
            int[] mergedArray = new int[numbers.length];
            int leftIndex = 0;
            int rightIndex = 0;
            for (int i = 0; i < mergedArray.length; ++i) {
                if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                    if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                        mergedArray[i] = leftArray[leftIndex++];
                    } else {
                        mergedArray[i] = rightArray[rightIndex++];
                    }
                } else {
                    if (leftIndex >= leftArray.length) {
                        mergedArray[i] = rightArray[rightIndex++];
                    } else {
                        mergedArray[i] = leftArray[leftIndex++];
                    }
                }
            }

            numbers = mergedArray;
        }

        return numbers;
    }

    public static void swap(int[] numbers, int frontIndex, int rearIndex) {
        int temp = numbers[frontIndex];
        numbers[frontIndex] = numbers[rearIndex];
        numbers[rearIndex] = temp;
    }

}package sort_algorithms;

import java.util.LinkedList;
import java.util.List;

public class MergeSort {

    public static void main(String args[]) {

        int[] numbers = new int[] {1,7,43,2,67,81,2,45,52,6,5432,83};
//        int[] numbers = new int[] {1,2,1,81,6,5432,83};
//        int[] numbers = new int[] {7,2,1,81,7,6,5432,83};

        System.out.println("Start");
        for (int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + "\t");
        } System.out.println("\n");

        numbers = mergeSort(numbers, 0, numbers.length-1);

        System.out.format("\nFinish result\n");
        for (int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + "\t");
        } System.out.println("");
    }

    public static int[] mergeSort(int[] numbers, int start, int end) {
        if (start < end) {
            int mid = (start+end)/2;
            int[] leftArray = new int[mid-start+1];
            int[] rightArray = new int[end-mid];

            // Divide
            int tempIndex = 0;
            for (int i = start; i < mid-start+1; ++i) {
                leftArray[tempIndex++] = numbers[i];
            }
            tempIndex = 0;
            for (int i = mid-start+1; i < end+1; ++i) {
                rightArray[tempIndex++] = numbers[i];
            }

            leftArray = mergeSort(leftArray, 0, leftArray.length-1);
            rightArray = mergeSort(rightArray, 0, rightArray.length-1);

            // Merge
            int[] mergedArray = new int[numbers.length];
            int leftIndex = 0;
            int rightIndex = 0;
            for (int i = 0; i < mergedArray.length; ++i) {
                if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                    if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                        mergedArray[i] = leftArray[leftIndex++];
                    } else {
                        mergedArray[i] = rightArray[rightIndex++];
                    }
                } else {
                    if (leftIndex >= leftArray.length) {
                        mergedArray[i] = rightArray[rightIndex++];
                    } else {
                        mergedArray[i] = leftArray[leftIndex++];
                    }
                }
            }

            numbers = mergedArray;
        }

        return numbers;
    }

    public static void swap(int[] numbers, int frontIndex, int rearIndex) {
        int temp = numbers[frontIndex];
        numbers[frontIndex] = numbers[rearIndex];
        numbers[rearIndex] = temp;
    }

}