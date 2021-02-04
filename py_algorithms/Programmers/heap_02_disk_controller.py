# Process SJF(Short Job First)
# 1. Input tasks [[input_time, task_time], ..]
# 2. Sort using input_time
# 3. Iterate till tasks is remained
#  3.1. Search shortest task which input time is under time spent
#  3.2. Do task and ++time
# 4. Return total time / initial length of tasks

import heapq
import math

def solution(tasks):
    
    whole_task_time = 0
    time_spent = 0
    len_tasks = len(tasks)
    
    # 2.
    tasks_sorted = sorted(tasks, key=lambda k: (k[0]), reverse=False)
        
    if len_tasks > 0:
        # 3.
        while len(tasks_sorted) > 0:
            # 3.1.
            current_input_time = tasks_sorted[0][0]
            shortest_task_time = tasks_sorted[0][1]
            index = 0
            i = 1
            if time_spent <current_input_time:
                time_spent = current_input_time
            while i < len(tasks_sorted) and tasks_sorted[i][0] <= time_spent:
                if tasks_sorted[i][1] <= shortest_task_time:
                    index = i
                    shortest_task_time = tasks_sorted[i][1]
                i += 1
            working_task = tasks_sorted.pop(index)
            
            # 3.2.
            time_spent += working_task[1]
            
            whole_task_time += (time_spent - (working_task[0]))
            
    return math.floor(whole_task_time / len_tasks)