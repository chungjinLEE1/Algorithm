package hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 위장 {

    public static int Solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        // 옷을 종류별로 구분하여 경우의 수를 구하는 경우.
        // headgear : 3
        // eyeware : 2
        for(int i=0; i<clothes.length; i++){
            // 종류
            String key = clothes[i][1];
            System.out.println("key : " + key );
            // 종류별 요소 갯수
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int answer = 1;

        // value를 곱해야 하기
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            answer *= entry.getValue() + 1;
        }
        return answer - 1;

    }

    public static void main(String[] args) {
        위장 s = new 위장();
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(위장.Solution(clothes));
    }
}




// headgear 3가지
// bluesungl 2가지