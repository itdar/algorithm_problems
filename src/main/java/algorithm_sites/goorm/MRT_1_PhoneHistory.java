package algorithm_sites.goorm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MRT_1_PhoneHistory {

    public static List<String> solution(List<String> logs) {
        if (logs == null || logs.isEmpty()) {
            return Arrays.asList("0");
        }

        if (logs.size() == 1) {
            logs = new ArrayList<>(logs);
            logs.add(0, Integer.toString(logs.size()));
            return logs;
        }

        Deque<History> histories = new LinkedList<>();
        histories.addLast(new History(logs.get(0)));

        for (int i = 1; i < logs.size(); ++i) {
            String currentLog = logs.get(i);
            History last = histories.peekLast();

            if (last.isSameLog(currentLog)) {
                last.plusCount();
            } else {
                histories.addLast(new History(currentLog));
            }
        }

        List<String> results = histories.stream()
            .map(History::toLog)
            .collect(Collectors.toList());

        // ide
        results.add(0, Integer.toString(histories.size()));

        return results;
    }


    static class History {
        String log;
        int count;

        public History(String log) {
            this.log = log;
            this.count = 1;
        }

        public boolean isSameLog(String log) {
            return this.log.equals(log);
        }

        public void plusCount() {
            ++this.count;
        }

        public String toLog() {
            if (count == 1) {
                return log;
            }

            return String.format(log + " (%d)", count);
        }
    }

    protected static List<String> solution1(int n, List<String> logs) {

        List<String> results = new ArrayList<>();

        if (n == 0) {
            return Arrays.asList();
        }

        if (n == 1) {
            return logs;
        }

        String previous = null;
        int count = 0;
        for (int i = 0; i < logs.size(); ++i) {
            String log = logs.get(i);

            if (previous == null || previous.isEmpty()) {
                previous = log;
                continue;
            }

            if (log.equals(previous)) {
                ++count;
                continue;
            }

            if (count > 1) {
                results.add(String.format(previous + " (%d)", count));
            } else {
                results.add(previous);
            }

            previous = log;
            count = 1;
        }

        if (previous != null) {
            results.add(previous);
        }
        results.add(0, Integer.toString(results.size()));

        results.forEach(System.out::println);

        return results;
    }

}
