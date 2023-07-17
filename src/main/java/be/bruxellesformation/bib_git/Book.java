package be.bruxellesformation.bib_git;

import java.util.Objects;

public class Book {
    private String bookId;
    private String name;
    private String authorName;

    public Book(String bookId, String name, String authorName) {
        this.bookId = bookId;
        this.name = name;
        this.authorName = authorName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookId, book.bookId) && Objects.equals(name, book.name) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, name, authorName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
