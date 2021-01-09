// Process
//1. Input string S
//2. Check start int I, D
//3. Iterate from begin to the end of S (i)
// 3.1. Check if it's I or D
//  3.1.1. If it's I -> push_back(intI) and ++
//  3.1.1. If it's D -> push_back(intD) and --
//4. Return resultVector

#include <vector>
#include <string>

using namespace std;

class Solution {
public:
	vector<int> diStringMatch(string S) {
		vector<int> resultVec;
		int intI = 0;
		int intD = S.length();

		for (int i = 0; i < S.length(); ++i) {
			if (S[i] == 'I') {
				resultVec.push_back(intI++);
			}
			else { // 'D'
				resultVec.push_back(intD--);
			}
		}
		resultVec.push_back(intI);
		return resultVec;
	}
};