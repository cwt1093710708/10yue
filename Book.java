package com.classbook.chapter.six;
public class Book {
    private String bookId;
    private String bookName;
    protected int pages;

    public Book() {
    }

    public Book(String bookId, String bookName, int pages) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.pages = pages;
    }

    public String getBookId() {
        return DefaultValue.BOOK_SKU + bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
