package algo_lib;

public class CheckPrimeNumber {

    public boolean sieveCheckPrimeNumber(int number) {
        if (number <= 1) return false;

        boolean[] sieve = new boolean[number+1];

        for (int i = 2; i*i <= number; ++i) {
            if (!sieve[i]) {
                for (int j = i*i; j <= number; j += i) {
                    sieve[j] = true;
                }
            }
        }

        return !sieve[number];
    }

    public int sieveCountPrimeNumber(int number) {
        int count = 0;

        boolean[] sieve = new boolean[number+1];
        for (int i = 2; i <= number; ++i) {
            if (!sieve[i]) {
                ++count;
                for (int j = i; j <= number; j += i) {
                    sieve[j] = true;
                }
            }
        }

        return count;
    }
}
