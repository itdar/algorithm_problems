package algo_lib;

public class ClockHourMinSecCount {
    /**
     * 하루 86400 sec (24 * 60 * 60)
     */
    public static void main(String args[]) {
        bruteForceClock(3);
    }

    /**
     * 시/분/초 중에서 해당하는 n 숫자가 들어있는지 여부 확인한다.
     * 0~ 9 가능
     * int n = 3;
     */
    public static boolean clockHourMinSecCount(int hour, int min, int sec, int n) {
        return hour % 10 == n || min / 10 == n || min % 10 == n || sec / 10 == n || sec % 10 == n;
    }

    /**
     * 몇시? 는 입력받는다.
     * 시간의 시 / 분 / 초 전체를 순회한다.
     */
    public static void bruteForceClock(int hour) {
        int count = 0;
        for (int i = 0; i <= hour; ++i) {
            for (int j = 0; j < 60; ++j) {
                for (int k = 0; k < 60; ++k) {
                    if (clockHourMinSecCount(i,j,k, 3)) {
                        ++count;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
