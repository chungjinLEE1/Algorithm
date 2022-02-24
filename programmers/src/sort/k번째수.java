package sort;

import java.util.Arrays;

public class k번째수 {

    public int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int a,b,c;
            a = commands[i][0];
            b = commands[i][1];
            c = commands[i][2];
            int[] temp = Arrays.copyOfRange(array, a-1, b);
            Arrays.sort(temp);
            answer[i] = temp[c-1];
        }
        return answer;
    }





}
