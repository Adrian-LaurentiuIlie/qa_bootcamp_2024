import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
public class Author {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String email;

}
