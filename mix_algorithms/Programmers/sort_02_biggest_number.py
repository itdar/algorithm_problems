# Process
# 1. Input numbers (int)
# 2. Convert int to str
# 3. Sort using value multiplied by 4, Descending direction.
# 4. Handle exception case
# 5. Return 


def solution(numbers):
    result = ''
    
    array_string = []
    for number in numbers:
        array_string.append(str(number))
    
    array_string = quicksort(array_string)
    
    for string in array_string:
        result += string
    
    if result.startswith('0'):
        result = '0'
    
    return result


def quicksort(x):
    if len(x) <= 1:
        return x

    pivot = x[len(x) // 2]
    less = []
    more = []
    equal = []
    for a in x:
        if a*4 > pivot*4:
            less.append(a)
        elif a*4 < pivot*4:
            more.append(a)
        else:
            equal.append(a)

    return quicksort(less) + equal + quicksort(more)