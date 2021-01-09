#include <vector>

using namespace std;

// Process
//1. Input prices vector
//2. Iterate from begin to the end - 1
// 2.1. Iterate from i+1 to the end
//  2.1.1. Compare profit with maxProfit
//   2.1.1.1. Replace maxProfit if profit is bigger than maxProfit
//3. Return maxProfit

class Solution {
public:
	int maxProfit(vector<int>& prices) {
		int maxProfit = 0;

		int length = prices.size();
		if (length > 0) {
			for (int i = 0; i < length - 1; ++i) {
				for (int j = i + 1; j < length; ++j) {
					if (prices[j] - prices[i] > maxProfit) {
						maxProfit = prices[j] - prices[i];
					}
				}
			}
		}
		return maxProfit;
	}
};