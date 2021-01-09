#include <string>

using namespace std;

class Solution {
public:
		// New one
		int lengthOfLongestSubstring(std::string s)
		{
			int maxLength = 0;
			for (int i = 0; i < s.length() - maxLength; ++i)
			{
				int tempLength = checkCharacter(s.substr(i));
				if (maxLength < tempLength)
				{
					maxLength = tempLength;
				}
			}
			return maxLength;
		}

		int checkCharacter(string s)
		{
			bool buffer[128] = { false };
			int tempLength = 0;
			for (int j = 0; j < s.length(); ++j)
			{
				if (!buffer[s[j]])
				{
					buffer[s[j]] = true;
					tempLength++;
				}
				else
				{
					break;
				}
			}
			return tempLength;
		}

		//Old one

		/*int resultLength = 0;
		for (int i = 0; i < s.length() - resultLength; ++i)
		{
			std::string buffer = "";
			bool isDone = false;
			for (int j = i; !isDone && j < s.length(); ++j)
			{
				if (!contains(buffer, s[j]))
				{
					buffer += std::string(1, s[j]);
				}
				else
				{
					isDone = true;
				}
			}
			if (buffer.length() > resultLength)
			{
				resultLength = buffer.length();
			}
		}
		return resultLength;*/

	/*bool contains(std::string buffer, char character)
	{
		bool answer = false;
		for (int i = 0; !answer && i < buffer.length(); ++i)
		{
			if (buffer[i] == character)
			{
				answer = true;
			}
		}
		return answer;
	}*/
};