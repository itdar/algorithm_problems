package algorithm_sites.etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ProgrammersLine2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();

        List<String> lines = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a; ++i) {
            String s = sc.nextLine();
            lines.add(s);
            String[] s1 = s.split(" ");
            set.add(Integer.parseInt(s1[0]));
            set.add(Integer.parseInt(s1[1]));
        }

//        int a = 6;
//        lines.add("1 3");lines.add("3 4");lines.add("6 5");
//        lines.add("11 15");lines.add("12 17");lines.add("12 15");
//        set.add(1);set.add(3);set.add(4);set.add(5);
//        set.add(6);set.add(11);set.add(15);set.add(12);set.add(17);

        ////////////////////////////

        if (a == 0 || a == 1) {
            System.out.println(a);
            return;
        }

        Map<Integer, Node> nodes = new HashMap<>();
        for (Integer integer : set) {
            nodes.put(integer, new Node(integer));
        }

        for (String line : lines) {
            String[] s = line.split(" ");
            int first = Integer.parseInt(s[0]);
            int second = Integer.parseInt(s[1]);

            nodes.get(first).adjacents.add(nodes.get(second));
            nodes.get(second).adjacents.add(nodes.get(first));
        }

        int count = 0;
        for (Node node : nodes.values()) {
            if (!node.visited) {
                ++count;
                recursiveVisit(node);
            }
        }

        System.out.println(count);
    }

    private static void recursiveVisit(Node node) {
        if (node.visited || node.adjacents.isEmpty()) {
            return;
        }

        node.visited = true;
        for (Node adjacent : node.adjacents) {
            recursiveVisit(adjacent);
        }
    }

    private static class Node {
        final int number;
        boolean visited = false;
        List<Node> adjacents = new ArrayList<>();

        public Node(int number) {
            this.number = number;
        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) {
//                return true;
//            }
//            if (o == null || getClass() != o.getClass()) {
//                return false;
//            }
//            Node node = (Node) o;
//            return number == node.number;
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(number);
//        }

    }

}
