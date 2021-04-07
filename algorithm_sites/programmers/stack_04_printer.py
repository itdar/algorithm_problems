# Process
# 1. Input priorities, location
# 2. Make location_tracker plate for the location index I need to know
# 3. Iterate while remaining priorities
#  3.1. Pop first index of priority from the queue
#  3.2. Check if bigger priority is exist or not
#   3.2.1. If so -> change the priorites queue and location tracking queue
#  3.3. Check if it's poped permanently
#   3.3.1. Count answer
#   3.3.2. If the index I need to know is poped permanently, then finish the process
# 4. Return answer

def solution(priorities, location):
    answer = 0
    isDone = False
    
    # 2.
    location_index_plate = []
    for i in range(0, len(priorities)):
        location_index_plate.append(False)
        if i is location:
            location_index_plate[i] = True
    
    # 3.
    i = 0
    while i < len(priorities) and not isDone:
        best_priority = True
        priority = priorities.pop(i)
        tracing_index = location_index_plate.pop(i)
        
        # 3.2.
        j = 0
        while j < len(priorities) and best_priority:
            if priorities[j] > priority:
                priorities.append(priority)
                location_index_plate.append(tracing_index)
                best_priority = False
            j += 1
        
        # 3.3.
        if best_priority:
            answer += 1
            if tracing_index:
                isDone = True
    
    return answer