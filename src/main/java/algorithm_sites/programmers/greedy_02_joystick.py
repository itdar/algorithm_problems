def solution(name):
    answer = 0
    _name = list(filter(lambda e: e[1] > 65, enumerate([ord(c) for c in name])))
    
    print(_name)
    
    state = 0

    while _name:
        dist_r = min(abs(_name[0][0] - state), abs(len(name) - _name[0][0] + state))
        dist_l = min(abs(_name[-1][0] - state), abs(len(name) - _name[-1][0] + state))

        if dist_r <= dist_l:
            nextState = _name.pop(0)
            answer += dist_r
        else:
            nextState = _name.pop(-1)
            answer += dist_l

        answer += min(abs(nextState[1] - 65), 1+90-nextState[1])
        state = nextState[0]

    return answer