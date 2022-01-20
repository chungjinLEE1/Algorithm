package stack_queue;

import java.util.*;

public class 기능개발3 {

    public static void main(String[] args) {
        기능개발3 result = new 기능개발3();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(result.solution(progresses, speeds)));


    }


    public int[] solution(int[] progresses, int[] speeds){
        Queue<Integer> queue = new LinkedList<>();

        int num = 0;
        int len = progresses.length;

        for(int i=0; i<=len; i++){
            if(i == len){
                queue.add(num);
                break;
            }
            if(progresses[i] >= 100){
                num++;
                continue;
            }
            if(num != 0){
                queue.add(num);
            }

            num = 0;
            int remain = 100 -progresses[i];
            int day = remain / speeds[i];
            if(remain % speeds[i] != 0) day++;

            for(int j = i; j< len; j++){
                progresses[j] += (day * speeds[j]);
            }
            num++;

        }
        int[] answer = new int[queue.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = queue.poll();
        }
        return answer;
    }
}
