package ru.netology.manadger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MovieManagerTest {
    MovieManager manager = new MovieManager();
    private final MovieItem film1 = new MovieItem(1, 1, "Happy", "comedy", 2000);
    private final MovieItem film2 = new MovieItem(2, 2, "Love", "melodrama", 2005);
    private final MovieItem film3 = new MovieItem(3, 3, "Boxer", "triller", 1990);
    private final MovieItem film4 = new MovieItem(4, 4, "West", "western", 2000);
    private final MovieItem film5 = new MovieItem(5, 5, "Dead", "horror", 2020);
    private final MovieItem film6 = new MovieItem(6, 6, "Ring", "triller", 1990);
    private final MovieItem film7 = new MovieItem(7, 7, "Lover", "melodrama", 2005);
    private final MovieItem film8 = new MovieItem(8, 8, "Ono", "horror", 2020);
    private final MovieItem film9 = new MovieItem(9, 9, "Road", "western", 2010);
    private final MovieItem film10 = new MovieItem(10, 10, "Smile", "comedy", 2019);
    private final MovieItem film11 = new MovieItem(33, 11, "Kiss", "melodrama", 2010);

    @BeforeEach
    public void setup() {
        manager.add(film1);
        manager.add(film11);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
    }

    @Test
    public void shouldGetFastFilm() {
        MovieItem[] actual = manager.takeTheLatestMovie();
        MovieItem[] expected = new MovieItem[]{film10, film9, film8, film7, film6, film5, film4, film3, film2, film11};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void ReturnLessThan10() {
        MovieManager manager = new MovieManager(8);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        MovieItem[] actual = manager.takeTheLatestMovie();
        MovieItem[] expected = new MovieItem[]{film10, film9, film8, film7, film6, film5, film4, film3};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void Return4() {
        MovieManager manager = new MovieManager(3);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.takeTheLatestMovie();
        MovieItem[] actual = manager.takeTheLatestMovie();
        MovieItem[] expected = new MovieItem[]{film10, film9, film8};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ReturnLessThan5() {
        MovieManager manager = new MovieManager(4);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        MovieItem[] actual = manager.takeTheLatestMovie();
        MovieItem[] expected = new MovieItem[]{film10, film9, film8, film7};

        assertArrayEquals(expected, actual);
    }
//добавление фильмов больше 10
    @Test
    public void moreThanLimit10Films() {
        MovieManager manager = new MovieManager(11);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);
        MovieItem[] actual = manager.takeTheLatestMovie();
        MovieItem[] expected = new MovieItem[]{film11, film10, film9, film8, film7, film6, film5, film4, film3, film2,  film1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAll() {
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{film10, film9, film8, film7, film6, film5, film4, film3, film2, film1, film11};
        assertArrayEquals(expected, actual);
    }

}

