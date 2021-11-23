/**
* Definition for singly-linked list.
* struct ListNode {
*     int val;
*     ListNode *next;
*     ListNode(int x) : val(x), next(NULL) {}
* };
*/

struct ListNode {
	int val;
	ListNode *next;
	ListNode(int x) : val(x), next(0) {}
	
};

class Solution {
public:
	ListNode * addTwoNumbers(ListNode* l1, ListNode* l2) {

		ListNode* answerNode = l1;

		while (l2 != 0) {
			l1->val += l2->val;

			checkDigit(l1);

			if (l2->next != 0 && l1->next == 0) {
				l1->next = new ListNode(0);
			}
			l1 = l1->next;
			l2 = l2->next;
		}

		return answerNode;
	}

	void checkDigit(ListNode* l1) {
		if (l1->val >= 10) {
			if (l1->next != 0) {
				l1->val = l1->val - 10;
				l1->next->val += 1;
				checkDigit(l1->next);
			}
			else {
				l1->val = l1->val - 10;
				l1->next = new ListNode(1);
				checkDigit(l1->next);
			}
		}
	}
};