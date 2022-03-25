package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Greedy_02_JoystickTest {

    private Greedy_02_Joystick joystick = new Greedy_02_Joystick();
    @Test
    void solutionTest1() {
        int result = joystick.solution("JEROEN");

        assertThat(result).isEqualTo(56);
    }

    @Test
    void solutionTest2() {
        int result = joystick.solution("JAN");

        assertThat(result).isEqualTo(23);
    }

    @Test
    void solutionTest3() {
        int result = joystick.solution("ABAAAAAAAAABB");

        assertThat(result).isEqualTo(7);
    }

    @Test
    void solutionTest4() {
        int result = joystick.solution("BBBBAAAABA");

        assertThat(result).isEqualTo(12);
    }

}