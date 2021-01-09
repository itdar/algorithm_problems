
//Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(0) {}
};
 

// Process
//1. Input two listNodes (l1, l2)
//2. Iterate till both are not a null
// 2.1. Compare and put smaller one in resultListNode
//3. Iterate till l1 is not a null
// 3.1. Put l1 to resultListNode
//4. Iterate till l1 is not a null
// 4.1. Put l2 to resultListNode

class Solution {
public:
	ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
		ListNode* tempNode = 0;

		if (l1 == 0 && l2 == 0)
			return tempNode;

		if (l1 != 0 && l2 != 0) {
			if (l1->val < l2->val) {
				tempNode = new ListNode(l1->val);
				l1 = l1->next;
			}
			else {
				tempNode = new ListNode(l2->val);
				l2 = l2->next;
			}
		}
		else if (l1 != 0) {
			tempNode = new ListNode(l1->val);
			l1 = l1->next;
		}
		else if (l2 != 0) {
			tempNode = new ListNode(l2->val);
			l2 = l2->next;
		}
		ListNode* resultListNode = tempNode;

		while (l1 != 0 && l2 != 0) {
			if (l1->val < l2->val) {
				tempNode->next = new ListNode(l1->val);
				l1 = l1->next;
			}
			else {
				tempNode->next = new ListNode(l2->val);
				l2 = l2->next;
			}
			tempNode = tempNode->next;
		}
		while (l1 != 0) {
			tempNode->next = new ListNode(l1->val);
			tempNode = tempNode->next;
			l1 = l1->next;
		}
		while (l2 != 0) {
			tempNode->next = new ListNode(l2->val);
			tempNode = tempNode->next;
			l2 = l2->next;
		}

		return resultListNode;
	}
};