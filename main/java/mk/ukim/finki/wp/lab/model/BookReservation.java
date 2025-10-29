package mk.ukim.finki.wp.lab.model;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BookReservation {
   private String bookTitle;
    private String readerName;
    private String readerAddress;
    private long numberOfCopies;

    public BookReservation(String bookTitle, String readerName, String readerAddress, Long numberOfCopies) {
        this.bookTitle = bookTitle;
        this.readerName = readerName;
        this.readerAddress = readerAddress;
        this.numberOfCopies = numberOfCopies;
    }

    public String getBookTitle() { return bookTitle; }
    public String getReaderName() { return readerName; }
    public String getReaderAddress() { return readerAddress; }
    public long getNumberOfCopies() { return numberOfCopies; }
}

