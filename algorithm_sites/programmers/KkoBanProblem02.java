package algorithm_sites.programmers;

import java.util.ArrayList;
import java.util.List;

public class KkoBanProblem02 {

    public static int solution(int[][] needs, int r) {

        List<Product> products = new ArrayList<>();
        int partsNumber = needs[0].length;

        for (int prodNum = 0; prodNum < needs.length; ++prodNum) {
            Product product = new Product(prodNum);
            for (int partNum = 0; partNum < needs[prodNum].length; ++partNum) {
                int need = needs[prodNum][partNum];
                if (need == 1) {
                    product.addPartNum(partNum);
                }
            }
            products.add(product);
        }

//        System.out.println(products);

        List<List<Integer>> rParts = new ArrayList<>();
        int n = partsNumber;
        int[] arr = new int[partsNumber];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = i;
        }
        boolean[] visited = new boolean[n];
        combination(arr, visited, 0, n, r, rParts);

//        System.out.println(rParts);

        int max = 0;
        for (int j = 0; j < rParts.size(); ++j) {
            int count = 0;

            for (int i = 0; i < products.size(); ++i) {
                List<Integer> needParts = products.get(i).needs;

                boolean isAllFit = true;
                for (int k = 0; k < needParts.size(); ++k) {
                    if (!rParts.get(j).contains(needParts.get(k))) {
                        isAllFit = false;
                    }
                }

                if (isAllFit) {
                    ++count;
                }
            }
            max = Math.max(max, count);
        }

        return max;
    }

    static void combination(int[] arr, boolean[] visited, int start, int n, int r, List<List<Integer>> comb) {
        if (r == 0) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    temp.add(arr[i]);
                }
            }
            comb.add(temp);
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1, comb);
            visited[i] = false;
        }
    }

    static class Product {
        private int productNum;
        private List<Integer> needs = new ArrayList<>();

        public Product(int productNum) {
            this.productNum = productNum;
        }
        public void addPartNum(int need) {
            this.needs.add(need);
        }
        @Override
        public String toString() {
            return "["+productNum+","+needs+"]\n";
        }
    }

    public static void main(String args[]) {
        int[][] needs = new int[][] {{1,0,0},{1,1,0},{1,1,0},{1,0,1},{1,1,0},{0,1,1}};
        int r = 2;
//        int r = 3;

        int result = solution(needs, r);

        System.out.println(result);
    }

}

