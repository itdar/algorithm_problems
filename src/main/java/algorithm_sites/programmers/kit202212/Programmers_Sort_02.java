package algorithm_sites.programmers.kit202212;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Programmers_Sort_02 {

    public String solution(int[] numbers) {
        int sum = 0;
        List<Integer> numList = new ArrayList<>();
        for (int number : numbers) {
            sum += number;
            numList.add(number);
        }

        numList.sort((a, b) -> {
            if (Objects.equals(a, b)) {
                return 0;
            }

            String aString = String.valueOf((int) a);
            String bString = String.valueOf((int) b);

            return (bString + aString).compareTo(aString + bString);
        });

        StringBuilder sb = new StringBuilder();
        for (int number : numList) {
            sb.append(number);
        }

        if (sum == 0) {
            return "0";
        }

        return sb.toString();
    }

}
