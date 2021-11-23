package algorithm_sites.programmers;

class SkillCheckTestLevel1_02_String {
    public String solution(String s) {
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder("");

        String[] splits = s.split(" ", -1);
        for (int i = 0; i < splits.length; ++i) {
            sb.append(converter(splits[i]));
            if (i < splits.length-1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private String converter(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); ++i) {
            if (i == 0) {
                sb.append((char)(s.charAt(i) - 32));
            } else if (i % 2 == 0) {
                sb.append((char)(s.charAt(i) - 32));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

}