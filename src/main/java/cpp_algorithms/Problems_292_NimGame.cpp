

// Process
//1. Input integer n
//2. Check if it's multiply of 4 or not
// 2.1. If so -> false
// 2.2. If not -> true
//3. Finish

class Solution {
public:
	bool canWinNim(int n) {
		if (n % 4 == 0)
			return false;
		else
			return true;
	}
};