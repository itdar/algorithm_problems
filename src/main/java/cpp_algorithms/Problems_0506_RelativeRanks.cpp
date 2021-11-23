#include <vector>
#include <string>
#include <sstream>

using namespace std;

// Process
//1. Input athletes score vector
//2. Make index vector
//3. Sort score vector and index vector
//4. Make resultVector
//4. Return resultVector

class Solution {
public:
	vector<string> findRelativeRanks(vector<int>& nums) {
		vector<string> resultVector;

		vector<int> indexVector;
		for (int i = 0; i < nums.size(); ++i) {
			indexVector.push_back(i);
		}

		for (int i = 0; i < nums.size(); ++i) {
			for (int j = 0; j < nums.size() - 1 - i; ++j) {
				if (nums[j] > nums[j + 1]) {
					int buf = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = buf;

					buf = indexVector[j];
					indexVector[j] = indexVector[j + 1];
					indexVector[j + 1] = buf;
				}
			}
		}

		for (int i = 0; i < indexVector.size(); ++i) {
			nums[indexVector[i]] = indexVector.size() - i;
		}

		for (int i = 0; i < nums.size(); ++i) {
			if (nums[i] == 1) {
				resultVector.push_back("Gold Medal");
			}
			else if (nums[i] == 2) {
				resultVector.push_back("Silver Medal");
			}
			else if (nums[i] == 3) {
				resultVector.push_back("Bronze Medal");
			}
			else {
				resultVector.push_back(itos(nums[i]));
			}
		}

		return resultVector;
	}
private:
	string itos(int integer) {
		std::stringstream ss;
		ss << integer;
		return ss.str();
	}
};