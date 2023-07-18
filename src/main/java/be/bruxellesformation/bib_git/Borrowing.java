package be.bruxellesformation.bib_git;

import java.time.LocalDateTime;
import java.util.Objects;

public class Borrowing {
    private User user;
    private Book book;
    private LocalDateTime checkOut;
    private LocalDateTime checkIn;

    public Borrowing(User user, Book book, LocalDateTime checkOut) {
        this.user = user;
        this.book = book;
        this.checkOut = checkOut;
    }

    //region getters, setters, hashCode, equals, toString
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        //checkOut must be later than checkIn
        this.checkOut = checkOut;
    }

    public LocalDateTime getCheckin() {
        return checkIn;
    }

    public void setCheckin(LocalDateTime checkin) {
        this.checkIn = checkin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Borrowing borrowing = (Borrowing) o;
        return Objects.equals(user, borrowing.user) && Objects.equals(book, borrowing.book) && Objects.equals(checkOut, borrowing.checkOut) && Objects.equals(checkIn, borrowing.checkIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, book, checkOut, checkIn);
    }

    @Override
    public String toString() {
        return user + " borrowed: \t|" + book + "\t\t\t |" + checkOut + "\t|" + checkIn;
    }
    //endregion

}