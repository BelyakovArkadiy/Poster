package ru.netology.manager;

import ru.netology.domain.Poster;

public class PosterManager {
    private Poster[] items = new Poster[0];
    private int limitMovie;

    public PosterManager(int limitMovie) {
        this.limitMovie = limitMovie;
    }

    public PosterManager() {
    }


    public void add(Poster item) {
        int length = items.length + 1;
        Poster[] tmp = new Poster[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Poster[] getAll() {

        if (items.length < limitMovie) {
            Poster[] result = new Poster[items.length];
            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;

        }
        else if (limitMovie <= items.length) {
            Poster[] result = new Poster[items.length-(items.length-limitMovie)];
            for (int i = 0; i < limitMovie; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }
        return null;
    }


}


