package org.example.project12;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("${bookName}")
    private String bookName;

    public String getBookName() {
        return bookName;
    }
}
