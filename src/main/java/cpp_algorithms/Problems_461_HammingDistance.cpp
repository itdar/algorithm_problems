#include <iostream>
#include <bitset>


using namespace std;

class Solution {
public:
	int hammingDistance(int x, int y) {

		bitset<32> xBit(x);
		bitset<32> yBit(y);
		int count = 0;

		for (int i = 0; i < xBit.size(); ++i)
			if (xBit[i] == yBit[i])
				++count;
		return 32 - count;
	}
};


//int main(int argc, char *argv[]) {
//
//	cout << "Hell o" << endl;
//
//}