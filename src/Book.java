import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
public class Book {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private int year;
    @Getter @Setter
    private Author author;
    @Getter @Setter
    private double price;

}
