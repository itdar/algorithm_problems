# Process
# 1. Input scoville array and threshold K
# 2. Make heap queue
# 3. Iterate while all scoville is over K
#  3.1. Check scoville (smallest one)
#   3.1.1. If passed -> done.
#   3.1.2. If not -> mix foods
#  3.3. Count
# 4. Return answer

import heapq

def solution(scoville, K):
    count = 0
    
    # 2. 
    heap_scoville = []
    for value in scoville:
        heapq.heappush(heap_scoville, value)
    
    # 3.
    is_done = False
    while len(heap_scoville) >= 1:
        first = heapq.heappop(heap_scoville)
        if first >= K: 
            is_done = True
            break
        else:
            if len(heap_scoville) > 0:
                second = heapq.heappop(heap_scoville)
                mixed = mix_food(first, second)
                heapq.heappush(heap_scoville, mixed)
        count += 1
        
    if not is_done:
        return -1
        
    return count



def mix_food(food_a, food_b):
    if food_a > food_b:
        return food_b + food_a * 2
    else:
        return food_a + food_b * 2