#include <iostream>
#include <string>

using namespace std;

// Process
//1. Input string S
//2. Call recursiveFunc
//3. Return resultString

// Recursive
//1. Input string
//2. Iterate all char
// 2.1. Check if it's adjacent, equal two letters
//  3.1.1. If so -> Delete them and Call recursive

class Solution {
public:
	// Better performance
	string removeDuplicates(string S) {
		for (int i = 1; i < S.size(); ++i) {
			//cout << i << " " << S << " " << S.size() << endl;
			if (S[i] == S[i - 1]) {
				S.erase(i-1, 2);
				if (i - 1 > 0)
					i -= 2;
				else {
					i -= 1;
				}
			}
		}
		return S;
	}
};

// // Worse performance (recursive)
//class Solution {
//public:
//	string removeDuplicates(string S) {
//		return recursiveRemoveDuplicates(S);
//	}
//private:
//	string recursiveRemoveDuplicates(string &letters) {
//		cout << letters << endl;
//		bool isDone = false;
//		for (int i = 0; !isDone && i < letters.length() - 1; ++i) {
//			if (letters[i] == letters[i + 1]) {
//				letters.erase(i, 2);
//				if (letters.length() > 0)
//					letters = recursiveRemoveDuplicates(letters);
//				isDone = true;
//			}
//		}
//		return letters;
//	}
//};

int main(int argc, char*(*argv)) {
	Solution sln;

	string result = sln.removeDuplicates("abbaca");
	cout << result << endl;

	return 0;
}