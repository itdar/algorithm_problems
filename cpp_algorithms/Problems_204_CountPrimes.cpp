#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
	// Using Sieve of Erotosthenes // 에라토스테네스의 체(거름막)
	int countPrimes(int n) {
		int count = 0;

		if (n < 2)
			return 0;

		std::vector<bool> sieveMap(n - 2, true);

		int length = sieveMap.size();

		for (int i = 0; i < length; ++i)
		{
			if (sieveMap[i] == true)
			{
				++count;
				for (int j = i + (i + 2); j < length; j = j + (i + 2))
				{
					sieveMap[j] = false;
				}
			}
		}
		return count;
	}
};


//int main(int args, char *argv[]) {
//
//	Solution sln;
//
//	cout << sln.countPrimes(10) << endl;
//
//}