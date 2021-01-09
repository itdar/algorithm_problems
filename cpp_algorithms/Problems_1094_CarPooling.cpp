#include <vector>
#include <iostream>

using namespace std;

// Process
//1. Input trips vector and capacity
//2. Get the most far end location
//3. Make start/end location array
//4. Iterate location array
// 4.1. Check if it has number of passengers to pick or drop
//  4.1.1. If to pick -> reduce capacity
//   4.1.1.1. Check capacity is under 0 or not
//    4.1.1.1.1. If so -> result is false
//  4.1.2. If to drop -> recover capacity
//5. Return result


class Solution {
public:
	bool carPooling(vector<vector<int>>& trips, int capacity) {
		bool result = true;
		int mostFarDestination = 0;

		// 2.
		for (int i = 0; i < trips.size(); ++i) {
			if (mostFarDestination < trips[i][2])
				mostFarDestination = trips[i][2];
		}

		// 3.
		int* locationArray = new int[mostFarDestination];
		for (int i = 0; i < mostFarDestination; ++i) {
			locationArray[i] = 0;
		}
		for (int i = 0; i < trips.size(); ++i) {
			locationArray[trips[i][1] - 1] += trips[i][0];
			locationArray[trips[i][2] - 1] -= trips[i][0];
		}

		// debug
		cout << mostFarDestination << endl << endl;
		for (int i = 0; i < mostFarDestination; ++i) {
			cout << i << " " << locationArray[i] << endl;
		}

		// 4.
		for (int i = 0; result && i < mostFarDestination; ++i) {
			if (locationArray[i] > 0) {
				capacity -= locationArray[i];
				if (capacity < 0)
					result = false;
			}
			else if (locationArray[i] < 0) {
				capacity -= locationArray[i];
			}

			cout << "Capacity : " << capacity << endl;
		}

		return result;
	}
};

//int main(int argc, char*(*argv)) {
//	Solution sln;
//
//	vector<vector<int>> trips;
//	int capacity = 11;
//
//	vector<int> trip1;
//	trip1.push_back(3);
//	trip1.push_back(2);
//	trip1.push_back(8);
//	vector<int> trip2;
//	trip2.push_back(4);
//	trip2.push_back(4);
//	trip2.push_back(6);
//	vector<int> trip3;
//	trip3.push_back(10);
//	trip3.push_back(8);
//	trip3.push_back(9);
//
//	trips.push_back(trip1);
//	trips.push_back(trip2);
//	trips.push_back(trip3);
//
//	cout << sln.carPooling(trips, capacity) << endl << endl;
//}
