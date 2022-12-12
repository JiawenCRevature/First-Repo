package com.example;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.javalin.Javalin;

public class Library {
    public static Logger logger = LoggerFactory.getLogger(Library.class);
        
    
    /*
     * notice I did not add an access modifier: this means the variable is given the default access modifier, which means any code within
     * the current package can use it. 
     * Protected similar to default but class who extends protected class will also have access to protected.
     */
    static List<Book> library = new ArrayList<>();
    public static void main(String[] args) {
        logger.trace("This log was create at the trace level");
        logger.debug("this log was created at the debug level");
        logger.info("Application starting");
        logger.warn("this log was created at the warn level");
        logger.error("this log was created at the error level");
     
        Book startingBook = new Book();
        startingBook.setTitle("The Fellowship of the Ring");
        startingBook.setAuthor("J.R.R. Tolken");
        startingBook.setGenre("Fantasy");
        startingBook.setIsbn(123456789);

        library.add(startingBook);
        Javalin app = Javalin.create();
        app.get("/book/{index}", ctx ->{
            /*
             * here you can see I don't Have to make the string variable first, I can pass the results of the pathparam method directly
             * into the parseInt method
             */
            int index = Integer.parseInt(ctx.pathParam("index"));
            //we get the book
            Book book = library.get(index);
            //we let
            ctx.json(book);
            ctx.status(200);
        });

        app.post("/book", ctx -> {
            // convert the book json in the http request body into a Java Book Object
            Book newBook = ctx.bodyAsClass(Book.class);//class mean tell java this is a class Book object
            //add the new book into the library
            library.add(newBook);
            //tell Javalin to return a success message.
            ctx.result("Book add to the library");
            ctx.status(201);
        });

        app.patch("/book/{index}", ctx -> {
            int num = Integer.parseInt(ctx.pathParam("index"));
            Book updateBook = ctx.bodyAsClass(Book.class);
            library.get(num).setAuthor(updateBook.getAuthor());
            /*library.get(num) return the book that you want to update by look for index of book in library
             * setAuthor allow this returned book to set to a new author which from updated book's author(getAuthor())
             * which you need to update it by change it in json.
            */
            library.get(num).setTitle(updateBook.getTitle());
            library.get(num).setGenre(updateBook.getGenre());
            //since isbn numbers be unique accross books I will not write code to edit it.
            ctx.json(library.get(num));
            ctx.status(200);
        });

        app.put("/book/{index}", ctx -> {
            int index = Integer.parseInt(ctx.pathParam("index"));
            Book newBook = ctx.bodyAsClass(Book.class);
            library.set(index, newBook);
            ctx.json(library.get(index));
            ctx.status(200);
        });

        app.delete("/book/{index}", ctx -> {
            int index = Integer.parseInt(ctx.pathParam("index"));
            library.remove(index);
            ctx.result("Success!");
            ctx.status(200);
        });
        app.start();

    }
}
