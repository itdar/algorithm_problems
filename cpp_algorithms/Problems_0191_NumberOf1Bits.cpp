#include <bitset>

using namespace std;

class Solution {
public:
	int hammingWeight(uint32_t n) {
		int count = 0;

		bitset<32> xBit(n);

		for (int i = 0; i < xBit.size(); ++i) {
			if (xBit[i] == 1)
				++count;
		}

		return count;
	}
};