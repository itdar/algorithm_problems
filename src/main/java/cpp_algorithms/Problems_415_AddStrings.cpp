#include <iostream>
#include <string>

using namespace std;


// Process
//1. Input two strings
//2. Set iteration length
//3. Make returnString using short string length
//4. Make returnString using last length, if it still has overDigit
//5. Return returnString(pointer)

// 처리과정
//1. 스트링 두개 입력받는다.
//2. 반복할 길이를 정한다. (짧은 것에 맞추어)
//3. 짧은 길이만큼 더해서 returnString 을 만든다.
//4. 나머지 길이만큼 returnString을 만든다 (자릿수 넘는 수가 있으면)
//5. 만들어진 returnString 을 반환한다.

class Solution {
public:
	string addStrings(string num1, string num2) {

		string *returnString;

		int n1 = num1.size();
		int n2 = num2.size();

		// Set length and Choose returnString
		int length;
		if (n1 >= n2)
		{
			length = n2;
			returnString = &num1;
		}
		else
		{
			length = n1;
			returnString = &num2;
		}

		// Make returnString till short input number
		int overDigit = 0;
		int int1;
		int int2;
		int sumNum;
		for (int i = 1; i <= length; ++i)
		{
			int1 = num1[n1 - i] - 48;
			int2 = num2[n2 - i] - 48;

			sumNum = int1 + int2 + overDigit;
			//cout << int1 << " " << int2 << "  " << overDigit << "   " << sumNum << " " << endl;
			if (sumNum < 10)
			{
				returnString->at(returnString->size() - i) = (sumNum + 48);
				overDigit = 0;
			}
			else
			{
				returnString->at(returnString->size() - i) = (sumNum + 38);
				overDigit = 1;
			}
		}

		if (overDigit == 1)
		{
			// Make returnString if it still have overDigit
			length = abs(n1 - n2) - 1;
			//cout << length << endl;
			for (int i = length; i >= 0; --i)
			{
				int1 = returnString->at(i) - 48;
				sumNum = int1 + overDigit;
				cout << sumNum << endl;
				if (sumNum < 10)
				{
					returnString->at(i) = (sumNum + 48);
					overDigit = 0;
				}
				else
				{
					returnString->at(i) = (sumNum + 38);
					overDigit = 1;
				}
			}
		}

		if (overDigit == 1)
			returnString->insert(returnString->begin(), 49);
		
		return *returnString;
	}
};


//int main(int argc, char *argv[]) {
//
//	string num1 = "9";
//	string num2 = "99";
//
//	Solution sln;
//	
//	cout << sln.addStrings(num1, num2) << endl;
//	
//	cout << 9 + 99 << endl;
//
//
//}