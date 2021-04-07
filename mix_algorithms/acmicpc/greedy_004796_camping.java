package acmicpc;

import java.util.*;
import java.io.*;

class Camping {
    public static void main(String args[]) throws NumberFormatException, IOException {
        int index = 1;
        List<String> resultString = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
    
            int maxCount = 0;
            
            if (L == 0 && P == 0 && V == 0) 
                break;

            // if (1 < L && L < P && P < V) 
            {
                maxCount += ((V / P) * L) + Math.min(V % P, L);

                resultString.add("Case " + index++ + ": " + maxCount);
            }
        }
        for (int i = 0; i < resultString.size(); ++i) {
            System.out.println(resultString.get(i));
        }

        bw.flush();
		bw.close();
    }
}