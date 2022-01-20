package stack_queue;

import java.util.Arrays;

public class 기능개발2 {

    public static void main(String[] args) {
        기능개발2 result = new 기능개발2();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(result.solution(progresses, speeds)));
    }
    public int[] solution(int[] progresses, int[] speeds){
        int[] temp = new int[100]; // 작업의 개수를 100개 이하이므로 100으로 선언.
        int day = 0; // temp에 적용할 배포일 수

        for(int i=0; i<progresses.length; i++){
            while(progresses[i] + (speeds[i] * day)  < 100){
                day++;
            }
            temp[day]++;
            System.out.println("temp[day] : " + temp[day]);
        }

        int count = 0;

        for(int n : temp){
            if(n != 0){
                count++;
            }
        }
        int[] answer = new int[count];

        count = 0;
        for(int n : temp){
            if(n!=0){
                answer[count++] = n;
            }
        }

        return answer;

    }
}
