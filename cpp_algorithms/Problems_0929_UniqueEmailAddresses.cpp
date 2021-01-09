#include <iostream>
#include <string>
#include <vector>
#include <map>

using namespace std;

class Solution {
public:
	int numUniqueEmails(vector<string>& emails) {
		map<string, int> buffMap;

		for (int i = 0; i < emails.size(); ++i) {
			string mail = emails.at(i);

			size_t atPos = mail.find('@');
			string localName = mail.substr(0, atPos);
			string domain = mail.substr(atPos, mail.size());

			int index = localName.find('+');
			localName = localName.substr(0, index);

			for (int j = 0; j < localName.size(); ++j) {
				if (localName[j] == '.') {
					localName.erase(localName.begin() + j--);
				}
			}

			buffMap.insert(make_pair(localName + domain, 1));
		}

		return buffMap.size();
	}
};