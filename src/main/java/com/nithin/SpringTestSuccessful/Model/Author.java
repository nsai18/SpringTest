package com.nithin.SpringTestSuccessful.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstname;
    private String longname;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books= new HashSet<>();

    public Author(String firstname, String longname) {
        this.firstname = firstname;
        this.longname = longname;
    }

    public Author(String firstname, String longname, Set<Book> books) {
        this.firstname = firstname;
        this.longname = longname;
        this.books = books;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLongname() {
        return longname;
    }

    public void setLongname(String longname) {
        this.longname = longname;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}

