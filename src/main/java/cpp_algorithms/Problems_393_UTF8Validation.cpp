#include <vector>
#include <iostream>
#include <string>


using namespace std;


// 처리과정
//1. 데이터 벡터 입력받는다.
//2. 데이터 시작부터 끝까지 반복한다.
// 2.1. 데이터를 binary로 변환한다.
//3. 데이터 시작부터 끝까지 반복한다.
// 3.1. utf 맨 앞 형식에 맞는지 확인해서 맞으면
//  3.1.1. 몇자인지 나온만큼 반복한다.
//   3.1.1.1. 앞자가 10 인지 확인한다.
//4. 결과 반환한다.


class Solution {
private:
	bool isDone = false;

public:
	bool validUtf8(vector<int>& data) {

		bool isValid = true;

		vector<string> convertedData;
		string convertedString;

		//convert decimal integer to binary string
		for (int i = 0; i < data.size(); ++i)
		{
			convertedString = convert2Binary(data[i]);
			convertedData.push_back(convertedString);
		}

		int validByteCount;

		for (int i = 0; i < convertedData.size() && isValid; ++i)
		{
			//cout << "binary : " << convertedData[i] << " ";

			//count number of 1 of the head byte
			validByteCount = checkFirstByte(convertedData[i]);

			if (validByteCount > 1)
			{
				//cout << "validByteCount : " << validByteCount << " ";

				int j = i + 1;

				//cout << "j : " << j << " " << "convertedDataSize : " << convertedData.size() << " ";

				if ((validByteCount - 1) > (convertedData.size() - j))
				{
					//cout << (validByteCount - 1) << " > " << (convertedData.size() - j);
					isValid = false;
				}
				//cout << isValid;

				while (--validByteCount > 0 && isValid)
				{
					if (j > convertedData.size() - 1 || !checkSequenceByte(convertedData[j]))
						isValid = false;
					++j;
				}
				i = --j;
				//cout << " i : " << i << endl;
			}
			else if (validByteCount != 0)
			{
				isValid = false;
			}
		}
		return isValid;
	}

private:
	string convert2Binary(int& integer) {
		string binaryString = "";

		if (integer < 256)
		{
			if (integer >= 128)
			{
				integer -= 128; binaryString += "1";
			}
			else
			{
				binaryString += "0";
			}
			if (integer >= 64)
			{
				integer -= 64; binaryString += "1";
			}
			else
			{
				binaryString += "0";
			}
			if (integer >= 32)
			{
				integer -= 32; binaryString += "1";
			}
			else
			{
				binaryString += "0";
			}
			if (integer >= 16)
			{
				integer -= 16; binaryString += "1";
			}
			else
			{
				binaryString += "0";
			}
			if (integer >= 8)
			{
				integer -= 8; binaryString += "1";
			}
			else
			{
				binaryString += "0";
			}
			if (integer >= 4)
			{
				integer -= 4; binaryString += "1";
			}
			else
			{
				binaryString += "0";
			}
			if (integer >= 2)
			{
				integer -= 2; binaryString += "1";
			}
			else
			{
				binaryString += "0";
			}
			if (integer >= 1)
			{
				integer -= 1; binaryString += "1";
			}
			else
			{
				binaryString += "0";
			}
		}
		else
		{
			return 0;
		}
		return binaryString;
	}

	/*
	* get the count of 1 in the byte string
	*/
	int checkFirstByte(const string& binaryString) {
		int validByteLength = 0;
		
		if (binaryString[0] == '0')
			return 0;
		else if (binaryString[0] != '1')
			return -1;

		for (int i = 1; i < 5; ++i)
		{
			if (binaryString[i] == '1')
			{
				if (binaryString[i - 1] == '1')
					++validByteLength;
				else
					return -1;

				if (i == 3 && binaryString[i+1] != '0')
					return -1;
			}
			else if (binaryString[i] == '0')
			{
				if (binaryString[i - 1] != '1')
					return -1;
				else
					return ++validByteLength;
			}
		}
		return validByteLength;
	}

	bool checkSequenceByte(string& binaryString) {
		if (binaryString[0] != '1' || binaryString[1] != '0')
			return false;
		return true;
	}
};





//int main(int args, char *argv[]) {
//
//	//vector<int> data = { 240,162,138,147,145 };			// 0
//	//vector<int> data = { 145 };					// 0
//	//vector<int> data = { 230, 136, 145 };			// 1
//	//vector<int> data = { 10 };						// 1
//	vector<int> data = { 248,130,130,130 };				// 0
//
//	Solution sln;
//	
//	bool answer = sln.validUtf8(data);
//
//
//	std::cout << endl << "answer : " << answer << endl;
//	
//}
