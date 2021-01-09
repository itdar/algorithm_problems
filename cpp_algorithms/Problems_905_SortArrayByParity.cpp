#include <vector>
#include <iostream>

using namespace std;

class Solution {
public:
	// Process
	//1. Input integer vector
	//2. Iterate from begin to the end
	// 2.1. If it's odd integer -> add to the end of the answerVector
	// 2.2. If it's even integer -> add to the begin of the answerVector
	//3. Return answerVector

	// solution 1 - better performance
	vector<int> sortArrayByParity(vector<int>& A) {
		vector<int> answerVector;
		for (int i = 0; i < A.size(); ++i)
		{
			if (A[i] % 2 != 0)  // if it's odd number
			{
				answerVector.push_back(A[i]);
			}
			else                // if it's even number
			{
				answerVector.insert(answerVector.begin(), A[i]);
			}
		}
		return answerVector;
	}

	// Process
	//1. Input integer vector
	//2. Iterate from begin to the end
	// 2.1. If it's even integer -> move it to the begin
	//3. Return vector

	//solution 2 - better memory usage
	//vector<int> sortArrayByParity(vector<int>& A) {

	//	for (int i = 0; i < A.size(); ++i)
	//	{
	//		if (A[i] % 2 == 0)  // if it's odd number
	//		{
	//			A.insert(A.begin(), A[i]);
	//			A.erase(A.begin() + i + 1);
	//		}
	//	}
	//	return A;
	//}
};

//int main(int args, char *argv[]) {
//	
//	std::vector<int> inputVector;
//	inputVector.push_back(3);
//	inputVector.push_back(1);
//	inputVector.push_back(2);
//	inputVector.push_back(4);
//
//	Solution sln;
//	vector<int> outputVector = sln.sortArrayByParity(inputVector);
//
//	for (int i = 0; i < outputVector.size(); ++i)
//	{
//		cout << outputVector[i] << endl;
//	}
//	
//	
//}