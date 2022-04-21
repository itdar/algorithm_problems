package algorithm_sites.etc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class KkoMo01Test {

    private KkoMo01 kko = new KkoMo01();

    @Test
    void solutionTest1() {
        String result = kko.solution(
            "John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, Penny Parker",
            "Example");

        assertThat(result)
            .isEqualTo("John Doe <jdoe@example.com>, Peter Parker <pparker@example.com>, Mary Jane Watson-Parker <mjwatsonpa@example.com>, James Doe <jdoe2@example.com>, John Elvis Doe <jedoe@example.com>, Jane Doe <jdoe3@example.com>, Penny Parker <pparker2@example.com>");
    }

    @Test
    void solutionTest2() {
        String result = kko.solution(
            "John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe-doe, Jane Doe Alex-ander, Penny Parker",
            "Example");

        assertThat(result)
            .isEqualTo("John Doe <jdoe@example.com>, Peter Parker <pparker@example.com>, Mary Jane Watson-Parker <mjwatsonpa@example.com>, James Doe <jdoe2@example.com>, John Elvis Doe-doe <jedoedoe@example.com>, Jane Doe Alex-ander <jdalexande@example.com>, Penny Parker <pparker2@example.com>");
    }

    @Test
    void solutionTest3() {
        String result = kko.solution(
            "John Doe, John Doe, John Doe, John Doe, John Doe, John Doe, John Doe, John Doe, John Doe, John Doe, John Doe",
            "Example");

        assertThat(result)
            .isEqualTo("John Doe <jdoe@example.com>, John Doe <jdoe2@example.com>, "
                + "John Doe <jdoe3@example.com>, John Doe <jdoe4@example.com>, "
                + "John Doe <jdoe5@example.com>, John Doe <jdoe6@example.com>, "
                + "John Doe <jdoe7@example.com>, John Doe <jdoe8@example.com>, "
                + "John Doe <jdoe9@example.com>, John Doe <jdoe10@example.com>, "
                + "John Doe <jdoe11@example.com>");
    }

    @Test
    void solutionTest4() {
        String result = kko.solution(
            "John Doe Alex-ander-ander, "
                + "John Doe Alex-ander, "
                + "John Doe Ale-xander, "
                + "John Doe ale-xander, "
                + "John Doe alex-andea, "
                + "John Doe alex-andeb, "
                + "John Doe alex-andec, "
                + "John Doe ale-xandea, "
                + "John Doe ale-xandeb, "
                + "John Doe a--lexandec, "
                + "John Doe a-l-exanded",
            "Example");

        assertThat(result)
            .isEqualTo(""
                + "John Doe Alex-ander-ander <jdalexande@example.com>, "
                + "John Doe Alex-ander <jdalexande2@example.com>, "
                + "John Doe Ale-xander <jdalexande3@example.com>, "
                + "John Doe ale-xander <jdalexande4@example.com>, "
                + "John Doe alex-andea <jdalexande5@example.com>, "
                + "John Doe alex-andeb <jdalexande6@example.com>, "
                + "John Doe alex-andec <jdalexande7@example.com>, "
                + "John Doe ale-xandea <jdalexande8@example.com>, "
                + "John Doe ale-xandeb <jdalexande9@example.com>, "
                + "John Doe a--lexandec <jdalexande10@example.com>, "
                + "John Doe a-l-exanded <jdalexande11@example.com>");
    }



}