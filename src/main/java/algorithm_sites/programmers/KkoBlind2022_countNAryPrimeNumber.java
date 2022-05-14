package algorithm_sites.programmers;

public class KkoBlind2022_countNAryPrimeNumber {

    public int solution(int n, int k) {
        int answer = 0;

        String kAryNumber = Integer.toString(n, k);

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < kAryNumber.length(); ++i) {
            if (kAryNumber.charAt(i) != '0') {
                sb.append(kAryNumber.charAt(i));
                continue;
            }

            if (kAryNumber.charAt(i) == '0') {
                if (sb.length() > 0) {
                    if (isPrime(Long.parseLong(sb.toString()))) {
                        ++answer;
                    }
                }

                sb = new StringBuffer();
            }
        }

        if (sb.length() > 0) {
            if (isPrime(Long.parseLong(sb.toString()))) {
                ++answer;
            }
        }

        return answer;
    }

    public boolean isPrime(long num) {
        if(num == 1) {
            return false;
        } else if(num == 2) {
            return true;
        }

        int limit = (int) Math.sqrt(num);
        for(int i=2; i<=limit; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

//    private boolean sieveCheckPrimeNumber(long number) {
//        if (number <= 1) return false;
//
//        boolean[] sieve = new boolean[(int)number+1];
//
//        for (int i = 2; i*i <= number; ++i) {
//            if (!sieve[i]) {
//                for (int j = i*i; j <= number; j += i) {
//                    sieve[j] = true;
//                }
//            }
//        }
//
//        return !sieve[(int)number];
//    }

}
