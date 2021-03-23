package sort_algorithms;


public class BubbleSort {
    public static void main(String args[]) {
        System.out.println("Hell");

        int[] numbers = new int[] {2,5,7,4,23,4,32,56,71,3,9};

        for (int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n >> Sorting...");
        numbers = bubbleSort(numbers);

        for (int i = 0; i < numbers.length; ++i)
            System.out.print(numbers[i] + " ");
        
    }

    public static int[] bubbleSort(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length-1; ++i) {
            for (int j = 0; j < numbers.length-1-i; ++j) {
                if (numbers[j] > numbers[j+1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }
}



