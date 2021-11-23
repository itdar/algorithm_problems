#include <string>
#include <iostream>
#include <vector>
#include <iterator>
#include <sstream>


using namespace std;


// Process
//1. Input pattern and string
//2. Split str to each words
//4. Compare with pattern chars
//5. Return result

// splitSentence
//1. Input sentence string
//2. Split using istream and iterator
//3. Return result words

class Solution {
public:
private:
	vector<string> splitSentence(string sentence) {
		istringstream iss(sentence);
		vector<string> result((istream_iterator<string>(iss)), istream_iterator<string>());
		return result;
	}
public:
	bool wordPattern(string pattern, string str) {

		vector<string> words = this->splitSentence(str);

		if (words.size() != pattern.size())
			return false;

		for (int i = 0; i < pattern.size(); ++i)
		{
			for (int j = i + 1; j < pattern.size(); ++j)
			{
				if (pattern[i] == pattern[j])
				{
					if (words[i] != words[j])
						return false;
				}
				else
				{
					if (words[i] == words[j])
						return false;
				}
			}
		}
		return true;
	}
};


//int main(int argc, char *argv[]) {
//
//	Solution sln;
//	sln.wordPattern("jquery", "jquery");
//
//	return 0;
//}