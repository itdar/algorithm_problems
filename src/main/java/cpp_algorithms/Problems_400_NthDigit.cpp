#include <iostream>
#include <string>
#include <sstream>


using namespace std;


// ó������
//1. ���� n�� �Է¹޴´�.
//2. n�� ���ڸ� �� ���ڿ� ���ԵǴ��� ã�´�. (�ڸ��� ���� ã��)
//3. �ش� �ڸ��� ���ڿ��� ���� ã�´�. (�� ã��)
//4. ã�� ���� ��ȯ�Ѵ�.

// �ڸ��� ���� ã��
//1. ���� n�� �Է¹޴´�.
//2. �ڸ������� n ���� Ŭ������ �ݺ��Ѵ�. (i�� 1����)
//  2.1.1. n���� ������ �ڸ����տ� 9*i * 10^(i-1) �� ���Ѵ�.
//  2.1.2. �ڸ���ī��Ʈ ����.
//3. ���� �ڸ����պ��� n �� �󸶳� �� ū�� ���صд�. (�ش� �ڸ������� ������ ��)
//3. �ڸ���ī��Ʈ, ������ ���� ��ȯ�Ѵ�.

// �� ã��
//1. �ڸ����� ������ ���� �Է¹޴´�.
//2. ������ ���� �ڸ����� ���� ��� �������� ���Ѵ�.
//3. ��ŭ �ڸ������� +=1 �� �����Ѵ�.
//4. ��������ŭ �ش� �ڸ������� �̵��ؼ� ���� ���Ѵ�.
//5. ���� ���� ��ȯ�Ѵ�.

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