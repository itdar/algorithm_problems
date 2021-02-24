# Process
# 1. Input numbers
# 2. Make sieve depending on length of numbers
# 3. Make all number permutations
# 4. Check if each number made is prime number or not
#  4.1. If so -> ++count
# 4. Return count

# 파이썬 문법 잘 몰라서 까다로운게 있었음
# 순열 재귀구현은 해보면 좋을 듯함

from itertools import permutations

def solution(numbers):
    count = 0
    
    # 2.
    sieve_length = ''
    for i in range(len(numbers)):
        sieve_length += '9'
    primes = sieve(int(sieve_length))
    
    # 3. 
    digit_numbers = []
    for i in range(1, len(numbers)+1):
        digit_numbers.extend(set(permutations(numbers, i)))
    for i in range(len(digit_numbers)):
        temp = ''
        for j in range(len(digit_numbers[i])):
            temp += digit_numbers[i][j]
        digit_numbers[i] = int(temp)
    
    # 4.
    for i in range(len(digit_numbers)):
        if digit_numbers[i] in primes:
            count += 1
            primes.remove(digit_numbers[i])
    
    return count

    
def sieve(end):
    prime_list = []
    sieve_list = list(range(end+1))
    for each_number in range(2,end+1):
        if sieve_list[each_number]:
            prime_list.append(each_number)
            for every_multiple_of_the_prime in range(each_number*2, end+1, each_number):
                sieve_list[every_multiple_of_the_prime] = 0
    return prime_list