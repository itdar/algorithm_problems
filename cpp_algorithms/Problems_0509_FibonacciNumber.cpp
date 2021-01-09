

class Solution {
public:
	int fib(int N) {
		return recursiveFib(N);
	}
private:
	int recursiveFib(int n) {
		int sum = 0;

		if (n == 0 || n == 1)
			return n;

		if (n > 1) {
			sum += recursiveFib(n - 2);
			sum += recursiveFib(n - 1);
		}

		return sum;
	}
};