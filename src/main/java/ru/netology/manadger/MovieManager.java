package ru.netology.manadger;

import ru.netology.domain.MovieItem;


public class MovieManager {
    private MovieItem[] films = new MovieItem[0];
    private int limitFilms = 10;
    public MovieManager() {
    }
    public MovieManager(int limitFilms) {
        this.limitFilms = limitFilms;
    }

    public void add(MovieItem item) {
        int length = films.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(films,0, tmp,0,films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        films = tmp;

    }

    public MovieItem[] getAll() {
        MovieItem[] result = new MovieItem[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }


    public MovieItem[] takeTheLatestMovie() {
        int numFilm = Math.min(films.length, limitFilms);
        MovieItem[] result = new MovieItem[numFilm];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }


}
