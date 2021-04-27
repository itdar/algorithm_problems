package algorithm_sites.acmicpc;

import java.io.*;
import java.util.*;

// Process
// 1. Input 아파트수, 버스정원, 학교위치, 각 단치위치와 학생수들
// 2. 아파트들을 학교와의 거리 양수/음수로 나눈다.
// 3. 아파트들을 거리를 기준으로 양수거리 / 음수거리 각각 내림차순 / 오름차순 정렬한다.
// 4. 남은 아파트가 있으면 반복한다. (모든 학생을 옮길 때 까지, 양수/음수 따로)
//  4.1. 총 이동거리에 (가장 먼거리의 아파트 거리 * 2) 를 더한다.
//  4.2. 버스정원이 꽉 찰때까지 아파트마다 학생들을 채운다.
//   4.2.1. 이 때, 학생을 다 채운 아파트는 제거한다.
// 5. 총 이동거리를 출력한다.

class SchoolBus {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int movingDistance = 0;

        // 1.
        String[] firstLine = reader.readLine().split(" ");
        int countApartment = Integer.parseInt(firstLine[0]);
        int capacityBus = Integer.parseInt(firstLine[1]);
        int locationSchool = Integer.parseInt(firstLine[2]);
        // 2.
        List<Apartment> apartRight = new ArrayList<>();
        List<Apartment> apartLeft = new ArrayList<>();
        for (int i = 0; i < countApartment; ++i) {
            String[] line = reader.readLine().split(" ");
            if (Integer.parseInt(line[0]) - locationSchool < 0) {
                apartLeft.add(new Apartment(Integer.parseInt(line[0]), 
                locationSchool - Integer.parseInt(line[0]),
                Integer.parseInt(line[1])));
            } else {
                apartRight.add(new Apartment(Integer.parseInt(line[0]), 
                Integer.parseInt(line[0]) - locationSchool,
                Integer.parseInt(line[1])));
            }
        }

        // 3.
        Collections.sort(apartRight, Collections.reverseOrder());
        Collections.sort(apartLeft, Collections.reverseOrder());

        // for (int i = 0; i < apartRight.size(); ++i) {
        //     System.out.print(apartRight.get(i).distance + " ");
        // } System.out.println("");
        // for (int i = 0; i < apartLeft.size(); ++i) {
        //     System.out.print(apartLeft.get(i).distance + " ");
        // } System.out.println("");

        // 4.
        int remainedCapacity;
        while (apartRight.size() > 0) {
            Apartment apart = apartRight.get(0);
            movingDistance += (apart.distance * 2);
            remainedCapacity = capacityBus;

            while (remainedCapacity > 0 && apartRight.size() > 0) {
                if (remainedCapacity >= apart.countStudent) {
                    remainedCapacity -= apart.countStudent;
                    apartRight.remove(0);
                    if (apartRight.size() > 0)
                        apart = apartRight.get(0);
                } else {
                    apart.countStudent -= remainedCapacity;
                    remainedCapacity = 0;
                }
            }
        }
        while (apartLeft.size() > 0) {
            Apartment apart = apartLeft.get(0);
            movingDistance += (apart.distance * 2);
            remainedCapacity = capacityBus;

            while (remainedCapacity > 0 && apartLeft.size() > 0) {
                if (remainedCapacity >= apart.countStudent) {
                    remainedCapacity -= apart.countStudent;
                    apartLeft.remove(0);
                    if (apartLeft.size() > 0)
                        apart = apartLeft.get(0);
                } else {
                    apart.countStudent -= remainedCapacity;
                    remainedCapacity = 0;
                }
            }
        }
        
        // 5.
        System.out.println(movingDistance);
    }
    
}

class Apartment implements Comparable<Apartment> {
    public int location;
    public int distance;
    public int countStudent;

    public Apartment(int location, int distance, int countStudent) {
        this.location = location;
        this.distance = distance;
        this.countStudent = countStudent;
    }

    @Override
    public int compareTo(Apartment o) {
        return this.distance >= o.distance ? 1 : -1;
    }
    
}
