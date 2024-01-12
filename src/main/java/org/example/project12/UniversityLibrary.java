package org.example.project12;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary{

    public void getBook(Book book) {
        System.out.println("Мы берем книгу из UniversityLibrary " + book.getBookName());
    }

//    public void getBook(String bookName) {
//        System.out.println("Мы берем книгу из UniversityLibrary " + bookName);
//    }

//    public void getMagazine(int a) {
//        System.out.println("Мы берем журнал из UniversityLibrary " + a);
//    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniversityLibrary ");
    }
}
