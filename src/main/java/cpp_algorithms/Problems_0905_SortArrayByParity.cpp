#include <vector>

using namespace std;

class Solution {
public:
	vector<int> sortArrayByParity(vector<int>& A) {
		int idxLastEvenElem = 0;

		int buff;
		for (int i = 0; i < A.size(); ++i) {
			if (isEven(A[i])) {
				buff = A[idxLastEvenElem];
				A[idxLastEvenElem] = A[i];
				A[i] = buff;
				++idxLastEvenElem;
			}
		}

		return A;
	}
private:
	bool isEven(int elem) {
		return elem % 2 == 0;
	}
};