package algorithm_sites.acmicpc;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class Acmicpc_018868_MultiVerseTest {

    @Test
    void test1() throws IOException {
        // given
        String input = "5 3\n"
            + "20 10 30\n"
            + "10 20 60\n"
            + "80 25 79\n"
            + "30 50 80\n"
            + "80 25 81";

        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        System.setIn(inputStream);

        // when
        Acmicpc_018868_MultiVerse.main(new String[]{});

        // then
        String output = outputStream.toString();
        assertThat(output).isEqualTo("2\n");
    }
}