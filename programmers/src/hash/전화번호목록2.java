package hash;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class 전화번호목록2 {
    public static void main(String[] args) {
        전화번호목록2 list = new 전화번호목록2();
        System.out.println(list.solution(new String[]{"123, 123, 133, 144, 1221222121221212"}));
        list.solution(new String[]{"122, 133, 144, 1221222121221212"});
    }

    public boolean solution(String[] phone_book) {

        boolean answer = true;
        // 1. 해시맵<전화번호, 전화번호 길이> 저장.
        HashMap<String, Integer> map = new HashMap<>();


        // 2. 해시맵 데이터 입력.
        for (String str : phone_book) {
            map.put(str, str.length());
        }

        // 3. 기준점이 되는 전화번호를 탐색하는 반복문.
        for (String str : phone_book) {
            // 4. 기준점의 전화번호 길이 저장.
            int len = str.length();
            // 5. 해시맵 탐색.
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String key = entry.getKey();
                int value = entry.getValue();
                // 6. 기준점과 비교되는 문자열이 같은 문자열이면 continue
                if (str.compareTo(key) == 0) continue;
                // 7. 기준점의 전화번호 길이와 비교되는 해시맵에 저장된 key 전화번호의 value 길이 중 작은 값을 취한다 .
                int idx = len < value ? len : value;
                // 8. 두 문자열 모두 0 ~ idx 까지 잘라 비교
                if (str.substring(0, idx).compareTo(key.substring(0, idx)) == 0) {
                    return false;
                }
            }


        }
        return answer;

    }
}
