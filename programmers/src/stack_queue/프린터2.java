package stack_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 프린터2 {

    public static void main(String[] args) {
        프린터2 result = new 프린터2();
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(result.solution(priorities, location));
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Pair> queue = new LinkedList<>();

        for(int i=0; i<priorities.length; i++){
            queue.add(new Pair(i, priorities[i]));
        }

        while(!queue.isEmpty()){
            int current = queue.peek().value;

            boolean flag = false;

            for(Pair pair : queue){
                if(pair.value > current){
                    flag = true;
                    break;
                }
            }

            if(flag){
                Pair temp = queue.poll();
                queue.add(temp);
            }else{
                answer++;
                Pair pair = queue.poll();

                if(pair.index ==location){
                    return answer;
                }
            }
        }
        return answer;
    }

    class Pair{
        int index;
        int value;

        public Pair(int index, int value){
            this.index = index;
            this.value = value;
        }
    }
}
