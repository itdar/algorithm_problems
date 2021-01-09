#include <vector>

using namespace std;

class Solution {
public:
	void reverseString(vector<char>& s) {
		if (s.size() > 0) {
			char charBuffer;
			for (int i = 0; i < s.size() / 2; ++i) {
				charBuffer = s[i];
				s[i] = s[s.size() - 1 - i];
				s[s.size() - 1 - i] = charBuffer;
			}

			// vector<char> newVec;
			// for (int i = s.size() - 1; i >= 0; --i) {
			// 	newVec.push_back(s[i]);
			// }
			// s = newVec;
		}
	}
};