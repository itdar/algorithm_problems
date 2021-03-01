# Process
# 1. Input brown, yellow numbers
# 2. Check the number of edges (brown)
#  2.1. If so -> Check the number of inner sector (yellow)
#   2.1.1. If so -> append to answer (width, height)
# 3. Return valid size

import math

def solution(brown, yellow):
    answer = []
    
    # 2.
    init_brown = math.ceil(brown / 2)
    end_brown = 3
    for width_brown in range(init_brown, end_brown-1, -1):
        height_brown = (brown - (width_brown*2)) // 2 + 2
        # 2.1.
        if (width_brown - 2) * (height_brown - 2) == yellow:
            answer.append(width_brown)
            answer.append(height_brown)
            break
    
    return answer