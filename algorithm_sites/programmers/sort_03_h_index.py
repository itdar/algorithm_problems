# Process
# 1. Input citations list
# 3. Iterate from maximum h index to lowest h index (0)
#  3.1. Count how many papers are having citation count over h index
#  3.2. Check if count is over h_index or not
#   3.3. If so -> h_index return
# 4. Finish

# # performace 올려야함
def solution(citations):
    for index in range(len(citations), 0, -1):
        count = 0
        for i in range(0, len(citations)):
            if citations[i] >= index:
                count += 1
                if count >= index:
                    return index
    return 0