package com.xworkz.Latent.external;

import com.xworkz.Latent.internal.Book;
import com.xworkz.Latent.internal.Food;

public class Author {
    private Book book;

    public Author(Book book){
        this.book=book;
    }
    public void publish(){
        if(book !=null){
            this.book.read();
        }
        else{
            System.out.println("Null");
        }
    }
}
