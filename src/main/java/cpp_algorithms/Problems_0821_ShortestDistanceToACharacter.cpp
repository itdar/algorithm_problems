#include <string>
#include <vector>

using namespace std;

class Solution {
public:
	vector<int> shortestToChar(string S, char C) {
		vector<int> resultVector;
		vector<int> cIndexVector;
		for (int i = 0; i < S.length(); ++i) {
			if (S[i] == C) {
				cIndexVector.push_back(i);
			}
		}
		for (int i = 0; i < S.length(); ++i) {
			int shortDistance = 10000;
			for (int j = 0; j < cIndexVector.size(); ++j) {
				int distance = abs(i - cIndexVector[j]);
				if (distance < shortDistance) {
					shortDistance = distance;
				}
			}
			resultVector.push_back(shortDistance);
		}
		return resultVector;
	}
};