package ru.netology.manadger;

import ru.netology.domain.MovieItem;


public class MovieManager {
    private MovieItem[] items = new MovieItem[0];
    private int limitFilms = 10;
    public MovieManager() {
    }
    public MovieManager(int limitFilm) {
        this.limitFilms = limitFilm;
    }

    public void add(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;

    }


    public MovieItem[] takeTheLatestMovie(int limitFilms) {
        int numFilm = Math.min(items.length, limitFilms);
        MovieItem[] result = new MovieItem[numFilm];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }


}
