package com.example.controller;

import com.example.entity.Book;
import com.example.entity.BookType;

import java.util.List;
import java.util.Scanner;

public class BookController {
    private List<Book> books;
    private int nextIndex;

    public BookController(List<Book> books, int nextIndex) {
        this.books = books;
        this.nextIndex = nextIndex;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getNextIndex() {
        return nextIndex;
    }

    public void setNextIndex(int nextIndex) {
        this.nextIndex = nextIndex;
    }

    public void CreateBook(Book book) {
        book.setId(this.nextIndex);
        this.books.add(book);
        this.nextIndex++;
    }

    public void PrintAllBooks() {
        System.out.println("Danh Sach Sach Hien Co La: ");
        for (Book book : this.books) {
            System.out.println(book);
        }
    }

    public void PrintBook(int id) {
        System.out.println("Thong Tin Sach La: ");
        for (Book book : this.books) {
            if (book.getId() == id) {
                System.out.println(book);
            }
        }
    }

    public void UpdateBookById(int id, Book book){
        for (Book value : this.books) {
            if (value.getId() == id) {
                value.setAuthor(book.getAuthor());
                value.setName(book.getName());
                value.setPrice(book.getPrice());
                value.setType(book.getType());
                break;
            }
        }
    }

    public void DeleteBookById(int id){
        for (Book value : this.books) {
            if (value.getId() == id){
                this.books.remove(value);
                break;
            }
        }
    }

    public Book InputBookInfoFromKeyboard(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        System.out.print("Input author: ");
        String author = scanner.nextLine();
        System.out.print("Input price: ");
        double price = scanner.nextDouble();
        System.out.print("Input type (1 - Van hoc, 2 - Giao khoa, 3 - Tham khao, 4 - Truyen tranh): ");
        int type = scanner.nextInt();
        BookType manualType;
        switch (type){
            case 1:
                manualType = BookType.VAN_HOC;
                break;
            case 2:
                manualType = BookType.GIAO_KHOA;
                break;
            case 3:
                manualType = BookType.THAM_KHAO;
                break;
            case 4:
                manualType = BookType.TRUYEN_TRANH;
                break;
            default:
                manualType = BookType.UNKNOWN;
                break;
        }
        Book book = new Book(name,author,price,manualType);
        return book;
    }


}
