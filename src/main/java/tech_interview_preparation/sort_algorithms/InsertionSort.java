package tech_interview_preparation.sort_algorithms;

public class InsertionSort {

    public static void main(String args[]) {
        System.out.println("Hell");

        int[] numbers = new int[] {2,5,7,4,23,4,32,56,71,3,9};

        for (int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n >> Sorting...");
        numbers = insertionSort(numbers);

        for (int i = 0; i < numbers.length; ++i)
            System.out.print(numbers[i] + " ");
        
    }

    public static int[] insertionSort(int[] numbers) {
        int temp;
        int j;
        for (int i = 1; i < numbers.length; ++i) {
            temp = numbers[i];
            for (j = i-1; j >= 0 && numbers[j] > temp; --j) {
                numbers[j+1] = numbers[j];
            }
            numbers[++j] = temp;
        }
        return numbers;
    }
}
