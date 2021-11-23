#include <string>

using namespace std;

class Solution {
public:
	bool judgeCircle(string moves) {
		bool answer = false;

		if (moves.size() > 0) {
			int point[2] = { 0, 0 };

			for (int i = 0; i < moves.size(); ++i) {
				switch (moves[i])
				{
				case 'R':
					++point[0]; break;
				case 'U':
					++point[1]; break;
				case 'L':
					--point[0]; break;
				case 'D':
					--point[1]; break;
				default:
					break;
				}
			}

			if (point[0] == 0 && point[1] == 0) {
				answer == true;
			}
		}
		return answer;
	}
};