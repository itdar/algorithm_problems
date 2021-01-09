#include <string>

using namespace std;

// Process
//1. Input string S
//2. Delete first element "("
//3. Iterate from begin to the end
// 3.1. Check if it's end of parenthesis
//  3.1.1. If so -> delete
//  3.1.2. If not -> Check if it's open or close
//   3.1.2.1. If it's open -> countParenthesis
//   3.1.2.2. close -> minusParenthesis
//4. Return resultString

class Solution {
public:
	string removeOuterParentheses(string S) {
		int parenthCount = 0;

		if (S.length() > 0) {
			for (int i = 0; i < S.length(); ++i) {
				if (S[i] == '(') {
					if (parenthCount == 0) {
						S.erase(S.begin() + i);
						--i;
					}
					++parenthCount;
				}
				else {
					--parenthCount;
					if (parenthCount == 0) {
						S.erase(S.begin() + i);
						--i;
					}
				}
			}
		}
		return S;
	}
};