package tech_interview_preparation.permutation_combination;

import java.util.LinkedList;
import java.util.Scanner;

public class PermutationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        //순열 (순서있게 배열)
        System.out.println("***순열(0,1,2)***");
        LinkedList<Integer> perArr = new LinkedList<Integer>();
        int[] perCheck = new int[n];
        permutation(n, r, perArr, perCheck);

        //중복순열 (순서있게 배열 + 자시자신도 포함)
        System.out.println("***중복순열(0,1,2)***");
        LinkedList<Integer> rePerArr = new LinkedList<Integer>();
        rePermutation(n, r, perArr);
    }

    //중복순열 (순서있게 배열 + 자시자신도 포함)
    private static void rePermutation(int n, int r, LinkedList<Integer> rePerArr) {
        if(rePerArr.size() == r){
            for(int i : rePerArr){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<n; i++){
            rePerArr.add(i);
            rePermutation(n, r, rePerArr);
            rePerArr.removeLast();
        }
    }

    //순열 (순서있게 배열)
    private static void permutation(int n, int r, LinkedList<Integer> perArr, int[] perCheck) {
        if(perArr.size() == r){
            for(int i : perArr){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<n; i++){
            if(perCheck[i] == 0){
                perArr.add(i);
                perCheck[i] = 1;
                permutation(n, r, perArr, perCheck);
                perCheck[i] = 0;
                perArr.removeLast();
            }
        }

    }
}
