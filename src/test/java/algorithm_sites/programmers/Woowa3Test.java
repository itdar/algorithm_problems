package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Woowa3Test {

    private Woowa3 ww = new Woowa3();

    @Test
    void solutionTest1() {
        // 상품아이디, 상품명, 개당판매가격
        String[] productInfo = new String[] {"123456789,유기농쌀 4kg,50000","234578882,배달이캐릭터숟가락,3000"};
        // YYYYMMDD날짜, 상품아이디, 판매수량
        String[] dailyProductSales = new String[] {"20220810,123456789,5", "20220810,234578882,30","20220811,123456789,7"};

        String[] result = ww.solution(productInfo, dailyProductSales);

        assertThat(result).containsExactly(
            "20220810,123456789,유기농쌀 4kg,250000",
            "20220810,234578882,배달이캐릭터숟가락,90000",
            "20220811,123456789,유기농쌀 4kg,350000"
        );
    }

}
