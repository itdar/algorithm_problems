#include <vector>

using namespace std;

// Process
//1. Input Alice's candies and Bob's candies
//2. Get total candy each and get fair amount of candy
//3. Find change number
//4. Return change number

class Solution {
public:
	vector<int> fairCandySwap(vector<int>& A, vector<int>& B) {
		vector<int> resultVector;

		int sumA = 0;
		for (int i = 0; i < A.size(); ++i) {
			sumA += A[i];
		}
		int sumB = 0;
		for (int i = 0; i < B.size(); ++i) {
			sumB += B[i];
		}
		int fairDiff = abs(sumA - (sumA + sumB) / 2);

		bool isDone = false;
		if (sumA > sumB) {
			for (int i = 0; !isDone && i < A.size(); ++i) {
				for (int j = 0; !isDone && j < B.size(); ++j) {
					if (A[i] - B[j] == fairDiff) {
						resultVector.push_back(A[i]);
						resultVector.push_back(B[j]);
						isDone = true;
					}
				}
			}
		}
		else {
			for (int i = 0; !isDone && i < B.size(); ++i) {
				for (int j = 0; !isDone && j < A.size(); ++j) {
					if (B[i] - A[j] == fairDiff) {
						resultVector.push_back(A[j]);
						resultVector.push_back(B[i]);
						isDone = true;
					}
				}
			}
		}
		return resultVector;
	}
};