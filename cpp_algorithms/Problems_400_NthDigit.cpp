#include <iostream>
#include <string>
#include <sstream>


using namespace std;


// 처리과정
//1. 정수 n을 입력받는다.
//2. n이 몇자리 수 숫자에 포함되는지 찾는다. (자릿수 길이 찾기)
//3. 해당 자리수 숫자에서 수를 찾는다. (수 찾기)
//4. 찾은 수를 반환한다.

// 자릿수 길이 찾기
//1. 정수 n을 입력받는다.
//2. 자릿수합이 n 보다 클때까지 반복한다. (i는 1부터)
//  2.1.1. n보다 작으면 자릿수합에 9*i * 10^(i-1) 을 더한다.
//  2.1.2. 자릿수카운트 센다.
//3. 이전 자릿수합보다 n 이 얼마나 더 큰지 구해둔다. (해당 자리수에서 오버된 수)
//3. 자릿수카운트, 오버된 수를 반환한다.

// 수 찾기
//1. 자릿수와 오버된 수를 입력받는다.
//2. 오버된 수를 자릿수로 나눈 몫과 나머지를 구한다.
//3. 몫만큼 자릿수에서 +=1 씩 진행한다.
//4. 나머지만큼 해당 자릿수에서 이동해서 수를 구한다.
//5. 구한 수를 반환한다.

class Solution {
private:
	void findDigitLength(int n, int *digitLength, int *overLength) {
		double lengthSum = 0;
		bool isDone = false;
		double nextDigitSum;
		while (!isDone)
		{
			nextDigitSum = (9 * *digitLength) * pow(10, *digitLength - 1);
			if (lengthSum + nextDigitSum < n)
			{
				++*digitLength;
			}
			else
			{
				*overLength = n - lengthSum;
				isDone = true;
			}
			lengthSum += nextDigitSum;
		}
	}

	int findDigit(int *digitLength, int *overLength) {
		int digit;

		if (*digitLength == 1)
			return *overLength;

		int remainder = *overLength % *digitLength;
		int quotient = *overLength / *digitLength;

		int number = pow(10, *digitLength - 1);
		for (int i = 0; i < quotient; ++i)
		{
			++number;
		}

		int length;
		if (remainder != 0)
		{
			length = *digitLength - remainder;
		}
		else
		{
			length = 0;
			--number;
		}

		cout << number << " " << length << endl;

		for (int i = 0; i < length; ++i)
		{
			number /= 10;
		}

		digit = number % 10;
		
		return digit;
	}


public:
	int findNthDigit(int n) {
		int digitLength = 1;
		int overLength = 0;
		findDigitLength(n, &digitLength, &overLength);

		int digit = findDigit(&digitLength, &overLength);

		//cout << n << " " << digitLength << " " << overLength << endl;
		//cout << "answer : " << digit << endl;

		return digit;
	}

};


//int main(int args, char* argv[]) {
//	
//	Solution sln;
//
//	sln.findNthDigit(15);
//
//
//}