#include <vector>
#include <string>

using namespace std;

class Solution {
public:
	int uniqueMorseRepresentations(vector<string>& words) {

		vector<string> morseStrings{ ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.." };

		vector<string> overlapVec;

		for (const auto& val : words) {
			string makeMorse = "";
			for (const auto& character : val) {
				makeMorse += morseStrings[character - 97];
			}
			if (std::find(overlapVec.begin(), overlapVec.end(), makeMorse) != overlapVec.end()) {

			}
			else {
				overlapVec.push_back(makeMorse);
			}
		}

		return overlapVec.size();
	}
};