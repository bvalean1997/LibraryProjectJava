package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void LibraryDemo(String[] args) {
        Book historyBook = new Book("0-061-96436", "Sapiens", "Yuval Noah Harari" );
        Book myFavoriteNovel = new Book("0-061-962136", "Anna Karenina", "Leo Tolstoy" );

        Magazine myFashionMagazine = new Magazine(7242, "Vogue","Anna Wintour");
        Magazine myGeographyMagazine = new Magazine(1124, "National Geographic","Gilbert Hovey");

        // not finished yet
        List<String> list = new ArrayList<String>();
        list.add(String.valueOf(historyBook));
        list.add(String.valueOf(myFavoriteNovel));
        list.add(String.valueOf(myFashionMagazine));
        list.add(String.valueOf(myGeographyMagazine));


    }

}