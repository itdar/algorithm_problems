package algorithm_sites.acmicpc;

import java.io.*;
import java.util.*;

class Calculation {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // bw.write(a+b);
        // bw.write(a-b);
        // bw.write(a*b);
        // bw.write(a/b);
        // bw.write(a%b);
        
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // bw.flush();
        // bw.close();
    }
}
