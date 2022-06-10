package algorithm_sites.codility;

//import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Ya_2_InvertTest {

    private Ya_2_Invert inverter = new Ya_2_Invert();

    @Test
    public void shouldInvert_empty() {
        final String empty = "";

        String inverted = inverter.invert(empty);

//        Assert.assertEquals(empty, inverted);
    }

    @Test
    public void shouldInvert_null() {
        final String nullString = null;
        final String empty = "";

        String inverted = inverter.invert(nullString);

//        Assert.assertEquals(empty, inverted);
    }

    @Test
    public void shouldInvert_single() {
        final String singleString = "a";

        String inverted = inverter.invert(singleString);

//        Assert.assertEquals(singleString, inverted);
    }

    @Test
    public void shouldInvert_normal() {
        final String normalString = "abcd";
        final String reversedNormalString = "dcba";

        String inverted = inverter.invert(normalString);

//        Assert.assertEquals(reversedNormalString, inverted);
    }

}
