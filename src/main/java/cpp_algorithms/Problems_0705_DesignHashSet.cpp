#include <vector>
#include <algorithm>

using namespace std;

class MyHashSet {
private:
	vector<int> *list;
public:
	/** Initialize your data structure here. */
	MyHashSet() {
		this->list = new vector<int>();
	}

	void add(int key) {
		if (!this->contains(key)) {
			list->push_back(key);
		}
	}

	void remove(int key) {
		//erase-remove idiom stl technique
		list->erase(std::remove(list->begin(), list->end(), key), list->end());
		//std::remove()
	}

	/** Returns true if this set contains the specified element */
	bool contains(int key) {
		if (std::find(list->begin(), list->end(), key) == list->end()) {
			return false;
		}
		else {
			return true;
		}
	}
};

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet* obj = new MyHashSet();
 * obj->add(key);
 * obj->remove(key);
 * bool param_3 = obj->contains(key);
 */