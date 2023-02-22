package algorithm_sites.programmers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Woowa4 {

    public String solution(String pathVariableUrl) {
        if (validateURL(pathVariableUrl)) {
            String[] splitUrl = pathVariableUrl.trim().split("/");
            String paymentId = splitUrl[2].trim();
            String paymentMethod = splitUrl[3].trim();

            return "/payment"
                + "/"
                + paymentMethod
                + "?"
                + "paymentId"
                + "="
                + paymentId;
        }

        return "error";
    }

    public static boolean validateURL(String url) {
        String regex = "^\\/payment\\/\\d{1,4}\\/[A-Za-z]{1,10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }

}
