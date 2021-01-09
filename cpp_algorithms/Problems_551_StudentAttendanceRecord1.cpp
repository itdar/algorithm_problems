#include <string>

using namespace std;

class Solution {
public:
	bool checkRecord(string s) {
		int countAbsent = 0;
		bool continousLate = false;
		int countContinousLate = 1;

		for (int i = 0; countAbsent < 2 && countContinousLate < 3
			&& i < s.size(); ++i)
		{
			if (s[i] == 65)
			{
				++countAbsent;
				continousLate = false;
				countContinousLate = 1;
			}
			else if (s[i] == 76)
			{
				if (continousLate)
					++countContinousLate;
				else
					continousLate = true;
			}
			else
			{
				continousLate = false;
				countContinousLate = 1;
			}
		}

		if (countAbsent > 1 || countContinousLate > 2)
			return false;
		return true;
	}
};