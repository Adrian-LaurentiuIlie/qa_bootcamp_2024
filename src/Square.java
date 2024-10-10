import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class Square {

    public double squareSide;

    public void setSide(double side){
        squareSide = side;
    }

    public double getArea(){
//        return squareSide * squareSide;
        return Math.pow(squareSide, 2);
    }

    public void printCurrentSquare(){
        System.out.println("Square with side " + squareSide +" has area of " + getArea());
    }

}
