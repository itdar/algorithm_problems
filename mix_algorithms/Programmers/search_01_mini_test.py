# Process
# 1. Input answers
# 2. Make math throwers answers
# 3. Compare answers and math throwers' answers
# 4. Get people who got highest score
# 5. Return result

# 문제 설명이 개같고 테스트케이스도 병신

def solution(answers):
    result = []
    
    # 2.
    math_thrower_1 = []
    math_thrower_2 = []
    math_thrower_3 = []
    
    exam_problems = len(answers)
    for i in range(1, exam_problems+1):
        remainder_of_5 = i % 5
        remainder_of_8 = i % 8
        remainder_of_10 = i % 10
        
        if remainder_of_5 == 0: math_thrower_1.append(5)
        else: math_thrower_1.append(remainder_of_5)
            
        if remainder_of_8 == 1 or remainder_of_8 == 3 or remainder_of_8 == 5 or remainder_of_8 == 7 : math_thrower_2.append(2)
        elif remainder_of_8 == 2 : math_thrower_2.append(1)
        elif remainder_of_8 == 4 : math_thrower_2.append(3)
        elif remainder_of_8 == 6 : math_thrower_2.append(4)
        elif remainder_of_8 == 0 : math_thrower_2.append(5)
        
        if remainder_of_10 < 1 : math_thrower_3.append(5)
        elif remainder_of_10 < 3 : math_thrower_3.append(3)
        elif remainder_of_10 < 5 : math_thrower_3.append(1)
        elif remainder_of_10 < 7 : math_thrower_3.append(2)
        elif remainder_of_10 < 9 : math_thrower_3.append(4)
        elif remainder_of_10 < 11 : math_thrower_3.append(5)
            
    # 3.
    correct_counts = [0,0,0]
    
    for i in range(len(answers)):
        if answers[i] == math_thrower_1[i] : correct_counts[0] += 1
        if answers[i] == math_thrower_2[i] : correct_counts[1] += 1
        if answers[i] == math_thrower_3[i] : correct_counts[2] += 1
    
    # 4.
    highest_score = max(correct_counts)
    for i in range(len(correct_counts)):
        if highest_score == correct_counts[i]:
            result.append(i+1)
    
    # 5.
    return result