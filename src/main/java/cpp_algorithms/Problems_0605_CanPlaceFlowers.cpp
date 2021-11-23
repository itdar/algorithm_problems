#include <vector>
#include <iostream>

using namespace std;

// Process
//1. Input flowerbed and int n
//2. Iterate from begin to the end (flowerbed)
// 2.1. Check if it's 0 or 1
//  2.1.1. If it's 1 -> next 2
//  2.1.2. If it's 0
//   2.1.2.1. Check if it's adjacent 1
//    2.1.2.1.1. If not -> count
//    2.1.2.1.2. If so -> next 2
//3. Return count

class Solution {
public:
	bool canPlaceFlowers(vector<int>& flowerbed, int n) {
		bool result = false;
		int count = 0;

		for (int i = 0; i < flowerbed.size(); ++i) {
			if (flowerbed[i] == 0) {
				if ((i == 0 || flowerbed[i - 1] == 0) &&
					(i == flowerbed.size()-1 || flowerbed[i + 1] == 0)) {
					++count;
					++i;
				}
			}
			else {
				++i;
			}
		}

		if (count >= n)
			result = true;

		return result;
	}
};

//void main(int argc, char *argv[]) {
//
//	vector<int> inputVector = { 0, 0, 1, 0, 1 };
//
//	Solution sln;
//	cout << sln.canPlaceFlowers(inputVector, 1) << endl;
//
//}