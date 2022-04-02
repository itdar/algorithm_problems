package algorithm_sites.acmicpc;

import java.util.*;

public class Acmicpc_017427_SumOfFactor2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        long sum = 0;

        for (int i = 1; i <= a; ++i) {
            sum += (i * (a / i));
        }

        System.out.println(sum);
    }

}

