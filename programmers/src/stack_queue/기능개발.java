package stack_queue;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 기능개발 {

    public static void main(String[] args) {
        기능개발 result = new 기능개발();
        int[] progresses = {92, 30, 55};
        int[] speeds = {1, 30, 5};

        System.out.println(Arrays.toString(new List[]{result.solution(progresses, speeds)}));

    }

    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();


        for(int i=0; i<progresses.length; i++){
            double work = 100 - progresses[i];
            int day = (int) Math.ceil(work / speeds[i]);

            list.add(day);
        }

        int cnt = 1;
        int max = list.get(0);
        for(int i =1; i<list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
                answer.add(cnt);
                cnt = 1;
            }else {
                cnt +=1;
            }
        }
        answer.add(cnt);

        return answer;

    }
}
