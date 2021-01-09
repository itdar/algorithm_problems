#include <string>
#include <vector>
#include <iostream>

using namespace std;

// Process
//1. Input text string
//2. Make lowercaseTable
//3. Fill the table in with count
//4. Count balloon string
//5. Return count

class Solution {
public:
	int maxNumberOfBalloons(string text) {
		int resultCount = 0;

		//2.
		vector<int> alphabetTable;
		for (int i = 0; i < 26; ++i) {
			alphabetTable.push_back(0);
		}

		//3.
		for (int i = 0; i < text.length(); ++i) {
			++alphabetTable[text[i] - 97];
		}

		//4. 
		bool isDone = false;
		while (!isDone) {
			if (alphabetTable[0]-- > 0 && alphabetTable[1]-- > 0
				&& alphabetTable[11]-- > 1 && alphabetTable[14]-- > 1
				&& alphabetTable[13]-- > 0)
			{
				++resultCount;
				--alphabetTable[11];
				--alphabetTable[14];
			}
			else {
				isDone = true;
			}
		}
		return resultCount;
	}
};