#include <vector>

using namespace std;

class MyHashMap {
public:
	vector<int> keyVector;
	vector<int> valVector;

	/** Initialize your data structure here. */
	MyHashMap() {
		keyVector;
		valVector;
	}

	/** value will always be non-negative. */
	void put(int key, int value) {
		bool isExist = false;
		for (int i = 0; i < keyVector.size(); ++i) {
			if (keyVector.at(i) == key) {
				valVector.at(i) = value;
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			keyVector.push_back(key);
			valVector.push_back(value);
		}
	}

	/** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
	int get(int key) {
		for (int i = 0; i < keyVector.size(); ++i) {
			if (keyVector.at(i) == key) {
				return valVector.at(i);
			}
		}
		return -1;
	}

	/** Removes the mapping of the specified value key if this map contains a mapping for the key */
	void remove(int key) {
		for (int i = 0; i < keyVector.size(); ++i) {
			if (keyVector.at(i) == key) {
				keyVector.erase(keyVector.begin() + i);
				valVector.erase(valVector.begin() + i);
				break;
			}
		}
	}
};

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap* obj = new MyHashMap();
 * obj->put(key,value);
 * int param_2 = obj->get(key);
 * obj->remove(key);
 */