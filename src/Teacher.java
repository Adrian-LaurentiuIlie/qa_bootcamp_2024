import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Setter @Getter
public class Teacher extends Person{

    private String job;

    public void teachCourse(){
        System.out.println("Teaching at " + this.job);
    }
}
