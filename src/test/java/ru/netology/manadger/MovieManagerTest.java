package ru.netology.manadger;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MovieManagerTest {
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
    private final MovieItem film11 = new MovieItem(11, 11, "Kiss", "melodrama", 2010);
//@BeforeEach
    //  public void setup(){
    //  manager.add(film1);
    //   manager.add(film2);
//    manager.add(film3);
    //   manager.add(film4);
    //  manager.add(film5);
    // manager.add(film6);
    //  manager.add(film7);
    //  manager.add(film8);
    //  manager.add(film9);
    //  manager.add(film10);
    //  manager.add(film11);

    @Test
    public void shouldGetFastFilm() {
        MovieManager manager = new MovieManager();
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

        MovieItem[] actual = manager.getFast();
        MovieItem[] expected = new MovieItem[]{film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};


        assertArrayEquals(expected, actual);
    }
}

