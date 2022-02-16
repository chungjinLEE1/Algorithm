package stack_queue;

import com.sun.org.apache.regexp.internal.RE;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭2 {

    public int solution(int bridge_length, int weight, int[] truck_weights){
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int allWeight = 0;
        int time = 0;


        for(int i : truck_weights){
            while(true){
                // Q(다리)에 트럭 없는 경우
                if(q.isEmpty()){
                    q.offer(i);
                    allWeight += i;
                    time++;
                    break;
                    // Q(다리)에 트럭이 들어갈 자리가 없는 경우
                }else if(q.size() == bridge_length){
                    allWeight -= q.poll();
                }else { // Q(다리)에 자리도 있고 다음 트럭을 실을 무게도 괜찮은 경우 q.offer()
                    if(weight >= allWeight + i){
                        q.offer(i);
                        allWeight += i;
                        time++;
                        break;
                    }else{
                        q.offer(0);
                        time++;
                    }
                }
            }


        }

        //마지막으로 들어있는 트럭이 빠져나오는 시간을 더해줌.
        answer += time + bridge_length;

        return answer;
    }

}
