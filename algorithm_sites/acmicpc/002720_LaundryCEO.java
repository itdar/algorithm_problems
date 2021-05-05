package algorithm_sites.acmicpc;

import java.io.*;
import java.util.*;

class LaundryCEO {

    public static void main(String[] args) throws IOException {

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int countTest = scanner.nextInt();

        for (int i = 0; i < countTest; ++i) {
            int inputCent = scanner.nextInt();
            makeChanges(inputCent);
        }
    }

    public static void makeChanges(int inputCent) {
        int countQuater = 0;
        int countDime = 0;
        int countNickel = 0;
        int countPenny = 0;

        while (inputCent > 0) {
            if (inputCent >= 25) {
                inputCent -= 25;
                ++countQuater;
            } else if (inputCent >= 10) {
                inputCent -= 10;
                ++countDime;
            } else if (inputCent >= 5) {
                inputCent -= 5;
                ++countNickel;
            } else if (inputCent >= 1) {
                inputCent -= 1;
                ++countPenny;
            }
        }
        
        System.out.println(countQuater + " " + countDime + " " + countNickel + " " + countPenny);
    }
    
}
