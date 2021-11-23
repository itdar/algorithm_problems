#include <iostream>
#include <vector>

using namespace std;

class MyStack {
private:
	vector<int> data;

public:
	/** Initialize your data structure here. */
	MyStack() {
		//this->data = new vector<int>();
	}

	/** Push element x onto stack. */
	void push(int x) {
		data.push_back(x);
	}

	/** Removes the element on top of the stack and returns that element. */
	int pop() {
		int temp = data.at(data.size() - 1);
		data.erase(data.begin() + data.size() - 1);
		return temp;
	}

	/** Get the top element. */
	int top() {
		return data.at(data.size() - 1);
	}

	/** Returns whether the stack is empty. */
	bool empty() {
		bool isEmpty = true;
		if (data.size() > 0)
			return false;
		return isEmpty;
	}
};

/**
* Your MyStack object will be instantiated and called as such:
* MyStack obj = new MyStack();
* obj.push(x);
* int param_2 = obj.pop();
* int param_3 = obj.top();
* bool param_4 = obj.empty();
*/


//int main(int args, char *argv[]) {
//
//	cout << "Hello world" << endl;
//
//	MyStack stack;
//
//	stack.push(1);
//	stack.push(2);
//	cout << stack.top() << endl;   // returns 2
//	cout << stack.pop() << endl;   // returns 2
//	cout << stack.empty() << endl; // returns false
//
//}


