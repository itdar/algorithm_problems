#include <string>
#include <vector>
#include <iostream>
#include <sstream>

// 처리과정
//1. 문자열 s 입력받는다.
//2. 문자열길이/2 의 결과문자열배열 만들어둔다.
//3. 1부터 s length/2 까지 반복한다. (i)
// 3.1. 시작(j)부터 j+(i-1) 가 length 넘지 않을 때까지 반복한다. (j+=i)
//  3.1.1. i 만큼씩 substring 한 것을 이전 스트링과 비교해서
//   3.1.1.1. 같으면 -> 숫자 세고, 하나 지운다.
//   3.1.1.2. 다르면 -> 만들어둔 결과문자열배열 i 번째에 해당 substring 넣는다. (count 0 이면 문자만, > 0 이면 숫자도)
//

using namespace std;

int solution(string s) {
	if (s.length() == 1)
		return 1;

	int substringRange = s.length() / 2;
	// 2.
	vector<string> resultStrings;
	for (int i = 0; i < substringRange; ++i) {
		resultStrings.push_back("");
	}
	// 3.
	for (int i = 0; i + 1 <= substringRange; ++i) {
		int count = 1;
		string nextString;
		int j = 0;
		while (j + (i + 1) <= s.length()) {
			string currentStr = s.substr(j, i + 1);
			nextString = s.substr(j + (i + 1), i + 1);
			//cout << " " << "currentStr : " << currentStr << " " << "nextString : " << nextString << endl;
			if (currentStr == nextString) {
				++count;
			}
			else {
				if (count == 1) {
					resultStrings[i] += currentStr;
				}
				else {
					stringstream ss;
					ss << count;
					resultStrings[i] += ss.str();
					resultStrings[i] += currentStr;

					count = 1;
				}
			}
			j += (i + 1);
		}
		while (j < s.length()) {
			resultStrings[i] += s[j];
			++j;
		}
	}

	// 4.
	int smallestLength = resultStrings[0].length();
	for (int i = 1; i < resultStrings.size(); ++i) {
		if (smallestLength > resultStrings[i].length()) {
			smallestLength = resultStrings[i].length();
		}
	}

	return smallestLength;
}

//int main() {
//	//string test1 = "aabbaccc";
//	string test1 = "a";
//	string test2 = "ababcdcdababcdcd";
//	string test3 = "abcabcdede";
//	string test4 = "abcabcabcabcdededededede";
//	string test5 = "xababcdcdababcdcd";
//
//	cout << "this : " << test1 << endl;
//	cout << solution(test1) << endl;
//
//	
//	return 0;
//}