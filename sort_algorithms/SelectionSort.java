package sort_algorithms;

public class SelectionSort {

    public static void main(String args[]) {
        System.out.println("Hell");

        int[] numbers = new int[] {2,5,7,4,23,4,32,56,71,3,9};

        for (int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n >> Sorting...");
        numbers = selectionSort(numbers);

        for (int i = 0; i < numbers.length; ++i)
            System.out.print(numbers[i] + " ");
        
    }

    public static int[] selectionSort(int[] numbers) {
        int temp;
        int tempIndex;
        for (int i = 0; i < numbers.length-1; ++i) {
            tempIndex = i;
            temp = numbers[i];
            for (int j = i+1; j < numbers.length; ++j) {
                if (temp > numbers[j]) {
                    tempIndex = j;
                    temp = numbers[j];
                }
            }
            numbers[tempIndex] = numbers[i];
            numbers[i] = temp;
        }
        return numbers;
    }
}
