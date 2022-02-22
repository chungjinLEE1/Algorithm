package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 이중우선순위큐 {
    public static void main(String[] args) {
        이중우선순위큐 s = new 이중우선순위큐();


    }


    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();

        for(String operation : operations){
            String[] splitOther = operation.split(" ");

            if(splitOther[0].equals("I")){
                max.add(Integer.parseInt(splitOther[1]));
                min.add(Integer.parseInt(splitOther[1]));
            }

            if (splitOther[0].equals("D")) {
                if(!max.isEmpty()){
                    if(splitOther[1].equals("1")){
                        int max2 = max.peek();
                        max.remove(max2);
                        min.remove(max2);
                    }else {
                        int min2 = min.peek();
                        max.remove(min2);
                        max.remove(min2);
                    }
                }
            }
            if(!min.isEmpty()){
                answer[0] = max.peek();
                answer[1] = min.peek();
            }


        }


        return answer;
    }
}
