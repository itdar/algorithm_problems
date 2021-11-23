package algorithm_sites.programmers;

import java.util.*;

public class EstSecurityProblem03 {
    public static long[][] solution(String[] record) {

        List<Seat> seatList = new ArrayList<>();
        for (int i = 0; i < record.length; ++i) {
            String[] splitStrings = record[i].split(" ");
            if (splitStrings.length == 2) {
                seatList.add(new Seat(Integer.parseInt(splitStrings[0].substring(splitStrings[0].indexOf('=')+1)),
                        false,
                        -1));
            } else {
                seatList.add(new Seat(Integer.parseInt(splitStrings[0].substring(splitStrings[0].indexOf('=')+1)),
                        true,
                        Integer.parseInt(splitStrings[2].substring(splitStrings[0].indexOf('=')))));
            }
        }

        System.out.println(seatList);

        Map<Integer, Node> canSit = new LinkedHashMap<>();
        canSit.put(0, new Node(0, Long.MAX_VALUE));

        for (int i = 0; i < seatList.size(); ++i) {
            Seat seat = seatList.get(i);

            if (!seat.isSit) {
                canSit.remove(seat.id);
                continue;
            }

            for (Integer keyInt : canSit.keySet()) {
                Node node = canSit.get(keyInt);

//                if ()
            }
        }

        return null;
    }

    static class Node {
        long start;
        long end;
        public Node(long start, long end) {
            this.start = start;
            this.end = end;
        }
    }

    static class Chair {
        int id;
        long index;
        long emptyStart;
        long emptyEnd;
        public Chair(int id, long index, long emptyStart, long emptyEnd) {
            this.id = id;
            this.index = index;
            this.emptyStart = emptyStart;
            this.emptyEnd = emptyEnd;
        }
    }

    static class Seat {
        int id;
        boolean isSit;
        int emptySpace;

        public Seat(int id, boolean isSit, int emptySpace) {
            this.id = id;
            this.isSit = isSit;
            this.emptySpace = emptySpace;
        }
        @Override
        public String toString() {
            return "["+id+","+isSit+","+emptySpace+"]\n";
        }
    }

    public static void main(String args[]) {
        long[][] result = solution(new String[]{"id=1 sit k=1", "id=2 sit k=3", "id=3 sit k=2", "id=2 leave", "id=4 sit k=4", "id=5 sit k=4"});

        if (result == null) {
            return;
        }

        for (int i = 0; i < result.length; ++i) {
            for (int j = 0; j < result[i].length; ++j) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
