#include <string>

using namespace std;


// Process
//1. Input ransomNote, magazine
//2. Iterate Magazine
// 2.1 Make dynamicLower
//3. Iterate ransomNote
// 3.1. If dynamicLower[i] is bigger than 0,
//  3.1.1. Subtract 1
// 3.2. If not -> it's false
//4. Return result

class Solution {
public:
	bool canConstruct(string ransomNote, string magazine) {
		bool result = true;

		int dynamicLower[26] = { 0, };

		for (int i = 0; i < magazine.size(); ++i) {
			++dynamicLower[magazine[i] - 97];
		}

		for (int i = 0; result && i < ransomNote.size(); ++i) {
			if (dynamicLower[ransomNote[i] - 97] > 0) {
				--dynamicLower[ransomNote[i] - 97];
			}
			else {
				result = false;
			}
		}

		return result;
	}
};