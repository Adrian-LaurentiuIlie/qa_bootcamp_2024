import lombok.Getter;
import lombok.Setter;

public class Car {

    @Getter @Setter
    private String model;
    @Getter @Setter
    private String color;
    @Getter @Setter
    private String type;
    private final double MAX_SPEED = 180.0;
    @Getter @Setter
    private double currentSpeed;
    private float cilinderCapacity;
    private float currentMilage;
    private double carPosition; //Compared to magnetic north
    private final int MAX_GEAR = 6;
    private int currentGear;

    public Car() {
    }

    public Car(String model, String color, String type, float cilinderCapacity, double carPosition) {
        this.model = model;
        this.color = color;
        this.type = type;
        this.cilinderCapacity = cilinderCapacity;
        this.carPosition = carPosition;
    }

    public Car(String model, String color, String type, double currentSpeed, float cilinderCapacity, float currentMilage, double carPosition, int currentGear) {
        this.model = model;
        this.color = color;
        this.type = type;
        this.currentSpeed = currentSpeed;
        this.cilinderCapacity = cilinderCapacity;
        this.currentMilage = currentMilage;
        this.carPosition = carPosition;
        this.currentGear = currentGear;
    }

    public void startCar(){
        currentGear = 1;
        currentSpeed = 5;
    }

    public void steerLeft(float angle){
        carPosition -= angle;
    }

    public void steerRight(float angle){
        carPosition += angle;
    }

    public void stopCar(){
        currentGear = 0;
        currentSpeed = 0;
    }

    public void increaseMileage(float mileage){
        currentMilage += mileage;
    }

    public void accelerate(double speedDelta){
        if(currentSpeed + speedDelta > MAX_SPEED){
            currentSpeed = MAX_SPEED;
        }else{
            currentSpeed += speedDelta;
        }
    }

    public void decelerate(double speedDelta){
        if(currentSpeed - speedDelta < 0){
            currentSpeed = 0;
        }else{
            currentSpeed -= speedDelta;
        }
    }

    public void gearUp(){
        if(currentGear < MAX_GEAR){
            currentGear++;
        }
    }

    public void gearDown(){
        if(currentGear > 0){
            currentGear--;
        }

    }

    public void printCar(){
        System.out.println("-----------------------------");
        System.out.println("Car model: " + model);
        System.out.println("Car color: " + color);
        System.out.println("Car type: " + type);
        System.out.println("Car position: " + carPosition);
        System.out.println("Car milage: " + currentMilage);
        System.out.println("Car gear: " + currentGear);
        System.out.println("Car speed: " + currentSpeed);

    }

    public void setSpeed(double currentSpeed){
        if(currentSpeed > MAX_SPEED ){
            System.out.println("Invalide!!!!!");
        }else{
            this.currentSpeed = currentSpeed;
        }
    }

}
