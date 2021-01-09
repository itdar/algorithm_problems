#include <iostream>
#include <string>
#include <vector>
#include <map>
#include <algorithm>

using namespace std;


// Process
//1. Input integer array
//2. Iterate from begin to the end
// 2.1. Check if map has that int
//  2.1.1. If not -> put the int to the map
//3. Return map element

class Solution {
public:

	int singleNumber(vector<int>& nums) {

		int num = 0;
		for (int i = 0; i < nums.size(); ++i) {
			cout << "num : " << num << " " << " nums[i] : " << nums[i] << "  ";
			num = num ^ nums[i];
			cout << "\n" << num << endl << endl << endl;
		}
		return num;
	}

	//int singleNumber(vector<int>& nums) {

	//	if (nums.size() == 1)
	//		return nums[0];

	//	sort(nums.begin(), nums.end());

	//	for (int i = 0; i < nums.size() - 2; i += 2)
	//	{
	//		if (nums[i] != nums[i + 1])
	//		{
	//			return nums[i];
	//		}
	//	}
	//	return nums[nums.size()-1];
	//}

	//int singleNumber(vector<int>& nums) {

	//	bool hasSame;
	//	for (int i = 0; i < nums.size(); ++i)
	//	{
	//		hasSame = false;
	//		int j = i+1;
	//		while (!hasSame && j < nums.size())
	//		{
	//			if (nums[i] == nums[j])
	//			{
	//				hasSame = true;
	//				nums.erase(nums.begin() + j);
	//			}
	//			++j;
	//		}
	//		if (!hasSame)
	//			return nums[i];
	//	}
	//	return 0;
	//}

	//int singleNumber(vector<int>& nums) {

	//	map<int, int> tempMap;

	//	for (int i = 0; i < nums.size(); ++i)
	//	{
	//		auto search = tempMap.find(nums[i]);
	//		if (search != tempMap.end()) {
	//			tempMap.erase(nums[i]);
	//		}
	//		else 
	//		{
	//			tempMap.insert(pair<int, int>(nums[i], nums[i]));
	//		}
	//	}
	//	return tempMap.begin()->first;
	//}
};


//int main(int argc, char *argv[]) {
//
//	//cout << "Hell" << endl;
//	vector<int> input; // 2 4 4 2 3 5 3
//	input.push_back(2);
//	input.push_back(2);
//	input.push_back(3);
//	input.push_back(5);
//	input.push_back(3);
//	input.push_back(4);
//	input.push_back(4);
//	input.push_back(1);
//	input.push_back(1);
//
//	Solution sln;
//	cout << sln.singleNumber(input) << endl;
//
//
//}