#include <string>
#include <iostream>

using namespace std;

// Process
//1. Input string word
//2. Check if it starts with capital character
// 2.1. If so -> Check if rest of the word are all capital or lowercase letter
// 2.2. If not -> Check if rest of the word are all lowercase
//3. Return answer


class Solution {
private :
	bool isUpperCaseLetter(char letter) {
		return (letter >= 65 && letter <= 90);
	}
	bool isLowerCaseLetter(char letter) {
		return (letter <= 122 || letter >= 97);
	}

public:
	bool detectCapitalUse(string word) {
		bool result = true;
		if (word.size() > 0)
		{
			if (isUpperCaseLetter(word[0])) // capital
			{
				if (word.size() > 1)
				{
					if (isUpperCaseLetter(word[1]))
					{
						for (int i = 2; i < word.size(); ++i)
						{
							if (word[i] > 90 || word[i] < 65)
								result = false;
						}
					}
					else if (isLowerCaseLetter(word[1]))
					{
						for (int i = 2; i < word.size(); ++i)
						{
							if (word[i] > 122 || word[i] < 97)
								result = false;
						}
					}
				}
			}
			else if (isLowerCaseLetter(word[0])) // lowercase
			{
				for (int i = 1; result && i < word.size(); ++i)
				{
					if (word[i] > 122 || word[i] < 97)
						result = false;
				}
			}
		}
		return result;
	}
};


//int main(int argc, char *argv[]) {
//
//	Solution sln;
//
//	cout << sln.detectCapitalUse("Leetcode") << endl;
//
//}