# 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
# 
# 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

# 1. Input participant and completion arrays
# 2. Make participant Hash <Name, Count>
# 3. Iterate completion array
#  3.1. Check Hash
#   3.1.1. If Hash has Name of completion, reduce Count.
#   3.1.2. If Hash doesn't have Name or Count == 0, then remove that Name Hash.
# 4. Return remained participant Name from Hash 

import collections

# Fixed
def solution(participant, completion):
    hash_dict = collections.Counter(participant) - collections.Counter(completion)
    
    return hash_dict.keys()

# Initial
def solution_01(participant, completion):
    hash_dict = {}
    for name in participant:
        if name in hash_dict:
            hash_dict[name] = hash_dict[name] + 1
        else:
            hash_dict[name] = 1
    
    for completion_name in completion:
        if completion_name in hash_dict:
            hash_dict[completion_name] = hash_dict[completion_name] - 1
            if hash_dict[completion_name] < 1:
                del hash_dict[completion_name]
    
    for key in hash_dict:
        return key
    
    return hash_dict

