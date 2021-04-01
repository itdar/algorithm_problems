package common;

// 유클리드 호제법 Euclidean algorithm
// 최대공약수 (Greatest Common Divisor)

// Proces
// 1. Input number a, b
// 2. a가 b로 나누어지는 순간까지 반복한다.
//  2.1. a를 b로 나눈 나머지를 찾는다.
//  2.2. b는 a에, 나머지는 b에 넣는다
// 3. b를 반환한다.

// Process (recursive)
// 1. Input number a, b
// 2. Return recursive b, a % b

import java.util.*;
import java.io.*;

public class EuclideanGreatestCommonDivisor {
    
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());
        
        System.out.println(gcd(a, b));

        System.out.println("");

        System.out.println(gcd_recursive(a, b));
    }

    public static int gcd(int a, int b) {
        if (a != 0 && b != 0) {
            int remainder;
            while (b != 0) {
                remainder = a % b;
                a = b;
                b = remainder;
            }
        } else {
            return -1;
        }
        return a;
    }

    public static int gcd_recursive(int a, int b) {
        if (b == 0) return a;

        return gcd_recursive(b, a % b);
    }
}
