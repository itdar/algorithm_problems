
using namespace std;

//Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(0) {}
};
 
class Solution {
public:
	bool hasCycle(ListNode *head) {
		bool result = false;

		if (head != 0) {
			if (head->next == head)
				result = true;

			while (head->next != 0 && !result) {
				if (head->next == head) {
					result = true;
				}
				else
				{
					ListNode *tempNode = head;
					head = head->next;
					tempNode->next = tempNode;
				}
			}
		}
		return result;
	}
};