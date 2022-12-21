package algorithm_sites.programmers.kit202212;

import java.util.HashMap;
import java.util.Map;

public class Programmers_Hash_01 {

    public String solution(String[] participant, String[] completion) {
        if (participant == null || participant.length == 0) {
            return "";
        }

        Map<String, Integer> participantMap = new HashMap<>();
        for (String parti : participant) {
            participantMap.put(parti, participantMap.getOrDefault(parti, 0) + 1);
        }

        for (String compl : completion) {
            participantMap.put(compl, participantMap.get(compl) - 1);
        }

        StringBuilder sb = new StringBuilder();
        for (String key : participantMap.keySet()) {
            if (participantMap.get(key) > 0) {
                sb.append(key);
                sb.append(",");
            }
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length()-1);
        }

        return sb.toString();
    }

}
