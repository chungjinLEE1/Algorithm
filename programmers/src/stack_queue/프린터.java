package stack_queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 프린터 {

    public static void main(String[] args) {
        프린터 result = new 프린터();
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(result.solution(priorities, location));

    }

    public int solution(int[] priorities, int location) {
        int answer = 0;


        // Queue 사용
        // 우선순위 : priorities 값이 높을 수록 먼저 출력된다.
        // priorities를 순회하면서 가장 높은 수를 찾아야 한다 .

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int n : priorities) {
            queue.add(n);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;

                    if (location == i) return answer;
                }
            }
        }

        return answer;
    }
}
