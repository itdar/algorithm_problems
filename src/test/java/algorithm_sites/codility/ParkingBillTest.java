package algorithm_sites.codility;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ParkingBillTest {

    private ParkingBill parkingBill = new ParkingBill();

    @Test
    void solution1() {
        int result = parkingBill.solution("10:00", "13:21");

        assertThat(result).isEqualTo(17);
    }

    @Test
    void solution2() {
        int result = parkingBill.solution("09:42", "11:42");

        assertThat(result).isEqualTo(9);
    }

    @Test
    void solution3() {
        int result = parkingBill.solution("00:00", "23:59");

        assertThat(result).isEqualTo(2 + 3 + 23*4);
    }

    @Test
    void solution4() {
        int result = parkingBill.solution("10:00", "10:00");

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solution5() {
        int result = parkingBill.solution("18:21", "18:29");

        assertThat(result).isEqualTo(5);
    }

}
