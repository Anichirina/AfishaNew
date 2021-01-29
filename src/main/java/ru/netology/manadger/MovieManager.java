package ru.netology.manadger;

import ru.netology.domain.MovieItem;

public class MovieManager {

    private MovieItem[] items = new MovieItem[0];
    private final int arrayLenght;

    public MovieManager() {
        this.arrayLenght = 10;
    }


    public MovieManager(int arrayLenght) {
        this.arrayLenght = arrayLenght;
    }

    public void add(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;

    }


    public MovieItem[] getFast() {
        int lenght = Math.min(items.length, arrayLenght);
        MovieItem[] result = new MovieItem[lenght];
        for (int i = 0; i < lenght; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }



}
