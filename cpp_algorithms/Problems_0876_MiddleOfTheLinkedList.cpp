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
	ListNode* middleNode(ListNode* head) {
		int length = 1;

		ListNode *temp = head;
		while (temp->next != 0) {
			++length;
			temp = temp->next;
		}

		for (int i = 0; i < length / 2; ++i) {
			head = head->next;
		}
		return head;
	}
};