package sort;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {

    public static void main(String[] args) {
        가장큰수 k = new 가장큰수();

        int[] numbers = new int[3];
        numbers[0] = 6;
        numbers[1] = 10;
        numbers[2] = 2;
        System.out.println(k.solution(numbers));

    }



    public String solution(int[] numbers) {
        String[] result = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        // 0만 여러개 있는 배열의 경우 하나의 0만 리턴.
        if(result[0].equals("0")){
            return "0";
        }

        String answer = "";

        for(String a : result){
            answer += a;
        }
        return answer;


    }


}
