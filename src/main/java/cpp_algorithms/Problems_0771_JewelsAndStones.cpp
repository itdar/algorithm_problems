#include <string>

using namespace std;

class Solution {
public:
	int numJewelsInStones(string J, string S) {
		int letterPlate[58] = { 0 };

		int jewelCount = 0;

		for (int i = 0; i < J.size(); ++i) {
			++letterPlate[J[i] - 65];
		}

		for (int i = 0; i < S.size(); ++i) {
			if (letterPlate[S[i] - 65] > 0)
				++jewelCount;
		}

		return jewelCount;
	}
};