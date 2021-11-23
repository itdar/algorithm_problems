#include <vector>
#include <iostream>

using namespace std;

// Process
//1. Input two strings S, T
//2. Iterate from begin to the end
// 2.1. Check if it's # or not
//  2.1.1. If so -> delete front char
// 2.2. Delete # char
//3. Return result

class Solution {
public:
	bool backspaceCompare(string S, string T) {
		bool result = false;

		for (int i = 0; i < S.length(); ++i) {
			if (S[i] == '#') {
				if (i > 0) {
					S.erase(S.begin() + (i - 1));
					--i;
				}
				S.erase(S.begin() + i);
				--i;
			}
		}
		for (int i = 0; i < T.length(); ++i) {
			if (T[i] == '#') {
				if (i > 0) {
					T.erase(T.begin() + (i - 1));
					--i;
				}
				T.erase(T.begin() + i);
				--i;
			}
		}

		if (S == T) {
			result = true;
		}

		return result;
	}
};