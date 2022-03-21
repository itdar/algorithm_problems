package algorithm_sites.programmers;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Hash_02_phone_number_prefix2 {

    public boolean solution(String[] phone_book) {
        Set<String> set = Arrays.stream(phone_book)
            .collect(Collectors.toSet());

        for (String phone : phone_book) {

            for (int i = 0; i < phone.length(); ++i) {
                if (set.contains(phone.substring(0, i)))
                    return false;
            }

        }

        return true;
    }

}
