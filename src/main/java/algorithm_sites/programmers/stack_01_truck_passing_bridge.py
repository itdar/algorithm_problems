# Process
# 1. Input length of bridge, endurable weights, truck weights
# 2. Iterate while waiting truck or passing truck is exist
#  2.1. Check passing truck, and move forward (reduce left length of each)
#  2.2. Check the most front one is pass or not
#   2.2.1. If so -> remove in the queue, and restore endurable weight
#  2.3. Check if there is remained truck for passing by
#   2.3.1. If so -> add in the queue, and reduce endurable weight
#  2.4. Count time
# 3. Return time

def solution(bridge_length, weight, truck_weights):
    time = 0
    
    trucks_passing = []
    length_left = []
    endurable_weight = weight
    while len(truck_weights) + len(trucks_passing) > 0:
        if len(trucks_passing) > 0:
            for i in range(0, len(length_left)):
                length_left[i] -= 1
                
            if length_left[0] <= 0:
                endurable_weight += trucks_passing[0]
                length_left.pop(0)
                trucks_passing.pop(0)
        
        if len(truck_weights) > 0 and endurable_weight >= truck_weights[0]:
            length_left.append(bridge_length)
            trucks_passing.append(truck_weights[0])
            
            endurable_weight -= truck_weights[0]
            truck_weights.pop(0)
        
        time += 1
        
    return time