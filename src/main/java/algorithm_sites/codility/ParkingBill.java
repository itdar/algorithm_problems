package algorithm_sites.codility;

public class ParkingBill {

    public int solution(String E, String L) {
        String[] entranceTime = E.split(":");
        int entranceHour = Integer.parseInt(entranceTime[0]);
        int entranceMin = Integer.parseInt(entranceTime[1]);

        String[] leavingTime = L.split(":");
        int leavingHour = Integer.parseInt(leavingTime[0]);
        int leavingMin = Integer.parseInt(leavingTime[1]);

        int hourDiff = Math.abs(leavingHour - entranceHour);
        int minDiff = (leavingMin - entranceMin);

        int result = 2;
        if (hourDiff == 0 && minDiff == 0) {
            return result;
        }

        result += 3;

        if (hourDiff == 0) {
            return result;
        }

        if (hourDiff > 1) {
            result += ((hourDiff-1) * 4);
        }

        if (minDiff > 0) {
            result += 4;
        }

        return result;
    }

}
