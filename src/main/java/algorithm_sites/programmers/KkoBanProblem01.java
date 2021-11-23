package algorithm_sites.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KkoBanProblem01 {

    static Map<Integer, Integer> monthMap = new HashMap<>();

    public static int solution(String[] deposits) {
        makeMonthMap();

        int totalOrigin = 0;
        List<Info> infos = new ArrayList<>();
        for (String deposit : deposits) {
            String[] tempInfo = deposit.split(" ");
            infos.add(new Info(tempInfo[0], Integer.parseInt(tempInfo[1]), Integer.parseInt(tempInfo[2])));
            totalOrigin += Integer.parseInt(tempInfo[2]);
        }

        int totalInterest = 0;
        for (Info info : infos) {
            totalInterest += calcInterest(info.money, info.rate, 365 - info.passDays);
        }

//        System.out.println(totalOrigin);
//        System.out.println(totalInterest);
//        System.out.println(infos);

        return totalOrigin + totalInterest;
    }

    private static void makeMonthMap() {
        monthMap = new HashMap<>();
        monthMap.put(1, 0);
        monthMap.put(2, 31);
        monthMap.put(3, 59);
        monthMap.put(4, 90);
        monthMap.put(5, 120);
        monthMap.put(6, 151);
        monthMap.put(7, 181);
        monthMap.put(8, 212);
        monthMap.put(9, 243);
        monthMap.put(10, 273);
        monthMap.put(11, 304);
        monthMap.put(12, 334);
    }

    private static int calcInterest(int money, long rate, int daysRemained) {
        return (int)((money * (rate * 0.01)) * ((double)daysRemained/365));
    }

    static class Info {
        int passDays;
        long rate;
        int money;

        public Info(String date, int rate, int money) {
            this.passDays = calculatePassDays(date);
            this.rate = rate;
            this.money = money;
        }

        public int calculatePassDays(String date) {
            String[] monthDay = date.split("/");

            return monthMap.get(Integer.parseInt(monthDay[0])) + Integer.parseInt(monthDay[1]);
        }

        @Override
        public String toString() {
            return "["+passDays+","+rate+","+money+"]";
        }
    }

    public static void main(String args[]) {
        String[] deposits1 = new String[] {"01/01 2 50000", "01/03 1 999", "01/31 9 10000", "02/05 5 6547", "02/05 6 1", "06/30 5 5000", "10/15 5 2529", "12/30 4 10000"};
        String[] deposits2 = new String[] {"03/01 5 15000", "05/15 2 9527", "11/30 9 10000"};

        int result1 = solution(deposits1);
        int result2 = solution(deposits2);

        System.out.println(result1);
        System.out.println(result2);
    }

}

