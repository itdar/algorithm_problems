package algorithm_sites.etc;

import java.util.HashMap;
import java.util.Map;

public class KkoMo01 {
    // firstname -> 첫번째 이니셜 소문자
    // middlename -> 첫번째 이니셜 소문자
    // lastname -> 전체이니셜소문자(하이픈제거, 8자 자름)
    // 다 만들어서 중복되는 것 있으면 2개째부터 뒤에 숫자 (2,3,4)

    Map<String, Integer> map = new HashMap<>();
    private static final String SPLIT_NAMES_REGEX = ", ";
    private static final String EMAIL_DUPL_FORMAT = "<%s%d@%s.com>";
    private static final String EMAIL_BASIC_FORMAT = "<%s@%s.com>";

    public String solution(String S, String C) {

        String[] names = S.split(SPLIT_NAMES_REGEX);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < names.length; ++i) {
            sb.append(names[i] + " ");
            sb.append(createEmail(names[i], C));

            if (i != names.length-1)
                sb.append(", ");
        }

        return sb.toString();
    }

    private String createEmail(String name, String C) {
        String editedName = editFullName(name.toLowerCase());
        String email = String.format(EMAIL_BASIC_FORMAT, editedName, C.toLowerCase());

        map.put(email, map.getOrDefault(email, 0) + 1);
        if (isExistEmail(email)) {
            return String.format(EMAIL_DUPL_FORMAT, editedName, map.get(email), C.toLowerCase());
        }

        return email;
    }

    private boolean isExistEmail(String email) {
        return map.get(email) != 1;
    }

    private String editFullName(String name) {
        String[] nameComponents = name.split(" ");

        String firstName;
        String middleName = null;
        String lastName;

        firstName = nameComponents[0];
        if (nameComponents.length > 2) { // + middleName (optional)
            middleName = nameComponents[1];
            lastName = nameComponents[2];
        } else {
            lastName = nameComponents[1];
        }

        StringBuilder sb = new StringBuilder();
        sb.append(firstName.charAt(0));
        if (middleName != null) {
            sb.append(middleName.charAt(0));
        }
        String lastNameEdited = editLastName(lastName);
        if (lastNameEdited.length() > 8) {
            lastNameEdited = lastNameEdited.substring(0,8);
        }
        sb.append(lastNameEdited);

        return sb.toString();
    }

    private String editLastName(String lastName) {
        String lastNameEdited = lastName.replace("-", "");
        return lastNameEdited;
    }

}
