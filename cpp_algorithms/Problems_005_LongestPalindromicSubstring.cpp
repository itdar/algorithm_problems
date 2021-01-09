#include <string>

class Solution {
public:
	std::string longestPalindrome(std::string s) {

		// string resultString = string(1, s[0]);

		for (int i = 0; i < s.length(); ++i)
		{
			for (int j = 0; j <= i; ++j)
			{
				bool isPali = true;
				int start = j;
				int end = s.length() - 1 - i + j;
				int count = 0;
				for (int k = start; isPali && k < end - count; ++k)
				{
					if (s[k] != s[end - count])
					{
						isPali = false;
					}
					++count;
				}
				if (isPali && 1 < s.length() - i)
				{
					// resultString = s.substr(j, s.length() - i);
					return s.substr(j, s.length() - i);
				}
			}
		}

		return std::string(1, s[0]);
	}

};