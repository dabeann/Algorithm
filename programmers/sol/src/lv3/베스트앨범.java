package lv3;

import java.util.*;

public class 베스트앨범 {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> totalPlays = new HashMap<>();
        Map<String, PriorityQueue<Music>> musicMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            totalPlays.put(genre, totalPlays.getOrDefault(genre, 0) + play);

            if (!musicMap.containsKey(genre)) {
                musicMap.put(genre, new PriorityQueue<>());
            }

            musicMap.get(genre).add(new Music(i, play));
        }

        PriorityQueue<Genre> genreQueue = new PriorityQueue<>((g1, g2) -> g2.totalPlays - g1.totalPlays);

        for (String genre : totalPlays.keySet()) {
            genreQueue.add(new Genre(genre, totalPlays.get(genre)));
        }

        List<Integer> answerList = new ArrayList<>();

        while (!genreQueue.isEmpty()) {
            String genre = genreQueue.poll().name;

            for (int i = 0; i < 2; i++) {
                PriorityQueue<Music> musicQueue = musicMap.get(genre);

                if (musicQueue != null && !musicQueue.isEmpty()) {
                    answerList.add(musicQueue.poll().id);
                }
            }
        }

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    static class Music implements Comparable<Music> {
        int id;
        int play;

        public Music(int id, int play) {
            this.id = id;
            this.play = play;
        }

        @Override
        public int compareTo(Music o) {
            if (this.play == o.play) {
                return Integer.compare(this.id, o.id);
            }
            return Integer.compare(o.play, this.play);
        }
    }

    static class Genre implements Comparable<Genre> {
        String name;
        int totalPlays;

        public Genre(String name, int totalPlays) {
            this.name = name;
            this.totalPlays = totalPlays;
        }

        @Override
        public int compareTo(Genre o) {
            return Integer.compare(o.totalPlays, this.totalPlays);
        }
    }
}
