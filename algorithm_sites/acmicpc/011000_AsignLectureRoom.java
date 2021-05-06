package algorithm_sites.acmicpc;

import java.util.*;
import java.io.*;

// Process
// 1. Input lecture count, lecture start and end times
// 2. lecture times를 시작시간 기준 오름차순으로 정렬한다.
// 3. 강의실 사용 우선순위큐를 만들어 종료시간을 기준으로 오름차순 poll 되도록 한다.
// 4. 강의시간을 전체 반복한다.
//  4.1. 강의실 사용 시간들 중, 가장 먼저 끝나는 시간의 강의실에 강의를 넣을 수 있는지 확인해서
//   4.1.1. 있으면 -> 끝나는 시간 변경한다.
//   4.1.2. 없으면 -> 강의실 새로 추가해서 끝나는 시간 넣는다.
// 5. 필요 강의실 개수 반환한다.

// 퍼포먼스를 위해서는 priority queue 써서, 강의실 사용 시간 중 가장 먼저 끝나는 시간을 계속 최신화 유지해야함

class AsignLectureRoom {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countLecture = Integer.parseInt(br.readLine());

        List<Lecture> lectures = new ArrayList<>();
        for (int i = 0; i < countLecture; ++i) {
            String[] temp = br.readLine().split(" ");
            lectures.add(new Lecture(Integer.parseInt(temp[0]), Integer.parseInt(temp[1])));
        }
        
        // 2.
        Collections.sort(lectures);

        // 3.
        Queue<Integer> lectureRooms = new PriorityQueue<>();
        lectureRooms.add(0);

        // 4.
        for (int i = 0; i < lectures.size(); ++i) {
            int nearestEndTime = lectureRooms.poll();
            if (nearestEndTime > lectures.get(i).start) {
                lectureRooms.add(nearestEndTime);
            }
            lectureRooms.add(lectures.get(i).end);
        }

        System.out.println(lectureRooms.size());
    }
    
}

class Lecture implements Comparable<Lecture> {
    int start;
    int end;

    public Lecture(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Lecture o) {
        if (this.start > o.start) {
            return 1;
        }
        if (this.start == o.start) {
            return 0;
        }
        return -1;
    }
}
