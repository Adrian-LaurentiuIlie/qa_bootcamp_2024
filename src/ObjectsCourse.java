public class ObjectsCourse {
    public static void main(String[] args) {
        Car dacia1300 = new Car("sedan", "red", "dacia 1300", 1300 ,45 );
        Car vwPassat = new Car();

        dacia1300.printCar();

        dacia1300.startCar();
        dacia1300.accelerate(20);
        dacia1300.gearUp();
        dacia1300.steerRight(45);
        dacia1300.increaseMileage(5);
        dacia1300.stopCar();

        dacia1300.setSpeed(5000);
        System.out.println(dacia1300.getCurrentSpeed());

        dacia1300.printCar();

        Square squareAbcd = new Square();
        squareAbcd.setSide(5.0);
        squareAbcd.printCurrentSquare();

        for(String value : args){
            Square cmdSqare = new Square();
            cmdSqare.setSide(Double.parseDouble(value));
            //cmdSqare.printCurrentSquare();
            Utils.printSquare(cmdSqare);
        }

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area is " + rectangle.getArea());
        System.out.println("Diagonal is " + rectangle.getDiagonal());
        System.out.println("Parameter is " + rectangle.getParameter());
    }
}
