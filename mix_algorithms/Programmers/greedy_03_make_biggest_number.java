package mix_algorithms.programmers;

// 문제에서 예를 들 때 전체 조합을 나열하고 가장 큰 것을 골라서 순서가 변해도 상관 없을 것 같으나,
// 실제로 답은 순서는 건드리지 않고 찾아나가야함.

// Process
// 1. Input
// 2. 결과 숫자를 만들 때 까지 반복한다.
//  2.1. 결과 숫자를 만들 때 필요한 최소 길이를 남기고 서브스트링을 만든다.
//  2.2. 서브스트링에서 가장 큰 숫자를 찾아서 더한다. 이 때, 해당 인덱스를 기억해서 다음번에 여기부터 서브스트링을 만든다.
//  2.3. 가장 큰 수를 결과에 더해둔다.
//  2.4. 인덱스를 바꾼다.
// 3. 결과 반환한다.

class MakeBiggestNumber {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder("");
        int stdLength = number.length()-k;
        int currentIndex = 0;
        
        char maxChar;
        String subName;
        int maxIdx;
        while (stdLength > 0) {
            maxChar = 48;
            subName = number.substring(currentIndex, number.length() - stdLength+1);
            maxIdx = 0;
            for (int i = 0; i < subName.length(); ++i) {
                if (maxChar < subName.charAt(i)) {
                    maxChar = subName.charAt(i);
                    maxIdx = i;
                }
            }
            answer.append(maxChar);
            currentIndex = currentIndex + maxIdx + 1;
            --stdLength;
        }
        
        return answer.toString();
    }
}