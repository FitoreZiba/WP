package mk.ukim.finki.wp.lab2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookReservation {
    private String bookTitle;
    private String readerName;
    private String readerAddress;
    private int numberOfCopies;

    public BookReservation(String bookTitle, String readerName, String readerAddress, int numberOfCopies) {
        this.bookTitle = bookTitle;
        this.readerName = readerName;
        this.readerAddress = readerAddress;
        this.numberOfCopies = numberOfCopies;
    }


}
