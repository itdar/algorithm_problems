#include <vector>
#include <iostream>
#include <string>

using namespace std;

// Process
//1. Input two strings
//2. Make stringVectors separating each strings' space
//3. Iterate each vectors
// 3.1. Check if word is uncommon word or not
//4. Return uncommonWords

class Solution {
public:
	vector<string> uncommonFromSentences(string A, string B) {
		vector<string> uncommonWords;
		vector<string> aWords;
		vector<string> bWords;

		string tempBuffer = "";
		for (int i = 0; i < A.length(); ++i) {
			if (A[i] != ' ') {
				tempBuffer += A[i];
			}
			else {
				aWords.push_back(tempBuffer);
				tempBuffer = "";
			}
		}
		aWords.push_back(tempBuffer);
		tempBuffer = "";
		for (int i = 0; i < B.length(); ++i) {
			if (B[i] != ' ') {
				tempBuffer += B[i];
			}
			else {
				bWords.push_back(tempBuffer);
				tempBuffer = "";
			}
		}
		bWords.push_back(tempBuffer);

		int count;
		for (int i = 0; i < aWords.size(); ++i) {
			count = 0;
			for (int j = 0; j < aWords.size(); ++j) {
				if (aWords[i] == aWords[j]) {
					++count;
				}
			}
			for (int j = 0; j < bWords.size(); ++j) {
				if (aWords[i] == bWords[j]) {
					++count;
				}
			}
			if (count <= 1)
				uncommonWords.push_back(aWords[i]);
		}
		for (int i = 0; i < bWords.size(); ++i) {
			count = 0;
			for (int j = 0; j < bWords.size(); ++j) {
				if (bWords[i] == bWords[j]) {
					++count;
				}
			}
			for (int j = 0; j < aWords.size(); ++j) {
				if (bWords[i] == aWords[j]) {
					++count;
				}
			}
			if (count <= 1)
				uncommonWords.push_back(bWords[i]);
		}
		return uncommonWords;
	}
};