package algorithm_sites.codility;

public class FrogJmp {
    public static int solution(int X, int Y, int D) {
        int diff = Y-X;
        if (diff % D == 0) {
            return (Y - X) / D;
        }
        return (Y - X) / D + 1;
    }

    public static void main(String args[]) {
        int answer = solution(10, 100, 30);

        System.out.println(answer);
    }
}
