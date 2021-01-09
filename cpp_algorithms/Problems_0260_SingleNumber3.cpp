#include <vector>
#include <algorithm>
#include <iostream>
#include <map>

using namespace std;

// ó������
//1. ���� �Է¹޴´�.
//2. �ּ�~�ִ� ���̰��� ���صд� (length)
//3. �ش� ����ŭ ������ vector ����� �ʱ�ȭ�صд�.
//4. ���� ���鼭 

class Solution {
public:
	vector<int> singleNumber(vector<int>& nums) {
		vector<int> result;

		map<int, int> buffer;
		for (int i = 0; i < nums.size(); ++i) {
			if (buffer.count(nums[i]) > 0) {
				buffer.erase(nums[i]);
			}
			else {
				buffer.insert(make_pair(nums[i], 0));
			}
		}
		map<int, int>::iterator it;
		for (it = buffer.begin(); it != buffer.end(); ++it) {
			result.push_back(it->first);
		}

		// Memory overflow
		/*int min = *min_element(nums.begin(), nums.end());
		int max = *max_element(nums.begin(), nums.end());
		int length = abs(max - min) + 1;
		vector<int> dynamicVec;
		for (int i = 0; i < length; ++i) {
			dynamicVec.push_back(0);
		}

		int diff;
		if (min >= 0) {
			diff = 0-min;
		}
		else {
			diff = abs(min);
		}
		for (int i = 0; i < nums.size(); ++i) {
			++dynamicVec[nums[i] + diff];
		}

		for (int i = 0; i < length; ++i) {
			if (dynamicVec[i] == 1) {
				result.push_back(i-diff);
			}
		}*/

		return result;
	}
};

//int main(int argc, char* argv[]) {
//
//	Solution sln;
//
//	vector<int> testVector;
//	testVector.push_back(2);
//	testVector.push_back(3);
//	testVector.push_back(2);
//	testVector.push_back(5);
//	testVector.push_back(4);
//	testVector.push_back(4);
//	testVector.push_back(1);
//	testVector.push_back(1);
//	testVector.push_back(8);
//	testVector.push_back(8);
//
//	vector<int> result = sln.singleNumber(testVector);
//	cout << "" << endl;
//	for (int i = 0; i < result.size(); ++i) {
//		cout << result[i] << " ";
//	}
//	cout << endl;
//}