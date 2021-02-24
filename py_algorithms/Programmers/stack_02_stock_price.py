# Process (list)
# 1. Input prices list
# 2. Iterate i from begin to the end
#  2.1. Iterate j from i to the end
#   2.1.1. Check if [j] is smaller than [i]
#    2.1.1.1. If so - it's done
#   2.1.2. Count
#  2.2. Add to answer_list
# 3. Return answer_list

def solution(prices):
    answer_list = []
    
    for i in range(0, len(prices)):
        isDone = False
        count = 0
        j = i
        while (j < len(prices) and not isDone):
            count+=1
            if prices[i] > prices[j]:
                isDone = True
            j+=1
        answer_list.append(count-1)
    
    return answer_list

# 왜 스택 문제인지? 봐야함