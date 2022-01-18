package hash;

import java.util.*;

public class 베스트앨범 {
    public static void main(String[] args) {
        베스트앨범 album = new 베스트앨범();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(album.solution(genres, plays));

    }

    public int[] solution(String[] generes, int[] plays){
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<String, Integer> h = new HashMap<>();

        for(int i=0; i<generes.length; i++){
            h.put(generes[i], h.getOrDefault(generes[i], 0) + plays[i]);
        }



        System.out.println("h : " + h);
        List<String> setList = new ArrayList<>(h.keySet());

        System.out.println("setList : " +setList);
        Collections.sort(setList ,(o1, o2) -> h.get(o2).compareTo(h.get(o1)));


        System.out.println(setList.stream().toArray());
        for(String key : setList){
            HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
            for(int i=0; i<generes.length; i++){
                if(key.equals(generes[i])){
                    hs.put(i, plays[i]);
                }
            }

            List<Integer> keyLists = new ArrayList<>(hs.keySet());
            keyLists.sort((a1, a2) -> hs.get(a2).compareTo(hs.get(a1)));
            int j = 0;
            for(Integer c : keyLists){
                if(j>1){
                    break;

                }
                arr.add(c);
                j++;
            }
        }
        answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }

        System.out.println("answer : " + answer);

        return answer;
    }

}
