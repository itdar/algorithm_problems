#include <iostream>
#include <string>


using namespace std;


// ó������
//1. ������Ʈ �÷� ���ڸ� �Է¹޴´�.
//2. ���ۺ��� ������ �ݺ��Ѵ�.
// 2.1. �ش� ���ĺ� ���ڿ� 26�� �ε��� ������ ������� ���Ѵ�.
//3. ������� ��ȯ�Ѵ�.


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