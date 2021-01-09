#include <string>
#include <iostream>

using namespace std;

// Process
//1. Input sentence s
//2. Iterate till the end
// 2.1. Make word chunk separated by white space
// 2.2. Reverse word
// 2.3. Put reversed word to resultString
//3. Return resultString

class Solution {
private:
	string reverseWord(string wordChunk) {
		string reversedWord = "";
		for (int i = wordChunk.size()-1; i >= 0; --i)
		{
			reversedWord += wordChunk[i];
		}
		return reversedWord;
	}
public:
	string reverseWords(string s) {
		string resultString = "";
		string wordChunk = "";
		for (int i = 0; i < s.size(); ++i)
		{
			if (s[i] != ' ')
			{
				wordChunk += s[i];
			}
			else
			{
				resultString += reverseWord(wordChunk);
				resultString += ' ';
				wordChunk = "";
			}
		}
		resultString += reverseWord(wordChunk);

		return resultString;
	}
};


//int main(int argc, char *argv[]) {
//
//	Solution sln;
//
//	string word = sln.reverseWords("Let's take LeetCode contest");
//
//	cout << word << endl;
//
//}