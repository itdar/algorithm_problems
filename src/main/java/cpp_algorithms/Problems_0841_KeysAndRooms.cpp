#include <vector>

using namespace std;

// Process
//1. Input graph vector
//2. Make isVisitedVector
//3. Call recursiveVisitor
//4. Check isVisitedVector
//5. Return result

// RecursiveVisitor
//1. Input graphVector, isVisitedVector and currentIndex;
//2. Count currentIndex of isVisitedVector
//3. Iterate currentIndex of graphVector
// 3.1. Check if numberIndex of isVisitiedVector is already visited or not
//  3.1.1. If not -> call recursiveVisitor with that index

class Solution {
public:
	bool canVisitAllRooms(vector<vector<int>>& rooms) {
		bool result = true;

		//2.
		vector<int> isVisitedVector;
		for (int i = 0; i < rooms.size(); ++i) {
			isVisitedVector.push_back(0);
		}
		int currentIndex = 0;

		//3.
		recursiveVisitor(rooms, isVisitedVector, currentIndex);

		//4.
		for (int i = 1; i < isVisitedVector.size(); ++i) {
			if (isVisitedVector[i] < 1) {
				result = false;
			}
		}

		return result;
	}
private:
	void recursiveVisitor(vector<vector<int>>& rooms, vector<int>& isVisitedVector, int& currentIndex) {
		//2. 
		++isVisitedVector[currentIndex];

		//3.
		for (int i = 0; i < rooms[currentIndex].size(); ++i) {
			//3.1.1.
			if (isVisitedVector[rooms[currentIndex][i]] < 1) {
				recursiveVisitor(rooms, isVisitedVector, rooms[currentIndex][i]);
			}
		}
	}
};