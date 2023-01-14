package algorithm_sites.programmers.kit202212;

public class Programmers_ExhaustiveSearch_04 {

    public int[] solution(int brown, int yellow) {
        int minHeight = 3;
        int height = minHeight;
        int width = (brown-(height*2))/2+2;
        int inner = (width-2) * (height-2);

        while (inner != yellow) {
            ++height;
            width = (brown-(height*2))/2+2;
            inner = (width-2) * (height-2);
        }

        return new int[] {width, height};
    }

}
