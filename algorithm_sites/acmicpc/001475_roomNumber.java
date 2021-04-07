package acmicpc;

import java.util.*;
import java.io.*;

class RoomNumber {
    // Process
    // 1. Input roomNumber, numbers' digit
    // 2. Get minimum required count set
    //  2.1. point is 6,9 (한세트에 2개씩 가능, 셀 때는 /2 해서 두개를 1개로 여기고 세트개수 센다)
    // 3. 최대로 필요한 digit의 개수로 최소 필요 세트 개수를 찾아 반환한다.
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int[] numbers = new int[10];
        String roomNumber = tokenizer.nextToken();

        for (int i = 0; i < roomNumber.length(); ++i) {
            switch (roomNumber.charAt(i)) {
                case '1': ++numbers[1];break;
                case '2': ++numbers[2];break;
                case '3': ++numbers[3];break;
                case '4': ++numbers[4];break;
                case '5': ++numbers[5];break;
                case '6': ++numbers[6];break;
                case '7': ++numbers[7];break;
                case '8': ++numbers[8];break;
                case '9': ++numbers[6];break; // point
                case '0': ++numbers[0];break;
            }
        }
        numbers[6] = (numbers[6]+1) / 2;    // point

        int maxNumber = -1;
        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        
        System.out.println(maxNumber);

    }
}