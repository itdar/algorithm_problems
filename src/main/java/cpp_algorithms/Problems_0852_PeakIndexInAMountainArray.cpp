#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
	int peakIndexInMountainArray(vector<int>& A) {
		//1
		// return distance(A.begin(), max_element(A.begin(), A.end()));

		//2
		int peakIndex = 0;
		int maxVal = -1;
		bool isDone = false;
		for (int i = 0; !isDone && i < A.size(); ++i) {
			if (A[i] > maxVal)
			{
				maxVal = A[i];
				peakIndex = i;
			}
			else
			{
				isDone = true;
			}
		}
		return peakIndex;
	}
};