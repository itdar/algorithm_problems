# Process
# 1. Input array, commands
# 2. Iterate all commands
#  2.1. Get sub array using commands
#  2.2. Get target value from subarray
#  2.3. Put target_value into the result_array
# 3. Return result array

def solution(array, commands):
    result_array = []
    
    for command in commands:
        temp_array = array[command[0] - 1 : command[1]]
        temp_array.sort()
        result_array.append(temp_array[command[2]-1])
    
    return result_array


# def solution(array, commands):
#     result_array = []
    
#     for command in commands:
#         temp_array = []
#         i = command[0]-1
#         while i <= command[1]-1:
#             temp_array.append(array[i])
#             i += 1
#         temp_array.sort()
#         result_array.append(temp_array[command[2]-1])
    
#     return result_array