package com.example;

import java.security.cert.CertSelector;
import java.util.ArrayList;
import java.util.List;

import io.javalin.Javalin;

/**
 * All maven projects have their code stored inside of a src/main/java directory, the reason I also have a "com" package and 
 * inside of that one there is a package called "example" is because the maven project generate names your base package structure after
 * the groupId you set when you set up your project. what this means is that all of your java code is going to, at a minimum , have a 
 * "package com.example" to start off in order to let maven know where the code is when it builds our application
 *
 */
public class App {

    public static List<String> names = new ArrayList<>();
    public static void main( String[] args ){

        names.add("ttaa");
        names.add("weird");
        Javalin app = Javalin.create();
        /*
         * The code below tells Javalin that our web server that is created needs to be able to handle a GET http request that 
         * ends with /hello. Upon our application recieving this request the application shuold return the text "Hello World!" to the 
         * requester
         */
        app.get("/hello", ctx -> ctx.result("Hello world!"));

        // app.get("/person", null);
        
        app.post("/add", ctx -> {//ctx stand for context!
            //we get the name from the http request body and save it to a variable
            String newName = ctx.body();
            //we add the new name into the list of names
            names.add(newName);
            //we tell Javalin we want to return a String message to the requester
           ctx.result("Congrats! You added a new name to the names database");
           //we tell Javalin we want the status code 201 returned in the response
            ctx.status(201);
        });
        
        app.get("/person/{num}", ctx -> {
            // we use the pathParam method to get the value of the num path parameter
            String numAsString = ctx.pathParam("num");
            //since the value is a number, we convert the string into an int
            int num = Integer.parseInt(numAsString);
            //we use our newly converted int to access the index position of the name we want  
            String person = names.get(num);
            //we tell javalin to return the name of the person we got
            ctx.result(person);
            //
            ctx.status(200);
        });
        app.get("/protectedGet/{num}", ctx -> {
            String numAsString = ctx.pathParam("num");
            int num = Integer.parseInt(numAsString);
            try {
                String person = names.get(num);
                ctx.result(person);
                ctx.status(200);
            } catch (IndexOutOfBoundsException e) {
                // TODO: handle exception
                ctx.result("Failed! person out of index!");
                ctx.status(404);
            }
        });
        //use put to update EVERYTHING (Eric to KingKong) completely
        app.put("/replace/{num}", ctx -> {
            // get the index position from the path as a string
            String numAsString = ctx.pathParam("num");
            // convert string index position to an int
            int num = Integer.parseInt(numAsString);
            //get the string value we will be replacing the current data with
            String replacePerson = ctx.body();
            // use the set method to replace the old name with the new name
            names.set(num, replacePerson);
            //tell javalin to give a success message and status code to our client.
            ctx.result("Replace person successfully!");
            ctx.status(200);
        });
        //Just update portion part(Eric to Eric Suminski)
        app.patch("/update/{num}", ctx -> {
            String numAsString = ctx.pathParam("num");
            int num = Integer.parseInt(numAsString);
            String updateInfo = ctx.body();
            names.set(num, updateInfo);
            ctx.result("Successfully updated the person's information");
            ctx.status(200);
        });

        app.delete("/delete", ctx ->{
            names.clear();
            ctx.result("Successfully deleted everything!");
            ctx.status(200);
        });
        app.start();


    }
}
