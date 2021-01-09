#include <iostream>
#include <string>


using namespace std;


// 처리과정
//1. 엑셀시트 컬럼 문자를 입력받는다.
//2. 시작부터 끝까지 반복한다.
// 2.1. 해당 알파벳 숫자와 26의 인덱스 제곱을 결과값에 더한다.
//3. 결과값을 반환한다.


class Solution {
public:
	int titleToNumber(string s) {
		int answerNumber = 0;

		for (int i = 0; i < s.size(); ++i)
		{
			answerNumber += ((s[i] - 64) * pow(26, s.size() - 1 - i));
		}

		return answerNumber;
	}
};


//int main(int argc, char *argv[]) {
//
//	//cout << "Hello" << endl;
//	string inputString = "AAB";
//
//	Solution sln;
//
//	cout << sln.titleToNumber(inputString) << endl;
//
//}