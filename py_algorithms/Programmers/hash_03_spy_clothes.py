# 1. Input clothes [[name, kind]...]
# 2. Make dictionary {kind, count_clothes}
# 3. Get sum of multiplication of (count_clothes + 1)
# 4. Return (sum - 1) for subtract wearing nothing

def solution(clothes):    
    dictClothes = {}
    for i in range(0, len(clothes)):
        if clothes[i][1] in dictClothes:
            dictClothes[clothes[i][1]] += 1
        else:
            dictClothes[clothes[i][1]] = 1

    mul = 1
    for value in dictClothes.values():
        mul *= (value + 1)
    
    return mul - 1