package algorithm_sites.codility;

public class KkoMoProblem01 {

    public static String solution(String S) {
        if (S.length() < 4) return S;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) != '-' && S.charAt(i) != ' ') {
                sb.append(S.charAt(i));
            }
        }
        sb.toString();

        int count = 0;
        if (sb.length() % 3 != 1) {
            for (int i = 0; i < sb.length(); ++i) {
                ++count;
                if (count == 4) {
                    sb.insert(i, '-');
                    count = 0;
                }
            }
        } else { // 끝자리 1개 남으면,
            int i = 0;
            while (i < sb.length() - 3) {
                ++count;
                if (count == 4) {
                    sb.insert(i, '-');
                    count = 0;
                }
                ++i;
            }
            --i;
            count = 0;
            while (i < sb.length()) {
                ++count;
                if (count == 3) {
                    sb.insert(i, '-');
                    count = 0;
                }
                ++i;
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        String result1 = solution("00-44  48 5555 8361");
        String result2 = solution("0 - 22 1985--324");
        String result3 = solution("555372654");
        String result4 = solution("55537265");
        String result5 = solution("5553726");
        String result6 = solution("555372");
        String result7 = solution("55537");
        String result8 = solution("5553");
        String result9 = solution("555");
        String result10 = solution("55");

        System.out.println("result: " + result1);
        System.out.println("result: " + result2);
        System.out.println("result: " + result3);
        System.out.println("result: " + result4);
        System.out.println("result: " + result5);
        System.out.println("result: " + result6);
        System.out.println("result: " + result7);
        System.out.println("result: " + result8);
        System.out.println("result: " + result9);
        System.out.println("result: " + result10);
    }
}
