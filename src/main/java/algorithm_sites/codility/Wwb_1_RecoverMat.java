package algorithm_sites.codility;

import java.util.stream.IntStream;

public class Wwb_1_RecoverMat {

    public String solution(int U, int L, int[] C) {
        if (C == null || C.length == 0
            || U + L != IntStream.of(C).sum()) {
            return "IMPOSSIBLE";
        }

        StringBuilder upSb = new StringBuilder();
        StringBuilder lowSb = new StringBuilder();
        for (int i = 0; i < C.length; ++i) {
            if (C[i] == 0) {
                upSb.append(0);
                lowSb.append(0);
                continue;
            }

            if (C[i] == 1) {
                if (U > 0) {
                    --U;
                    upSb.append(1);
                    lowSb.append(0);
                    continue;
                }
                --L;
                upSb.append(0);
                lowSb.append(1);
                continue;
            }

            if (C[i] == 2) {
                --U;
                --L;
                upSb.append(1);
                lowSb.append(1);
            }
        }

        return upSb.toString()
            .concat(",")
            .concat(lowSb.toString());
    }

}
