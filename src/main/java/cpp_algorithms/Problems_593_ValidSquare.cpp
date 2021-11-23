#include <vector>
#include <iostream>
#include <math.h>
#include <algorithm>

using namespace std;

class Solution {

private:
	bool isSquare(std::vector<double>& distanceVector) {
		if (distanceVector[0] == distanceVector[3]
				&& distanceVector[4] == distanceVector[5]
				&& distanceVector[3] != distanceVector[4])
			return true;
		return false;
	}
public:
	// Process
	//1. Input 4 coordinates
	//2. Get all distance of lines
	//3. Sort
	//4. Check if it's Square or not

	//처리과정
	//1. 포인터 4개 입력받는다 (좌표)
	//2. 

	bool validSquare(vector<int>& p1, vector<int>& p2, vector<int>& p3, vector<int>& p4) {

		double dist1 = sqrt((p1[0] - p2[0])*(p1[0] - p2[0]) + (p1[1] - p2[1])*(p1[1] - p2[1]));
		double dist2 = sqrt((p1[0] - p3[0])*(p1[0] - p3[0]) + (p1[1] - p3[1])*(p1[1] - p3[1]));
		double dist3 = sqrt((p1[0] - p4[0])*(p1[0] - p4[0]) + (p1[1] - p4[1])*(p1[1] - p4[1]));
		double dist4 = sqrt((p2[0] - p4[0])*(p2[0] - p4[0]) + (p2[1] - p4[1])*(p2[1] - p4[1]));
		double dist5 = sqrt((p2[0] - p3[0])*(p2[0] - p3[0]) + (p2[1] - p3[1])*(p2[1] - p3[1]));
		double dist6 = sqrt((p3[0] - p4[0])*(p3[0] - p4[0]) + (p3[1] - p4[1])*(p3[1] - p4[1]));

		vector<double> distanceVector;
		distanceVector.push_back(dist1);
		distanceVector.push_back(dist2);
		distanceVector.push_back(dist3);
		distanceVector.push_back(dist4);
		distanceVector.push_back(dist5);
		distanceVector.push_back(dist6);

		sort(distanceVector.begin(), distanceVector.end());

		return isSquare(distanceVector);
	}
};

//int main(int args, char *argv[]) {
//
//
//	cout << "Hello" << endl;
//
//
//}