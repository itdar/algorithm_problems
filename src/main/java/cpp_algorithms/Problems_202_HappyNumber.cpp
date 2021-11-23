#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;


class Solution {
public:
	bool isHappy(int n) {
		vector<int> previousInt;
		bool isDone = false;
		while (n != 1 && !isDone) {
			sumOfAllPowerOfDigits(n);
			if (find(previousInt.begin(), previousInt.end(), n) != previousInt.end()) {
				isDone = true;
			}
			else {
				previousInt.push_back(n);
			}
			cout << n << endl;
		}
		return n == 1;
	}
private:
	void sumOfAllPowerOfDigits(int& n) {
		int sum = 0;
		while (n != 0) {
			sum += pow((n % 10), 2);
			n /= 10;
		}
		n = sum;
	}
};

//int main(int argc, char *argv[]) {
//
//	//cout << "Hello" << endl;
//
//	Solution sln;
//	//cout << sln.isHappy(19) << endl;
//	cout << sln.isHappy(7) << endl;
//
//}