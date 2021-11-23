#include <vector>

using namespace std;

// Process
// 1. Input image 2d vector
// 2. Make reverse number vector
// 3. Make bitnot vector
// 4. Return vector

class Solution {
public:
	vector<vector<int>> flipAndInvertImage(vector<vector<int>>& A) {
		for (int i = 0; i < A.size(); ++i) {
			reverse(A[i].begin(), A[i].end());
		}

		for (int i = 0; i < A.size(); ++i) {
			for (int j = 0; j < A[i].size(); ++j) {
				A[i][j] = abs(A[i][j] - 1);
			}
		}

		//for (int i = 0; i < A.size(); ++i) {
		//	for (int j = 0; j < A[i].size() / 2; ++j) {
		//		int temp = A[i][j];
		//		A[i][j] = A[i][A[i].size() - 1 - j];
		//		A[i][A[i].size() - 1 - j] = temp;
		//	}
		//}

		//for (int i = 0; i < A.size(); ++i) {
		//	for (int j = 0; j < A[i].size(); ++j) {
		//		if (A[i][j] == 1)
		//			A[i][j] = 0;
		//		else
		//			A[i][j] = 1;
		//	}
		//}

		return A;
	}
};