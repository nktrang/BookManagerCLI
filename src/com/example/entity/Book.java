package com.example.entity;
//code tiep
public class Book {
    private int id;
    private String name;
    private String author;
    private double price;
    private BookType type;

    public Book(String name, String author, double price, BookType type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public Book(int id, String name, String author, double price, BookType type) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}';
    }
}
