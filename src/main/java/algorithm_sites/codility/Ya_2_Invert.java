package algorithm_sites.codility;

public class Ya_2_Invert {

    /**
     * 문제가 테스트케이스 짜는거임
     */
    public String invert(String input) {
        if (input == null) {
            return "";
        }

        if (input.length() == 1) {
            return input;
        }

        return new StringBuilder(input)
            .reverse()
            .toString();
    }

}
