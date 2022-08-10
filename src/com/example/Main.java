package com.example;

import com.example.controller.BookController;
import com.example.entity.Book;
import com.example.entity.BookType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StartCMD();
    }
    public static void StartCMD(){
        boolean isEnd = false;
        List<Book> books = new ArrayList<>();
        BookController bookController = new BookController(books,0);
        while (isEnd == false) {
            System.out.println("====");
            System.out.println("BOOK STORE MANAGE PROGRAM");
            System.out.println("====================================================");
            System.out.println("1. Create new book to store.");
            System.out.println("2. Print out all books in store");
            System.out.println("3. Update book information by id");
            System.out.println("====================================================");
            System.out.print("Input your command: ");
            Scanner scanner = new Scanner(System.in);
            int cmd = scanner.nextInt();
            System.out.println("====================================================");
            switch (cmd){
                case 1:
                    Book book = bookController.InputBookInfoFromKeyboard();
                    bookController.CreateBook(book);
                    break;
                case 2:
                    bookController.PrintAllBooks();
                    break;
                case 3:
                    System.out.print("Input id to update: ");
                    int id = scanner.nextInt();
                    Book updatedBook = bookController.InputBookInfoFromKeyboard();
                    bookController.UpdateBookById(id,updatedBook);
                    break;
                default:
                    isEnd = true;
                    System.out.println("Goodbye, my friend.");
                    break;
            }
            System.out.println("====================================================");
        }

    }
}
