package algorithm_sites.programmers.kit202212;

public class Programmers_ExhaustiveSearch_07 {

    private StringBuilder sb = new StringBuilder();
    private int resultIndex = 0;
    private int count = 0;

    public int solution(String word) {
        String[] aeiou = new String[] {"A","E","I","O","U"};

        dfs(aeiou, 0, word, sb);

        return resultIndex;
    }

    private void dfs(String[] aeiou, int depth, String word, StringBuilder making) {
        if (word.equals(making.toString())) {
            resultIndex = count;
            return;
        }

        if (depth == 5) {
            return;
        }

        for (int i = 0; i < aeiou.length; ++i) {
            ++count;
            making.append(aeiou[i]);
            dfs(aeiou, depth+1, word, making);
            making.deleteCharAt(making.length()-1);
        }
    }

}
