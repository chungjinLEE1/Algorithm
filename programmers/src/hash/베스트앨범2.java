package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 베스트앨범2 {

    public int[] solution(String[] genres, int[] plays) {

        Map<String, GenreInfo> map = new HashMap<String, GenreInfo>();

        for (int i = 0; i < genres.length; i++) {

            SongInfo song = new SongInfo();
            song.setIndex(i);
            song.setPlays(plays[i]);

            GenreInfo genre = map.get(genres[i]);

            if (genre == null) {
                genre = new GenreInfo();
                genre.setSong(new ArrayList<SongInfo>());
                map.put(genres[i], genre);
            }

            genre.setSum(genre.getSum() + plays[i]);
            genre.getSong().add(song);
        }

        List<GenreInfo> genreList = new ArrayList<GenreInfo>();
        for (GenreInfo g : map.values()) {
            g.getSong().sort((o1, o2) -> o2.getPlays() - o1.getPlays());
            genreList.add(g);
        }

        genreList.sort((o1, o2) -> o2.getSum() - o1.getSum());

        List<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < genreList.size(); i++) {

            List<SongInfo> song = genreList.get(i).getSong();
            int size = song.size();

            answer.add(song.get(0).getIndex());

            if (size > 1) {
                answer.add(song.get(1).getIndex());
            }
        }

        int size = answer.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = answer.get(i);
        }

        return result;
    }


    class GenreInfo {

        private int sum;
        private List<SongInfo> song;

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }

        public List<SongInfo> getSong() {
            return song;
        }

        public void setSong(List<SongInfo> song) {
            this.song = song;
        }
    }

    class SongInfo {

        private int index;
        private int plays;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getPlays() {
            return plays;
        }

        public void setPlays(int plays) {
            this.plays = plays;
        }
    }
}
