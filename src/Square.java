import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Square extends Rectangle{


    public Square(double side){
        super(side, side);
    }

    public double getArea(){
        return super.getArea();
    }

    public void printCurrentSquare(){
        System.out.println("Square with side " + getLength() +" has area of " + getArea());
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square");
        //super.draw();
    }
    @Override
    public String toString(){
        return "My Square has 4 sides each " + this.getLength();
    }

    public void setSide(double v) {
        super.setLength(v);
        super.setWidth(v);
    }
}
