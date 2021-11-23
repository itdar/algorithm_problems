#include <vector>
#include <iostream>

using namespace std;

// Process
//1. Input two 2d vectors
//2. Make maximum size arrays
//3. Fill the arrays with vectors
//4. Compare arrays
//5. Return result

class Solution {
public:
	vector<vector<int>> intervalIntersection(vector<vector<int>>& A, vector<vector<int>>& B) {
		vector<vector<int>> resultVector;

		vector<int> interval1;
		vector<int> interval2;

		if (A.size() > 0 && B.size() > 0) {
			// 2. 
			int maxA = A[A.size() - 1][1];
			int maxB = B[B.size() - 1][1];
			int max;
			if (maxA > maxB)
				max = maxA * 2 + 2;
			else
				max = maxB * 2 + 2;

			for (int i = 0; i < max; ++i) {
				interval1.push_back(0);
				interval2.push_back(0);
			}

			// 3.
			for (int i = 0; i < A.size(); ++i) {
				for (int j = A[i][0] * 2; j <= A[i][1] * 2; ++j) {
					interval1[j] = 1;
				}
			}
			for (int i = 0; i < B.size(); ++i) {
				for (int j = B[i][0] * 2; j <= B[i][1] * 2; ++j) {
					interval2[j] = 1;
				}
			}

			// 4.
			for (int i = 0; i < max; ++i) {
				interval1[i] = interval1[i] & interval2[i];
			}

			// 5.
			int startIntersection = -1;
			int endIntersection = -1;
			for (int i = 0; i < max; ++i) {
				if (interval1[i] == 1 && startIntersection == -1) {
					startIntersection = i / 2;
				}
				else if (interval1[i] == 0) {
					if (startIntersection != -1) {
						endIntersection = i / 2;

						vector<int> tempVec;
						tempVec.push_back(startIntersection);
						tempVec.push_back(endIntersection);
						resultVector.push_back(tempVec);

						startIntersection = -1;
					}
				}
			}
		}

		// 6.
		return resultVector;
	}
};