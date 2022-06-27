package algorithm_sites.etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProgrammersLine4 {

    private static Deque<Job> tracer = new LinkedList<>();
    private static List<Job> maxJobs = new ArrayList<>();
    private static int max = Integer.MIN_VALUE;
    private static int incomeSum = 0;
    private static int prevIncomeSum = 0;
    private static int currentJobEnd = -1;
    private static int prevJobEnd = -1;

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        sc.nextLine();

        List<String> lines = new ArrayList<>();
//        for (int i = 0; i < a; ++i) {
//            lines.add(sc.nextLine());
//        }

        int a = 5;
        lines.add("0 4 5");
        lines.add("3 4 20");
        lines.add("6 6 3");
        lines.add("8 5 35");
        lines.add("10 4 12");

        if (a == 0) {
            System.out.println(0);
            return;
        }
        if (a == 1) {
            //
        }
        //////////////////////////////////////

        List<Job> jobs = new ArrayList<>();
        for (String line : lines) {
            String[] s = line.split(" ");
            jobs.add(new Job(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2])));
        }

        Collections.sort(jobs, Comparator.comparingInt(value -> value.start));

        for (int i = 0; i < jobs.size(); ++i) {
            prevJobEnd = -1;
            prevIncomeSum = incomeSum;
            tracer.add(jobs.get(i));

            recursiveSum(jobs, i);

            Job prevJob = tracer.removeLast();
            incomeSum = prevIncomeSum;
            currentJobEnd = prevJobEnd;
        }

        System.out.println(max);
        for (Job maxJob : maxJobs) {
            System.out.println(maxJob.start + " " + maxJob.duration);
        }
    }

    private static void recursiveSum(List<Job> jobs, int i) {
        if (i >= jobs.size() || jobs.get(i).start <= currentJobEnd) {
            return;
        }

        prevIncomeSum = incomeSum;
        incomeSum += jobs.get(i).income;
        prevJobEnd = currentJobEnd;
        currentJobEnd = jobs.get(i).end;

        if (incomeSum > max) {
            max = incomeSum;
            maxJobs = new ArrayList<>(tracer);

            System.out.println(maxJobs);
        }

        for (int j = i+1; j < jobs.size(); ++j) {
            if (jobs.get(j).start > currentJobEnd) {
                tracer.add(jobs.get(j));

                recursiveSum(jobs, j);

                incomeSum = prevIncomeSum;
                currentJobEnd = prevJobEnd;
            }
        }
    }

    private static class Job {
        int start;
        int end;
        int duration;
        int income;

        public Job(int start, int duration, int income) {
            this.start = start;
            this.end = start + duration;
            this.duration = duration;
            this.income = income;
        }
    }

}
