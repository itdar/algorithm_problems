package algorithm_sites.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgrammersLine3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
        int a = 2;
        sc.nextLine();

        List<String> lines = new ArrayList<>();
        for (int i = 0; i < a; ++i) {
            lines.add(sc.nextLine());
        }

        System.out.println(lines.size());


    }

}
