package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Author;
import com.xworkz.Micro.External.Textbook;

public class Writer {
    public void story(Textbook textbook){
        textbook.color();
        textbook.read();
        textbook.design();
        textbook.type();
        textbook.write();

        if(textbook instanceof Author){
            Author author=new Author();
            author.study();
        }
    }
}
