package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class MoviesManagerTest {

    private int movie;
    MoviesManager manager = new MoviesManager(movie);


    String movie1 = "Bladshot";
    String movie2 = "Ahead";
    String movie3 = "HotelBelgrad";
    String movie4 = "Gentlemen";
    String movie5 = "InvisibleMan";
    String movie6 = "Trolls";
    String movie7 = "NumberOne";

    public void setup() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

    }


    @Test
    public void test1() {
        MoviesManager manager = new MoviesManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        MoviesManager manager = new MoviesManager();

        manager.add("movie1");

        String[] expected = {"movie1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test3() {
        MoviesManager manager = new MoviesManager();

        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");


        String[] expected = {"movie1", "movie2", "movie3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void getTest4() {
        MoviesManager manager = new MoviesManager();

        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");
        manager.add("movie5");


        String[] expected = {"movie5", "movie4", "movie3", "movie2", "movie1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getTest5() {
        MoviesManager manager = new MoviesManager();

        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");


        String[] expected = {"movie3", "movie2", "movie1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}






