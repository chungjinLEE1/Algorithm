package sort;

import java.util.Arrays;

public class HIndex {

    public static void main(String[] args) {
        HIndex h = new HIndex();

        int[] citations = new int[5];

        citations[0] = 3;
        citations[1] = 0;
        citations[2] = 6;
        citations[3] = 1;
        citations[4] = 5;

        System.out.println(h.solution(citations));


    }

    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;

        for(int i=0; i<citations.length; i++){
            int h = citations.length -i;
            if(citations[i]>= h){
                answer = h;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }

}
