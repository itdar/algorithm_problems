#include <vector>
#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

// Process
//1. Input string S
//2. Make char vector with index
//3. Iterate 0 to charVector size (i)
// 3.1. Iterate begin to the end (j)
//  3.1.1. Iterate j to j+i

class Solution {
public:
	vector<string> letterCasePermutation(string S) {
		vector<string> resultVector;
		vector<pair<int, char>> charVector;

		//2. Make char vector with index
		for (int i = 0; i < S.size(); ++i) {
			if ((S[i] >= 65 && S[i] <= 90) || (S[i] >= 97 && S[i] <= 122)) {
				charVector.push_back(make_pair(i, S[i]));
			}
		}


		return resultVector;
	}
};

//int main(int argc, char* argv[]) {
//	Solution sln;
//
//	string S = "a3f";
//	sln.letterCasePermutation(S);
//}