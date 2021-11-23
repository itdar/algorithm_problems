#include <vector>

using namespace std;

class Solution {
public:
	vector<int> dailyTemperatures(vector<int>& T) {
		// 		vector<int> outputVector;
		// 		vector<pair<int, int>> tempPair;

		// 		for (int i = 0; i < T.size(); ++i) {
		// 			outputVector.push_back(0);
		// 		}

		// 		bool isDone;
		// 		for (int i = 0; i < T.size(); ++i) {
		// 			for (int j = 0; j < tempPair.size(); ++j) {
		// 				if (tempPair[j].second < T[i]) {
		// 					outputVector.at(tempPair[j].first) = i-tempPair[j].first;
		// 					tempPair.erase(tempPair.begin() + j);
		//                     --j;
		// 				}
		// 			}
		// 			tempPair.push_back(make_pair(i, T[i]));
		// 		}
		//         return outputVector;

		vector<int> outputVector;

		bool isDone;
		int temperture;
		for (int i = 0; i < T.size(); ++i) {
			isDone = false;
			temperture = T[i];
			for (int j = i; !isDone && j < T.size(); ++j) {
				if (temperture < T[j]) {
					outputVector.push_back(j - i);
					isDone = true;
				}
			}
			if (!isDone) {
				outputVector.push_back(0);
			}
		}
		return outputVector;
	}
};