#include <string>
#include <sstream>

class Solution {
public:
	//Process
	//1. Input n
	//2. Iterate till n
	// 2.1. Read countSay
	//3. Return countSay
	//4. Finish
	std::string countAndSay(int n) {
		std::string countSay = "1";
		for (int i = 1; i < n; ++i)
		{
			countSay = sayNumber(countSay);
			// cout << i << " " << countSay << endl;
		}
		return countSay;
	}

	//Read countSay(2.1.)
	//1. Input inputNumber
	//2. Iterate from begin to the end
	// 2.1. Iterate till begin diff number or end of inputNumber
	//  2.1.1. count
	// 2.2. Add countNumber and number
	std::string sayNumber(std::string countSay) {
		std::string answerString = "";
		int count = 1;
		for (int i = 0; i < countSay.length(); ++i)
		{
			if (countSay[i] == countSay[i + 1])
			{
				count++;
			}
			else
			{
				// cout << count << endl;
				answerString += itos(count);
				answerString += countSay[i];
				count = 1;
				// ++i;
			}
		}
		return answerString;
	}

	std::string itos(int integer) {
		std::stringstream ss;
		ss << integer;
		return ss.str();
	}
};