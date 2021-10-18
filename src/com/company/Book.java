package com.company;

public class Book implements Comparable<Book>{

    private String title;
    private String author;
    private int price;
    private int edition;
    private int isbn;

    public Book() {

    }

    public Book(String title, String author, int price, int edition) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
    }

    public Book(String title, String author, int price, int edition, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getEdition() {
        return edition;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public int hashCode() {
        return price * 12345;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return price == book.price;
    }

    @Override
    public String toString() {
        return "{Book}/" + title + "; " + author + "; " + price + "; " + edition;
    }

    @Override
    protected Object clone() {
        Book newBook = new Book();
        newBook.title = this.title;
        newBook.author = this.author;
        newBook.price = this.price;
        return newBook;
    }

    @Override
    public int compareTo(Book book) {
        return isbn - book.isbn;
    }
}
