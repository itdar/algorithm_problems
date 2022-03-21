package algorithm_sites.programmers;

import java.util.HashMap;
import java.util.Map;

public class Hash_01_no_completion_player2 {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();

        for (String person : participant) {
            participantMap.put(person, participantMap.getOrDefault(person, 0) + 1);
        }

        for (String person : completion) {
            Integer count = participantMap.get(person);
            if (count == 1) {
                participantMap.remove(person);
                continue;
            }
            participantMap.put(person, count-1);
        }

        return participantMap.keySet().stream().findFirst().get();
    }

}
