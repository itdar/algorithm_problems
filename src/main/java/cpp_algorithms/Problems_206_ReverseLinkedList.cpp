#include <vector>
#include <iostream>

using namespace std;

// Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
	ListNode* reverseList(ListNode* head) {
		vector<int> buffVector;

		ListNode* buff = head;
		while (head != 0) {
			buffVector.push_back(head->val);
			head = head->next;
		}

		head = buff;
		int i = buffVector.size() - 1;
		while (buff != 0 && i >= 0) {
			buff->val = buffVector[i];
			buff = buff->next;
			--i;
		}

		return head;
	}
};