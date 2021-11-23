#include <vector>
#include <iostream>
#include <string>

using namespace std;

// Process
//1. Input string vector
//2. Make lowercase dynamic table as many as string vector size
//3. Fill the table in using string character
//4. Iterate lowercase table (i)
// 4.1. Iterate lowercase vector size dimension
//  4.1.1. Check every char count is over than 0
// 4.2. If every char count is over than 0
//  4.2.1. -> Get min count of every char count in that i index table
//  4.2.2. -> Put that i+97 ascii as many as min count to result vector
//5. Return result vector

class Solution {
public:
	vector<string> commonChars(vector<string>& A) {
		vector<string> resultVector;

		if (A.size() > 0) {
			vector<vector<int>> lowerTable;
			for (int i = 0; i < 26; ++i) {
				vector<int> table;
				for (int j = 0; j < A.size(); ++j) {
					table.push_back(0);
				}
				lowerTable.push_back(table);
			}
			//cout << lowerTable.size() << " " << lowerTable[0].size() << endl;

			for (int i = 0; i < A.size(); ++i) {
				for (int j = 0; j < A[i].size(); ++j) {
					++lowerTable[A[i][j] - 97][i];
				}
			}

			//for (int i = 0; i < lowerTable.size(); ++i) {
			//	for (int j = 0; j < lowerTable[i].size(); ++j) {
			//		cout << lowerTable[i][j] << " ";
			//	}
			//	cout << endl;
			//}

			for (int i = 0; i < 26; ++i) {
				bool isFalse = false;
				for (int j = 0; !isFalse && j < lowerTable[0].size(); ++j) {
					if (lowerTable[i][j] <= 0) {
						isFalse = true;
					}
				}
				if (!isFalse) {
					int min = lowerTable[i][0];
					for (int j = 1; j < lowerTable[i].size(); ++j) {
						if (min > lowerTable[i][j]) {
							min = lowerTable[i][j];
						}
					}
					for (int j = 0; j < min; ++j) {
						string tempString;
						tempString = (char)i + 97;
						resultVector.push_back(tempString);
					}
				}
			}
		}
		return resultVector;
	}
};

//void main(int argc, char *argv[]) {
//	Solution sln;
//	
//	//vector<string> testVector = { "bella", "label", "roller" };
//	vector<string> testVector = { "cool", "lock", "cook" };
//
//	vector<string> result = sln.commonChars(testVector);
//
//	cout << result.size() << endl;
//	for (int i = 0; i < result.size(); ++i) {
//		cout << result[i] << " ";
//	}
//}