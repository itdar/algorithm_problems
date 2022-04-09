package algorithm_sites.etc;

import java.util.HashSet;
import java.util.Set;

public class TodayHouse03 {

    private Set<String> historySet = new HashSet<>();
    private String tstring;
//    private boolean isDupl = false;

    public String solution(String tstring, String[][] variables) {
        this.tstring = tstring;

        recursive(variables);

        return this.tstring;
    }

    private void recursive(String[][] variables) {
        if (!hasVar(tstring, variables)) {
            return;
        }

        replaceTemplate(variables);

        if (historySet.contains(tstring)) {
//            isDupl = true;
            return;
        }

        historySet.add(tstring);
        recursive(variables);
    }

    private void replaceTemplate(String[][] variables) {
        for (int i = 0; i < variables.length; ++i) {
            String tempOrigin = tstring;

            StringBuilder sb = new StringBuilder(tempOrigin);

            if (tempOrigin.contains("{" + variables[i][0] + "}")) {
                String templateVar = "\\{" + variables[i][0] + "\\}";

                tstring = tstring.replaceAll(templateVar, variables[i][1]);
            }
        }
    }

    private boolean hasVar(String tstring, String[][] variables) {
        for (int i = 0; i < variables.length; ++i) {
            if (tstring.contains("{" + variables[i][0] + "}")) {
                return true;
            }
        }
        return false;
    }
}
