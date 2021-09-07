package algorithm_sites.programmers;

import java.util.HashMap;

public class hash_01_no_completion_player {

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; ++i) {
            if (map.containsKey(participant[i])) {
                map.put(participant[i], map.get(participant[i]) + 1);
            } else {
                map.put(participant[i], 1);
            }
        }

        for (int i = 0; i < completion.length; ++i) {
            if (map.containsKey(completion[i])) {
                map.put(completion[i], map.get(completion[i]) - 1);
            } else {
                System.out.println("Something wrong.");
            }
        }

        for (int i = 0; i < participant.length; ++i) {
            if (map.get(participant[i]) > 0) {
                return participant[i];
            }
        }

        return "error";
    }
    public static void main(String args[]) {

//        Solution solution = new Solution();

        String[] participant = new String[] {"leo", "eden", "kiki"};
        String[] completion = new String[] {"eden", "kiki"};
        String result = solution(participant, completion);

        System.out.println(result);
    }

}
