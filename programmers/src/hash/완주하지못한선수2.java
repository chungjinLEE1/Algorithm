package hash;

import java.util.HashMap;

public class 완주하지못한선수2 {
    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"leo"};
        완주하지못한선수2 sol = new 완주하지못한선수2();

        System.out.println(sol.solution(part, comp));
    }

    public String solution(String[] participant, String[] completion){
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for(String player : participant){
            map.put(player,  map.getOrDefault(player , 0) + 1);
        }
        System.out.println(map);
        for(String player : completion){
            map.put(player, map.get(player) -1);
        }
        System.out.println(map);

        for(String key : map.keySet()){
            if(map.get(key) != 0){
                answer += key + " ";
            }
        }
        return answer;
    }
}
