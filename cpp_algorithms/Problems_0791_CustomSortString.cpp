#include <string>
#include <iostream>
#include <vector>

using namespace std;

// Process
//1. Input string S, T
//2. Make rankPlate using string S, fill the order rank
//3. Make countPlate using string T, fill the count of each lowercase alphabet
//4. Make resultString using rankPlate and countPlate
// 4.1. Follow the rankPlate, fill the resultString using countPlate number
//5. Return resultString

class Solution {
public:
	string customSortString(string S, string T) {
		string resultString = "";
		int rankPlate[26] = { 0 };
		int countPlate[26] = { 0 };

		// 2. 
		for (int i = 0; i < S.size(); ++i) {
			rankPlate[S[i] - 97] = i + 1;
		}

		// 3.
		int rank = 0;
		for (int i = 0; i < T.size(); ++i) {
			rank = rankPlate[T[i] - 97];

			if (rank > 0) {
				++countPlate[T[i] - 97];
			}
			else {
				resultString += T[i];
			}
		}

		// 4.
		for (int i = 1; i <= 26; ++i) {
			for (int j = 0; j < 26; ++j) {
				if (rankPlate[j] == i) {
					for (int k = 0; k < countPlate[j]; ++k) {
						resultString += (j + 97);
					}
				}
			}
		}

		return resultString;
	}
};