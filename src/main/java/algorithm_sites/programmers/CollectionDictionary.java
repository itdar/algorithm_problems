package algorithm_sites.programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionDictionary {

    private List<Character> aeiou = new ArrayList<>();
    private List<Character> assemble = new LinkedList<>();
    private List<String> results = new LinkedList<>();

    public int solution(String word) {
        aeiou.add('A');
        aeiou.add('E');
        aeiou.add('I');
        aeiou.add('O');
        aeiou.add('U');

        for (int i = 0; i < 5; ++i) {
            dfs(word, 0);
        }

        for (int i = 0; i < results.size(); ++i) {
            String fitResult = results.get(i);
            if (fitResult.equals(word)) {
                return i+1;
            }
        }

        return -1;
    }

    private void dfs(String word, int depth) {
        if (depth >= 5) {
            return;
        }

        for (int i = 0; i < 5; ++i) {
            assemble.add(aeiou.get(i));
            String created = createString(assemble);
            results.add(created);
            dfs(word, depth+1);
            assemble.remove(assemble.size()-1);
        }
    }

    private String createString(List list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); ++i) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }

}
