package mk.ukim.finki.wp.lab.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Data
public class Book {
    String title;
    String genre;
    double averageRating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setRating(Double rating) {
        this.averageRating = rating;
    }

}
