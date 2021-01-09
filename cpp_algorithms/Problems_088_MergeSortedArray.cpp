#include <vector>

using namespace std;

class Solution {
public:
	void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
		int nums1Index = 0;
		int nums2Index = 0;

		vector<int> resultVector;

		while (nums1Index < m && nums2Index < n) {
			if (nums1[nums1Index] < nums2[nums2Index]) {
				resultVector.push_back(nums1[nums1Index++]);
			}
			else {
				resultVector.push_back(nums2[nums2Index++]);
			}
		}
		while (nums1Index < m) {
			resultVector.push_back(nums1[nums1Index++]);
		}
		while (nums2Index < n) {
			resultVector.push_back(nums2[nums2Index++]);
		}
		nums1 = resultVector;
	}
};