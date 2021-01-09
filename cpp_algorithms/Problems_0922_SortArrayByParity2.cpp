#include <vector>

using namespace std;

class Solution {
public:
	vector<int> sortArrayByParityII(vector<int>& A) {
		vector<int> resultVector;
		vector<int> oddVector;
		vector<int> evenVector;

		for (int i = 0; i < A.size(); ++i)
		{
			if (A[i] % 2 == 1)
			{
				oddVector.push_back(A[i]);
			}
			else
			{
				evenVector.push_back(A[i]);
			}
		}

		for (int i = 0; i < oddVector.size(); ++i)
		{
			resultVector.push_back(evenVector[i]);
			resultVector.push_back(oddVector[i]);
		}

		return resultVector;
	}
};