package algo_lib.search;

public class Searcher {

    public int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length-1;
        int mid = (end+start)/2;

        while(end-start >= 0) {
            if (array[mid] == target) { //Case: Find target in array
                return mid;
            } else if (array[mid] <= target){ //Case: target is exist in right of array[mid]
                start = mid+1;
            } else { //Case: target is exist in left of array[mid]
                end = mid-1;
            } mid = (end+start)/2;
        }

        return -1;
    }
}
