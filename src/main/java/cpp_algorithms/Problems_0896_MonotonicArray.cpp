#include <vector>
#include <iostream>

using namespace std;

// Process
//1. Input vector A
//2. If it's size <= 1, then return true;
//3. Compare [0] and [1], and decide increase/decrease flag
//4. Iterate from 1 to the end - 1 (i)
// 4.1. Check if i'th and i+1'th values are fit to flag
//  4.1.1. If not -> it's false result
//5. Return result;

class Solution {
public:
	bool isMonotonic(vector<int>& A) {
		bool result = true;
		bool isIncrease;

		if (A.size() < 1)
			return false;

		if (A[0] <= A[A.size() - 1])
			isIncrease = true;
		else
			isIncrease = false;

		for (int i = 0; result && i < A.size()-1; ++i) {
			if (A[i] == A[i + 1]) {

			}
			else if (A[i] > A[i + 1] && isIncrease) {
				result = false;
			}
			else if (A[i] < A[i + 1] && !isIncrease) {
				result = false;
			}
		}

		return result;
	}
};

//int main(int argc, char*(*argv)) {
//
//	Solution sln;
//
//	vector<int> test;
//	test.push_back(1);
//	test.push_back(2);
//	test.push_back(3);
//
//	cout << sln.isMonotonic(test) << endl;
//
//
//}