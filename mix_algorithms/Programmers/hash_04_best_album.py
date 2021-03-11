# Process
# 1. Input genres and plays arrays
# 2. 딕셔너리 만든다.
#  2.1. 장르별로 총 플레이 횟수가 있는 딕셔너리 만든다. { str, int }
#  2.2. 장르별 딕셔너리 안에, 노래별로 플레이횟수와 인덱스가 있는 딕셔너리 만든다. { str, [int, int] }
# 3. 장르별 총 플레이 딕셔너리 플레이 수에 따라 내림차순으로 정렬
# 4. 정렬한 장르 이름을 키로 노래플레이횟수와 인덱스 리스트가 있는 딕셔너리를 반복한다.
#  4.1. 노래별 플레이 횟수 + 인덱스 리스트를 노래별 플레이 횟수의 내림차순 기준으로 정렬한다.
#  4.2. 정렬한 노래별플레이횟수 + 인덱스 리스트에서, 2개 이하로 뽑아내서 결과물 앨범에 넣는다.
# 5. Return answer

# 해시문제라고 있어서 딕셔너리 썼지만, 괜히 억지로 쓰느라 생각하기 어렵게 푼 것 같음

def solution(genres, plays):
    answer = []
    
    genre_play_index = { genre : [] for genre in genres }
    genre_plays = { genre : 0 for genre in genres }
    
    for i in range(len(genres)):
        genre_play_index[genres[i]].append([plays[i], i])
        genre_plays[genres[i]] += plays[i]
    
    genre_plays = dict(sorted(genre_plays.items(), key=lambda item:item[1], reverse=True))
    
    for genre_name in genre_plays.keys():
        play_index_sorted = sorted(genre_play_index[genre_name], 
                                   key=lambda play_index:play_index[0], reverse = True)
        for i in range(len(play_index_sorted)):
            if i < 2:
                answer.append(play_index_sorted[i][1])
    
    return answer