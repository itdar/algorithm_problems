#include <vector>
#include <iostream>

using namespace std;

// Process
//1. Input nums vector
//2. Sort vector with indexVector
//3. Make maximum money
//4. Return result

class Solution {
public:
	int rob(vector<int>& nums) {
		int maxMoney = 0;

		if (nums.size() > 0) {
			vector<int> indexVector;
			for (int i = 0; i < nums.size(); ++i)
				indexVector.push_back(i);

			//2 sort
			if (nums.size() > 1) {
				for (int i = 0; i < nums.size() - 2; ++i) {
					for (int j = 0; j < nums.size() - 1 - i; ++j) {
						if (nums[j] < nums[j + 1]) {
							int temp1 = nums[j];
							nums[j] = nums[j + 1];
							nums[j + 1] = temp1;
							int temp2 = indexVector[j];
							indexVector[j] = indexVector[j + 1];
							indexVector[j + 1] = temp2;
						}
					}
				}
			}

			for (int i = 0; i < nums.size(); ++i) {
				cout << nums[i] << " " << indexVector[i] << endl;
			}

			//3 make maxMoney
			for (int i = 0; i < 2 && i < nums.size(); ++i) {
				vector<int> previousIndexes;
				previousIndexes.push_back(indexVector[i]);
				int sum = nums[i];
				for (int j = i + 1; j < nums.size(); ++j) {
					if (checkPreviousIndex(previousIndexes, indexVector[j])) {
						cout << "index : " << indexVector[j] << endl;
						sum += nums[j];
						previousIndexes.push_back(indexVector[j]);
					}
				}

				//for (int j = 0; j < previousIndexes.size(); ++j) {
				//	cout << "prevIndexes : " << previousIndexes[j] << endl;
				//}
				//cout << "sum : " << sum << endl;

				//if (nums.size() > i+1 && checkPreviousIndex(previousIndexes, indexVector[indexVector.size() - 1])) {
				//	cout << "last index : " << indexVector[indexVector.size() - 1] << endl;
				//	sum += nums[nums.size() - 1];
				//}

				cout << " >> Sum : " << sum << endl;

				if (sum > maxMoney)
					maxMoney = sum;
			}
		}
		
		return maxMoney;
	}
private:
	bool checkPreviousIndex(vector<int>& indexes, int index) {
		for (int i = 0; i < indexes.size(); ++i) {
			if (indexes[i] + 1 == index || indexes[i] - 1 == index) {
				return false;
			}
		}
		return true;
	}
};

//int main(int argc, char *argv[]) {
//
//	vector<int> inputVector;
//	inputVector.push_back(8);
//	inputVector.push_back(9);
//	inputVector.push_back(9);
//	inputVector.push_back(4);
//	inputVector.push_back(10);
//	inputVector.push_back(5);
//	inputVector.push_back(6);
//	inputVector.push_back(9);
//	inputVector.push_back(7);
//	inputVector.push_back(9);
//
//	Solution sln;
//	cout << "\n" << "result : " << sln.rob(inputVector) << endl;
//
//}