package algorithm_sites.programmers;

// ASCII 65~ 90 (A~ Z)
// Process #2  (greedy)
// 1. Input name
// 2. Make list or Map using Index and DiffCount of diff things
// 3. Iterate while all list is removed
//  3.1. Move to shorter distance (left or right)
//  3.2. Count moving distance
//  3.3. Count char diff
//  3.4. Remove that thing from the list
// 4. Return result count

import java.util.*;


class Joystick {
    public int solution(String name) {
        int count = 0;
        int currentIndex = 0;
        // HashMap으로 바꿔도 될 듯
        List<List<Integer>> listDiff = new ArrayList<>();
        
        // 2.
        int diff = -1;
        for (int i = 0; i < name.length(); ++i) {
            diff = countCharChange(name.charAt(i));
            if (diff != 0) {
                List<Integer> listIndexCount = new LinkedList<>();
                listIndexCount.add(i);
                listIndexCount.add(diff);
                listDiff.add(listIndexCount);
            }
        }
        
        int distanceToLeft = 0;
        int distanceToRight = 0;
        // 3.
        while (listDiff.size() > 0) {
            // 여기가 4, 7번이 걸리는 이유
            // 왼쪽으로 간다 혹은 오른쪽으로 간다 했을 때,
            // 왼쪽의 경우
            //   현재인덱스에서 ~ 0까지 +1(왼쪽맨뒤로이동) + 왼쪽맨뒤인덱스 ~ 다른값이 있는 인덱스까지, 이 한가지만 생각했는데
            //   추가적으로, 현재인덱스가 이미 뒤로 이동한 상태에서 왼쪽으로 가면 (현재인덱스 - 다른값이 있는 인덱스) 거리가 성립한다.
            //   둘 중에 더 짧은 거리로 가는 것.
            // 오른쪽을 추가로 설명하면
            //   abs(현재인덱스 - 오른쪽맨앞인덱스) 만 고려를 했었으나,
            //   추가적으로, 현재인덱스가 이미 뒤로 이동한 상태에서 왼쪽으로 가면 (전체길이맨뒤인덱스 - 현재인덱스 + 1(맨앞이동) + 오른쪽맨앞인덱스) 거리가 성립한다.
            //   둘 중에 더 짧은 거리로 가는 것은 동일하다.
            // 전부 abs 씌워서 거리로 계산하는 것이 편하겠고.. 11번은 설명부족이고, 4,7번은 실력부족인듯.
            // 그리디가 맞는가 아닌가 고민했지만 그리디 맞음
            distanceToLeft = Math.min(
                Math.abs(currentIndex-listDiff.get(listDiff.size()-1).get(0)), currentIndex + name.length() - listDiff.get(listDiff.size()-1).get(0));
            distanceToRight = Math.min(
                Math.abs(name.length() - currentIndex + listDiff.get(0).get(0)), Math.abs(listDiff.get(0).get(0) - currentIndex));
            
            // 여기가 11번이 걸리는 이유
            // 오른쪽이동거리 >= 왼쪽이동거리 으로 했을 경우, 동률의 경우에 왼쪽으로 가는데,
            // 문제 설명에는 없지만 오른쪽으로만 가야 11번이 통과됨. 문제 설명 부실
            if (distanceToRight > distanceToLeft) 
            {
                count += distanceToLeft;
                count += listDiff.get(listDiff.size()-1).get(1);
                
                currentIndex = listDiff.get(listDiff.size()-1).get(0);
                listDiff.remove(listDiff.size()-1);
            } 
            else
            {
                count += distanceToRight;
                count += listDiff.get(0).get(1);
                
                currentIndex = listDiff.get(0).get(0);
                listDiff.remove(0);
            }
        }
        
        return count;
    }
    
    
    public int countCharChange(char nameAscii) {
        int count = 0;
        int temp = nameAscii - 65;
        if (temp >= 13)
            count += (26 - temp);
        else
            count += temp;
        return count;
    }
}