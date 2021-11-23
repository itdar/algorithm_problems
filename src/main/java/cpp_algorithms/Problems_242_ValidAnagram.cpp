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

//ó������
//1. ��Ʈ�� s, t �� �Է¹޴´�.
//2. s �� ���ۺ��� ������ �ݺ��Ѵ�.
// 2.1. s ���ڿ� ���ĺ� ���� �迭�� �����.
//3. t �� ���ۺ��� ������ �ݺ��Ѵ�.
// 3.1. t ���ڿ� ���ĺ� ���� �迭�� �����.
//4. ���� �迭�� ���Ѵ�.
//5. ��� ��ȯ�Ѵ�.

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