package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {

    // bridge_length : 다리에 올라갈 수 있는 트럭 수
    // weight : 다리가 견딜 수 있는 무게
    // truck_weight : 트럭별 무게
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // 마지막 트럭을 제외한 모든 트럭이 다리를 통과하는데 걸린 시간.
        int answer = 0;

        // 현재 다리의 트럭 무게 총합, 트럭
        int temp_weight = 0, idx = 0;

        // 다리를 큐로 구현.
        Queue<Integer> queue = new LinkedList<>();

        // 마지막 트럭을 제외한 모든 트럭을 통과시키기 위한 무한 반복.
        while(true){
            // 마지막 트럭이 다리에 올라갔을 때 벗어난다 .
            if(idx == truck_weights.length) break;
            // 다리에 있는 트럭이 끝에 도달하면, 도달한 트럭의 무게를 현재 다리의 트럭 무게 총합에서 빼준다.
            if(queue.size() == bridge_length){
                temp_weight=queue.poll();

            }
            // 현재 다리의 트럭 무게 총합 + 다리에 올라가야 하는 트럭의 무게 > 다리의 하중인 경우.
            else if(temp_weight + truck_weights[idx] > weight){
                // 다리의 길이를 고려하기 위해 0인 값을 넣어 자리를 채우고, 1초 증가.
                queue.offer(0);
                answer++;
                // 위를 제외하고는 다리에 트럭이 올라간다.
            }else{
                queue.offer(truck_weights[idx]);
                temp_weight += truck_weights[idx];
                answer++;
                idx++;
            }
        }
        return answer + bridge_length;
    }




}
