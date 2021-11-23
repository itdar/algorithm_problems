

// Definition for singly-linked list.
 struct ListNode {
     int val;
     ListNode *next;
     ListNode(int x) : val(x), next(0) {}
 };
 

 // Process
 //1. Input head node
 //2. Iterate till the next is null
 // 2.1. Check if val and nextVal are the same or not
 //  2.1.1. If so -> delete one
 //3. Return head node

class Solution {
public:
	ListNode* deleteDuplicates(ListNode* head) {
		if (head != 0) {
			ListNode* tempNode = head;
			while (tempNode->next != 0) {
				if (tempNode->val == tempNode->next->val) {
					tempNode->next = tempNode->next->next;
				}
				else {
					tempNode = tempNode->next;
				}
			}
		}
		return head;
	}
};