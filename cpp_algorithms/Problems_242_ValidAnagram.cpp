#include <iostream>
#include <string>
#include <vector>

using namespace std;

//Process
//1. Input string s, t
//2. Iterate s from begin to the end
// 2.1. Make s alphabet table
//3. Iterate t from begin to the end
// 3.1. Make t alphabet table
//4. Compare two tables
//5. Return answer

//처리과정
//1. 스트링 s, t 를 입력받는다.
//2. s 의 시작부터 끝까지 반복한다.
// 2.1. s 문자열 알파벳 개수 배열을 만든다.
//3. t 의 시작부터 끝까지 반복한다.
// 3.1. t 문자열 알파벳 개수 배열을 만든다.
//4. 만든 배열들 비교한다.
//5. 결과 반환한다.

class Solution {
public:
	bool isAnagram(string s, string t) {
		bool answer = true;

		int alphabetArray1[26] = { 0 };
		int alphabetArray2[26] = { 0 };

		for (int i = 0; i < s.size(); ++i)
		{
			++alphabetArray1[s[i] - 97];
		}
		for (int i = 0; i < t.size(); ++i)
		{
			++alphabetArray2[t[i] - 97];
		}

		for (int i = 0; i < (sizeof(alphabetArray1) / sizeof(*alphabetArray1)); ++i)
		{
			if (alphabetArray1[i] != alphabetArray2[i])
			{
				return false;
			}
		}
		return answer;
	}
};

//int main(int args, char* argv[]) {
//
//	cout << "Hell" << endl;
//
//
//
//
//}