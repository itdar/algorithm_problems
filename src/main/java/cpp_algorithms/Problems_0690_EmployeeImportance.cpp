#include <vector>

using namespace std;

// Employee info
class Employee {
public:
	// It's the unique ID of each node.
	// unique id of this employee
	int id;
	// the importance value of this employee
	int importance;
	// the id of direct subordinates
	vector<int> subordinates;
};

// Process
//1. Input employees and start ID
//2. Make indexesList of all subordinates IDs
//3. Sum all of subordinates value
//4. Return importance sum

class Solution {
public:
	int getImportance(vector<Employee*> employees, int id) {
		int sumOfImportance = 0;
		vector<int> indexes;

		// 2.
		recursiveGetIDs(employees, id, indexes);

		// 3.
		for (int i = 0; i < indexes.size(); ++i) {
			sumOfImportance += (employees.at(indexes.at(i))->importance);
		}

		// 4.
		return sumOfImportance;
	}
private:
	void recursiveGetIDs(vector<Employee*> &employees, int id, vector<int> &indexes) {
		int index = searchIndexID(employees, id);
		indexes.push_back(index);
		vector<int> subordinates = employees.at(index)->subordinates;
		for (int i = 0; i < subordinates.size(); ++i) {
			recursiveGetIDs(employees, subordinates.at(i), indexes);
		}
	}

	int searchIndexID(vector<Employee*> &employees, int id) {
		int index = -1;
		for (int i = 0; i < employees.size(); ++i) {
			if (employees.at(i)->id == id) {
				index = i;
			}
		}
		return index;
	}
};