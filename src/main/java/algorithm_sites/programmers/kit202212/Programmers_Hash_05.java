package algorithm_sites.programmers.kit202212;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Programmers_Hash_05 {


    public int[] solution(String[] genre, int[] plays) {
        if (genre == null || plays == null || genre.length == 0) {
            return new int[] {};
        }

        Map<String, Music> map = new HashMap<>();
        for (int i = 0; i < genre.length; ++i) {
            String genreName = genre[i];
            int play = plays[i];

            Music musicGetOrDefault = map.getOrDefault(genreName, new Music(genreName, 0, new PriorityQueue<>(Collections.reverseOrder())));
            musicGetOrDefault.total += play;
            musicGetOrDefault.priorityQueue.add(new Play(play, i));
            map.put(genreName, musicGetOrDefault);
        }

        List<Music> musicList = map.values().stream()
            .sorted(Comparator.comparing(value -> value.total, Collections.reverseOrder()))
            .collect(Collectors.toList());

        List<Integer> results = new ArrayList<>();
        for (Music music : musicList) {
            PriorityQueue<Play> priorityQueue = music.priorityQueue;
            int max = 2;
            for (int i = 0; i < max && !priorityQueue.isEmpty(); ++i) {
                results.add(priorityQueue.poll().index);
            }
        }

//        for (Entry<String, Music> stringMusicEntry : map.entrySet()) {
//            System.out.println(stringMusicEntry.getKey() + "," + stringMusicEntry.getValue());
//            PriorityQueue<Play> priorityQueue = stringMusicEntry.getValue().priorityQueue;
//            while (!priorityQueue.isEmpty()) {
//                Play play = priorityQueue.poll();
//                System.out.print(play.count + "," + play.index + "  ");
//            }
//            System.out.println("\n");
//        }

        int[] ints = results.stream()
            .mapToInt(value -> value)
            .toArray();

//        for (int anInt : ints) {
//            System.out.print(anInt + ",");
//        }

        return ints;
    }

    private static class Music implements Comparable<Music> {
        private String genre;
        private int total;
        private PriorityQueue<Play> priorityQueue;

        public Music(String genre, int total, PriorityQueue<Play> priorityQueue) {
            this.genre = genre;
            this.total = total;
            this.priorityQueue = priorityQueue;
        }

        @Override
        public int compareTo(Music o) {
            if (this.total >= o.total) {
                return 1;
            }
            return -1;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Music music = (Music) o;
            return Objects.equals(genre, music.genre);
        }

        @Override
        public int hashCode() {
            return Objects.hash(genre, total);
        }

        @Override
        public String toString() {
            return "Music{" +
                "genre='" + genre + '\'' +
                ", total=" + total +
                '}';
        }
    }

    private static class Play implements Comparable<Play> {
        private int count;
        private int index;

        public Play(int count, int index) {
            this.count = count;
            this.index = index;
        }

        @Override
        public int compareTo(Play o) {
            if (this.count >= o.count) {
                return 1;
            }
            return -1;
        }
    }

}
