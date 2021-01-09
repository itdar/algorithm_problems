# 1. Input participant and completion arrays
# 2. Make participant Hash <Name, Count>
# 3. Iterate completion array
#  3.1. Check Hash
#   3.1.1. If Hash has Name of completion, reduce Count.
#   3.1.2. If Hash doesn't have Name or Count == 0, then remove that Name Hash.
# 4. Return remained participant Name from Hash 

def solution(participant, completion):
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

