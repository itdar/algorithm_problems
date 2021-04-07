package acmicpc;

import java.util.*;

class IntelligenceTrain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int total = 4;
        int max = 0;
        int current = 0;
        for (int i = 0; i < total; ++i) {
            int out = scanner.nextInt();
            int in = scanner.nextInt();

            current += in;
            current -= out;

            if (current > max)
                max = current;
        }
        System.out.println(max);
    }
}
