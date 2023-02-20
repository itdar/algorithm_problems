package algorithm_sites.leetcode2;

public class LC_00011_ContainerWithMostWater {

    public int maxArea(int[] heights) {
        int result = 0;

        int front = 0;
        int rear = heights.length-1;
        while (front < rear) {
            int width = rear - front;
            int height = Math.min(heights[front], heights[rear]);
            result = Math.max(result, width * height);

            if (heights[front] > heights[rear]) {
                --rear;
            } else {
                ++front;
            }
        }

        return result;
    }

}
