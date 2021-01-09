#include <string>

using namespace std;

// Process
//1. Input string s , t
//2. Iterate s
// 2.1. Make dynamic s case
//3. Iterate t
// 3.1. Make dynamic t case
//4. Iterate dynamic cases
// 4.1. compare number
//5. Return result

//97 122
class Solution {
public:
	char findTheDifference(string s, string t) {
		char result;

		int dynamicS[26] = { 0 };
		int dynamicT[26] = { 0 };

		for (int i = 0; i < s.size(); ++i) {
			++dynamicS[s[i] - 97];
		}

		for (int i = 0; i < t.size(); ++i) {
			++dynamicT[t[i] - 97];
		}

		for (int i = 0; i < 26; ++i) {
			if (dynamicS[i] != dynamicT[i]) {
				result = i + 97;
			}
		}

		return result;
	}
};