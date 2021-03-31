package acmicpc;

import java.io.*;
import java.util.*;

class AsciiCode {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        
        System.out.println((int)inputString.charAt(0));
    }
}