package algorithm_sites.programmers.kit202212;

import java.util.HashSet;
import java.util.Set;

public class Programmers_Hash_02 {

    public boolean solution(String[] phoneBook) {
        if (phoneBook == null || phoneBook.length == 0) {
            return true;
        }

        Set<String> set = new HashSet<>();

        for (int i = 0; i < phoneBook.length; ++i)
            set.add(phoneBook[i]);

        // 최대길이 -1 까지만 substring 만들어서 자기자신을 피한다.
        for (int i = 0; i < phoneBook.length; ++i)
            for (int j = 1; j < phoneBook[i].length(); ++j)
                if (set.contains(phoneBook[i].substring(0, j)))
                    return false;

        return true;
    }

}
