package tech_interview_preparation.permutation_combination;

import java.util.Scanner;

public class CombinationExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        //조합 (순서관심없고 뽑은 유무만 생각)
        System.out.println("***조합(0,1,2)***");
        int[] comArr = new int[r];
        combination(comArr, n, r, 0, 0);


        //중복 조합 (순서관심없고 뽑은 유무만 생각 + 자기자신도 포함)
        System.out.println("***중복조합(0,1,2)***");
        int[] reComArr = new int[r];
        reCombination(reComArr, n, r, 0, 0);

    }

    //중복 조합 (순서관심없고 뽑은 유무만 생각 + 자기자신도 포함)
    private static void reCombination(int[] reComArr, int n, int r, int index, int target) {
        if(r==0){
            for(int i : reComArr){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        if(target == n)return;

        reComArr[index] = target;
        reCombination(reComArr, n, r-1, index+1, target);//뽑는경우
        reCombination(reComArr, n, r, index, target+1);//안뽑는경우

    }

    //조합 (순서관심없고 뽑은 유무만 생각)
    private static void combination(int[] comArr, int n, int r, int index, int target) {
        if(r==0){
            for(int i : comArr){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        if(target == n)return;

        comArr[index] = target;
        combination(comArr, n, r-1, index+1, target+1);//뽑는경우
        combination(comArr, n, r, index, target+1);//안뽑는경우

    }

}
