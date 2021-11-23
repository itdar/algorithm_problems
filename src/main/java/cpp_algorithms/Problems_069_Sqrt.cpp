#include <math.h>

using namespace std;

class Solution {
public:
	int mySqrt(int x) {

		return floor(sqrt(x));

		//int result = 0;
		//int half = x / 2 + 2;

		//bool isDone = false;
		//for (int i = 1; !isDone && i <= half; ++i) {
		//	if (pow(i, 2) > x) {
		//		result = i - 1;
		//		isDone = true;
		//	}
		//}
		//return result;
	}
};