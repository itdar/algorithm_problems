package algorithm_sites.etc;

import static org.junit.jupiter.api.Assertions.*;

class KkoMo03Test {

    public static void main(String args[]) {
        KkoMo03 kko = new KkoMo03();

        int result1 = kko.solution(new int[] {3,2,3,2,3});
        System.out.println("result: " + result1 + " == 5");

        int result2 = kko.solution(new int[] {7,4,-2,4,-2,-9});
        System.out.println("result: " + result2 + " == 4");

        int result3 = kko.solution(new int[] {7,-5,-5,-5,7,-1,7});
        int result4 = kko.solution(new int[] {4});
        int result5 = kko.solution(new int[] {});
        int result6 = kko.solution(new int[] {3,2,3,2});
        int result7 = kko.solution(new int[] {3,2,3});
        int result8 = kko.solution(new int[] {3,2});
        int result9 = kko.solution(new int[] {-1000000000,-1000000000,-1000000000,-1000000000,-1000000000,-1000000000});
        int result10 = kko.solution(new int[] {1000000000,1000000000,1000000000,1000000000,1000000000,1000000000});

        System.out.println("result: " + result3 + " == 3");
        System.out.println("result: " + result4 + " == 1");
        System.out.println("result: " + result5 + " == 0");
        System.out.println("result: " + result6 + " == 4");
        System.out.println("result: " + result7 + " == 3");
        System.out.println("result: " + result8 + " == 2");
        System.out.println("result: " + result9 + " == 6");
        System.out.println("result: " + result10 + " == 6");
    }

}