#include <vector>
#include <iostream>

using namespace std;

// Process
//1. Input integer vector
//2. Iterate from begin to the end
// 2.1. Check if it's in previousInt vector
//  2.1.1. If not -> add to previousInt
//  2.1.2. If so -> Check if it's exist more than n/2 times
//3. Return majorityInt

class Solution {
public:
	int majorityElement(vector<int>& nums) {
		int majorityInt = 0;

		bool isDone = false;
		std::vector<int> previousInt;
		for (int i = 0; !isDone && i < nums.size(); ++i) {
			if (std::find(previousInt.begin(), previousInt.end(), nums[i]) != previousInt.end()) {
				
			}
			else {
				int count = 1;
				for (int j = i + 1; j < nums.size(); ++j) {
					if (nums[i] == nums[j])
						++count;
				}
				if (count > nums.size() / 2) {
					majorityInt = nums[i];
					isDone = true;
				}
				previousInt.push_back(nums[i]);
			}
		}

		return majorityInt;
	}
};

//int main(int argc, char *argv[]) {
//
//	Solution sln;
//
//	vector<int> input = { 3, 2, 3 };
//
//	cout << sln.majorityElement(input) << endl;
//
//}