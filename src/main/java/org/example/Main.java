package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book historyBook = new Book("0-061-96436", "Sapiens", "Yuval Noah Harari" );
        Book myFavoriteNovel = new Book("0-061-962136", "Anna Karenina", "Leo Tolstoy" );

        Magazine myFashionMagazine = new Magazine(7242, "Vogue","Anna Wintour");
        Magazine myGeographyMagazine = new Magazine(1124, "National Geographic","Gilbert Hovey");

        List<LibraryItem> library = new ArrayList<LibraryItem>();
        library.add(historyBook);
        library.add(myFavoriteNovel);
        library.add(myFashionMagazine);
        library.add(myGeographyMagazine);

        for (LibraryItem libraryItem : library) {
            System.out.println(libraryItem.getDescription());
        }
    }

}