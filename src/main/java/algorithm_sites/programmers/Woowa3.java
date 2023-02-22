package algorithm_sites.programmers;

import java.util.HashMap;
import java.util.Map;

public class Woowa3 {

    public String[] solution(String[] productInfo, String[] dailyProductSales) {
        String[] answer = new String[dailyProductSales.length];

        Map<String, Product> map = new HashMap<>();
        for (String info : productInfo) {
            String[] split = info.split(",");
            map.putIfAbsent(split[0], new Product(split[1], Integer.parseInt(split[2])));
        }

        for (int i = 0; i < dailyProductSales.length; ++i) {
            String[] split = dailyProductSales[i].split(",");
            StringBuilder sb = new StringBuilder();
            sb.append(split[0])
                .append(",")
                .append(split[1])
                .append(",")
                .append(map.get(split[1]).name)
                .append(",")
                .append(map.get(split[1]).price * Integer.parseInt(split[2]));
            answer[i] = sb.toString();
        }

        return answer;
    }

    private static class Product {
        private String name;
        private int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }

}
