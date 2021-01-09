// Process
//1. Input n
//2. Iterate till n >= 3
// 2.1. Check n / 3 is divisible
//  2.1.1. If not -> false
// 2.2. n /= 3
//3. Check if n == 1
// 3.1. return result

class Solution {
public:
	bool isPowerOfThree(int n) {
		while (n >= 3) {
			if (n % 3 != 0)
				return false;
			n /= 3;
		}
		return (n == 1);
	}
};