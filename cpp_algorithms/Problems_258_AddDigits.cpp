#include <iostream>


using namespace std;


// Process
//1. Input number
//2. Iterate while digitSum is not a single digit
// 2.1. Make digitSum
//3. Return digitSum

//makeDigitSum
//1. Input number
//2. Iterate while it's not a single digit
// 2.1. add remainder after divide by 10 to digitSum
//3. Return digitSum

class Solution {
public:
	int addDigits(int num) {
		
		while (num > 9) {
			num = makeDigitSum(num);
		}
		return num;
	}

private:
	int makeDigitSum(int number) {
		int digitSum = 0;

		while (number > 9)
		{
			digitSum += (number % 10);
			number /= 10;
		}
		digitSum += number;

		return digitSum;
	}
};



//int main(int argc, char *argv[]) {
//
//	Solution sln;
//	cout << sln.addDigits(38) << endl;
//	
//
//}