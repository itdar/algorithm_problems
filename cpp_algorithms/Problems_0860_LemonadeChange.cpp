#include <vector>

using namespace std;

// Process
//1. Input customer bills
//2. Make change bill dynamicPlate (5, 10)
//3. Iterate bills from begin to the end
// 3.1. Check the change comparing bills
//4. Return result

class Solution {
public:
	bool lemonadeChange(vector<int>& bills) {
		bool result = true;

		vector<int> changePlate;
		changePlate.push_back(0);
		changePlate.push_back(0);

		for (int i = 0; result && i < bills.size(); ++i) {
			if (bills[i] > 5) {
				if (bills[i] > 10) {
					if (changePlate[1] > 0) {
						--changePlate[0];
						--changePlate[1];
					}
					else {
						changePlate[0] -= 3;
					}
				}
				else {
					--changePlate[0];
					++changePlate[1];
				}
			}
			else {
				++changePlate[0];
			}
			if (changePlate[0] < 0 || changePlate[1] < 0) {
				result = false;
			}
		}

		return result;
	}
};
