package algo_lib;

public class DecimalToBinary {

    public long integerConvert(int decimal) {
        return Long.parseLong(Integer.toString(decimal, 2));
//        return Long.parseLong(Integer.toBinaryString(decimal));
    }

    public double longConvert(long decimal) {
        return Double.parseDouble(Long.toBinaryString(decimal));
    }
    
}
