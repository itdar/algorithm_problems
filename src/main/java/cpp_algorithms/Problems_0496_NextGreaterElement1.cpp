#include <vector>

using namespace std;

class Solution {
public:
	vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
		vector<int> resultVector;

		for (int i = 0; i < nums1.size(); ++i) {
			int temp = nums1[i];
			bool isDone = false;
			int j = 0;
			while (!isDone && j < nums2.size()) {
				if (temp == nums2[j]) {
					isDone = true;
				}
				++j;
			}
			if (isDone) {
				isDone = false;
				while (!isDone && j < nums2.size()) {
					if (temp < nums2[j]) {
						isDone = true;
						--j;
					}
					++j;
				}
				if (isDone)
					resultVector.push_back(nums2[j]);
				else
					resultVector.push_back(-1);
			}
		}

		return resultVector;
	}
};