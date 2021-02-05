
package ru.netology.manager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Poster;

import static org.junit.jupiter.api.Assertions.*;

        class PosterManagerTest {
        PosterManager manager = new PosterManager();

        Poster m1 = new Poster(1, 1, "first", 1);
        Poster m2 = new Poster(2, 2, "second", 1);
        Poster m3 = new Poster(3, 3, "third", 1);
        Poster m4 = new Poster(4, 4, "fi", 1);
        Poster m5 = new Poster(5, 5, "sec", 1);
        Poster m6 = new Poster(6, 6, "th", 1);
        Poster m7 = new Poster(7, 7, "firs", 1);
        Poster m8 = new Poster(8, 8, "seco", 1);
        Poster m9 = new Poster(9, 9, "thi", 1);
        Poster m10 = new Poster(10, 10, "fir", 1);
        Poster m11 = new Poster(11, 11, "se", 1);
        Poster m12 = new Poster(12, 12, "thd", 1);



        @Test
        void showPoster() {
                PosterManager manager = new PosterManager(10);
                manager.add(m1);
                manager.add(m2);
                manager.add(m3);
                manager.add(m4);
                manager.add(m5);
                manager.add(m6);
                manager.add(m7);
                manager.add(m8);
                manager.add(m9);
                manager.add(m10);

        Poster[] actual = manager.getAll();
        Poster[] expected = new Poster[]{m10, m9, m8, m7, m6, m5, m4, m3,m2,m1};
        assertArrayEquals(actual, expected);

        }


        @Test
        void showPoster2() {
                PosterManager manager = new PosterManager(5);
                manager.add(m1);
                manager.add(m2);
                manager.add(m3);
                manager.add(m4);
                manager.add(m5);
        Poster[] actual = manager.getAll();
        Poster[] expected = new Poster[]{m5,m4,m3,m2,m1};
        assertArrayEquals(actual, expected);
        }

        @Test
        void showPoster3() {
                PosterManager manager = new PosterManager(10);
                manager.add(m1);
                manager.add(m2);
                manager.add(m3);
                manager.add(m4);
                manager.add(m5);
                manager.add(m6);
                manager.add(m7);
                manager.add(m8);
                manager.add(m9);
                manager.add(m10);
                manager.add(m11);
                manager.add(m12);
        Poster[] actual = manager.getAll();
        Poster[] expected = new Poster[]{m12,m11,m10, m9, m8, m7, m6, m5, m4, m3};
        assertArrayEquals(actual, expected);
        }
        }
