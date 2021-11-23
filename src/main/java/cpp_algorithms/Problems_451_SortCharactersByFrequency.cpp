#include <string>
#include <vector>
#include <iostream>

using namespace std;

// Process
//1. Input string
//2. Prepare alphabetCountVector, alphabetVector
//3. Iterate the begin of string to the end
// 3.1. Fill the alphabetCountVector in
//4. Sort(bubble) alphabetCountVector and alphabetVector
//5. Make resultString
//6. Return resultString

class Solution {
public:
	string frequencySort(string s) {

		string resultString = "";

		//2
		std::vector<int> alphabetVector;
		std::vector<int> alphabetCountVector;

		for (int i = 0; i < 94; ++i) {
			alphabetCountVector.push_back(0);
		}
		for (int i = 0; i < 94; ++i) {
			alphabetVector.push_back(i + 32);
		}

		//3
		for (int i = 0; i < s.size(); ++i)
		{
			++alphabetCountVector[s[i] - 32];
		}

		//4
		for (int i = 0; i < alphabetCountVector.size() - 1; ++i)
		{
			for (int j = i + 1; j < alphabetCountVector.size(); ++j)
			{
				if (alphabetCountVector[i] <= alphabetCountVector[j])
				{
					int temp = alphabetCountVector[i];
					alphabetCountVector[i] = alphabetCountVector[j];
					alphabetCountVector[j] = temp;

					temp = alphabetVector[i];
					alphabetVector[i] = alphabetVector[j];
					alphabetVector[j] = temp;
				}
			}
		}

		//5        
		for (int i = 0; i < alphabetCountVector.size()
			&& alphabetCountVector[i] > 0; ++i)
		{
			for (int j = 0; j < alphabetCountVector[i]; ++j)
			{
				resultString += alphabetVector[i];
			}
		}

		//6
		return resultString;
	}
};


//int main(int argc, char *argv[]) {
//
//
//	Solution sln;
//	cout << sln.frequencySort(std::string("testCharacter")) << endl;
//
//
//}