# Process
# 1. Input operations
# 2. Iterate operations
#  2.1. Do operation with queue
# 3. Check queue for answer
# 4. Return answer

def solution(operations):
    answer = []
    
    array_queue = []
    
    for operation in operations:        
        if operation.startswith('I'):
            array_queue.append(int(operation[2:]))
        elif operation.startswith('D') and len(array_queue) > 0:
            if operation.endswith('-1'):
                pop_smallest(array_queue)
            else:  # 1
                pop_largest(array_queue)
        print(array_queue)
        
    if len(array_queue) > 1:
        answer.append(pop_largest(array_queue))
        answer.append(pop_smallest(array_queue))
    else:
        answer.append(0)
        answer.append(0)
    
    return answer


# priority queue 혹은 heapq 를 적용하려고 한참 하다가 그냥 만들어서 함
def pop_largest(array_queue):
    max_index = 0
    max_val = array_queue[max_index]
    for i in range(1, len(array_queue)):
        if array_queue[i] > max_val:
            max_val = array_queue[i]
            max_index = i
    del array_queue[max_index]
    return max_val


def pop_smallest(array_queue):
    min_index = 0
    min_val = array_queue[min_index]
    for i in range(1, len(array_queue)):
        if array_queue[i] < min_val:
            min_val = array_queue[i]
            min_index = i
    del array_queue[min_index]
    return min_val