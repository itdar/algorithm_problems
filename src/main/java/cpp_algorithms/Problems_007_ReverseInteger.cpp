class Solution {
public:
	int reverse(int x) {
		// Process
		//1. Input number will be reversed
		//2. Iterate till inputNumber is 0
		// 2.1. Divided digit from the end
		// 2.2. multiple answer and add to answer
		//3. Return answer

		long answer = 0;
		while (x != 0)
		{
			answer *= 10;
			int remainder = x - (x / 10 * 10);
			// cout << remainder << " ";
			answer += remainder;
			// cout << answer << endl;
			x /= 10;
		}
		if (answer < -2147483647 || answer > 2147483647) answer = 0;

		return (int)answer;
	}
};