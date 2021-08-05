package algorithm_sites.programmers;

import java.util.HashMap;
import java.util.HashSet;

public class hash_02_phone_number_prefix {

    public static void main(String args[]) {

        PhoneNumberPrefix solution = new PhoneNumberPrefix();

//        String[] phone_book = new String[] {"123", "456", "789"};
        String[] phone_book = new String[] {"12","123","1235","567","88"};
        boolean result = solution.solution(phone_book);

        System.out.println(result);
    }

}

// HashSet
class PhoneNumberPrefix {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < phone_book.length; ++i) {
            set.add(phone_book[i]);
        }

        for (int i = 0; i < phone_book.length; ++i) {
            for (int j = 1; j < phone_book[i].length(); ++j) {
                if (set.contains(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }

        return true;
    }
}

//// HashMap
//class PhoneNumberPrefix {
//    public boolean solution(String[] phone_book) {
//        HashMap<String, String> map = new HashMap<>();
//
//        for (int i = 0; i < phone_book.length; ++i) {
//            map.put(phone_book[i], phone_book[i]);
//        }
//
//        for (int i = 0; i < phone_book.length; ++i) {
//            final int index = i;
//            if (map.values().stream()
//                    .filter(s -> phone_book[index].startsWith(s))
//                    .count() > 1) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}
