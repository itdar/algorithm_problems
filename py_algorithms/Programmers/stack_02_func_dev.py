# Process
# 1. Input progresses and speeds
# 2. Iterate while progresses is empty
#  2.1. Iterate all
#   2.1.1. Add all speed of work
#  2.2. Iterate from begin to the value less than 100 or the end
#   2.2.1. Check if it's over 99
#    2.2.1.1. If so -> pop, and count
#    2.2.1.2. If not -> end of iteration
#  2.3. Append count to answer
# 3. Return answer[]

def solution(progresses, speeds):
    answer = []
    
    while len(progresses) > 0:
        count = 0
        for i in range(0, len(progresses)):
            progresses[i] += speeds[i]
        isDone = False
        j = 0
        while (j < len(progresses) and not isDone):
            if progresses[j] >= 100:
                count += 1
                progresses.pop(j)
                speeds.pop(j)
                j -= 1
            else:
                isDone = True
            j += 1
        if count > 0:
            answer.append(count)
    
    return answer