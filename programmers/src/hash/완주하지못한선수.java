package hash;

import java.io.IOException;
import java.util.*;

public class 완주하지못한선수 {

    public static void main(String[] args) throws IOException {

        String[] part = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] comp = {"josipa", "filipa", "marina", "nikola"};
        완주하지못한선수 sol = new 완주하지못한선수();

        System.out.println(sol.solution(part, comp));
    }

    public ArrayList solution(String[] participant, String[] completion) {
        // 두 배열을 정렬한다.
        Arrays.sort(participant);
        Arrays.sort(completion);

        List<String> list = new ArrayList();

        for(int i=0; i<participant.length; i++){
            list.add(participant[i]);
        }

        for(int j=0; j<completion.length; j++){
            int index = Arrays.binarySearch(participant, completion[j]);
            list.remove(participant[index]);

        }
        return (ArrayList) list;

    }

}