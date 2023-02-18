package org;

import org.entity.Author;
import org.entity.Book;
import java.util.List;

/**
 * Created by Asus on 01.11.2017.
 */
public class Main {

    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();
        String[] names = {"Shevchenko", "Stus", "Symonenko"};

        for (String name : names) {
            Author author = new Author();
            author.setName(name);
            ah.addAuthor(author);
        }

        List<Author> authorList = ah.getAuthorList();

        for (Author author : authorList) {
            System.out.println(author.getId() + " " + author.getName());
        }

        Author author = ah.getAuthorById(2);
        System.out.println(author.getName());


        //----------------------------
        BookHelper bh = new BookHelper();
        String[] books = {"Kobzar", "Krugovert", "Vyno z troyand"};

        for (String b : books) {
            Book book = new Book();
            book.setName(b);
            bh.addBook(book);
        }
        List<Book> bookList = bh.getListBook();
        for (Book book : bookList){
            System.out.println(book.getId() + " " + book.getName());
        }

        Book book = bh.getBookById(5);
        System.out.println(book.getName());
    }
}

