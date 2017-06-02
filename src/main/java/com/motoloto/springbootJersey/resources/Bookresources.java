package com.motoloto.springbootJersey.resources;

import com.motoloto.springbootJersey.model.Book;
import com.motoloto.springbootJersey.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.Collection;

/**
 * Created by motoloto on 2017/6/2.
 */
@Component
@Path("/books")
public class Bookresources {

    @Autowired
    private BookService bookService;

    public Bookresources() {
    }
    @GET
    @Produces("application/json")
    public Collection getAllBooks() {
        return bookService.getAllBooks();
    }
    @GET
    @Produces("application/json")
    @Path("/{oid}")
    public Book getBook(@PathParam("oid") Integer oid) {
        return bookService.getBook(oid);
    }
    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response addBook(Book book) {
        bookService.addBook(book);
        return Response.created(URI.create("/" + book.getId())).build();
    }
    @PUT
    @Consumes("application/json")
    @Path("/{oid}")
    public Response updateBook(@PathParam("oid") String oid, Book book) {
        bookService.updateBook(oid, book);
        return Response.noContent().build();
    }
    @DELETE
    @Path("/{oid}")
    public Response deleteBook(@PathParam("oid") String oid) {
        bookService.deleteBook(oid);
        return Response.ok().build();
    }
}
