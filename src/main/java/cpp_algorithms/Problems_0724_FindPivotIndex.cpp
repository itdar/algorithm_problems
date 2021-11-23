#include <vector>

using namespace std;

// high performance
class Solution {
public:
	int pivotIndex(vector<int>& nums) {
		int pivotIndex = -1;

		int frontSum = 0;
		float totalSum = 0;

		for (int val : nums) {
			totalSum += val;
		}

		int sum = 0;
		for (int i = 0; pivotIndex == -1 && i < nums.size(); ++i) {
			sum += nums[i];
			if (sum - nums[i] == (totalSum - nums[i]) / 2) {
				pivotIndex = i;
			}
		}

		return pivotIndex;
	}
};


//
//// basic concept
//class Solution {
//public:
//	int pivotIndex(vector<int>& nums) {
//		int pivotIndex = -1;
//
//		int frontSum;
//		int rearSum;
//
//		for (int i = 0; pivotIndex == -1 && i < nums.size(); ++i) {
//			frontSum = 0;
//			rearSum = 0;
//			for (int j = i - 1; j >= 0; --j) {
//				frontSum += nums[j];
//			}
//			for (int j = i + 1; j < nums.size(); ++j) {
//				rearSum += nums[j];
//			}
//			if (frontSum == rearSum)
//				pivotIndex = i;
//		}
//		return pivotIndex;
//	}
//
//};