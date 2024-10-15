public class JavaMethods {

    public static void main(String[] args) {
        System.out.println("Hello 2");

        float myFloat = myFirstMethod(50, 70);
        System.out.println(myFloat);
        System.out.println("Number is odd? " + isOddNumber(100));
        printMessage(100);

        drawFullShape(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        drawShapeOutline(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        drawShapeCorneres(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        addNumbers(1, 100);
        addNumbers(500f, 600f);
        addNumbers(105.6, 88.65);

        drawFullShape(Integer.parseInt(args[0]));
        drawShapeOutline(Integer.parseInt(args[0]));
        drawShapeCorneres(Integer.parseInt(args[0]));

        System.out.println("-----------------------------------------------");
        Shape myShape = new Shape();
        myShape.draw();
        myShape.erase();
        myShape.setColor("Green");
        System.out.println("The Shape has color: "+ myShape.getColor());

        System.out.println("-----------------------------------------------");
        Rectangle myRectangle = new Rectangle(4, 5);
        myRectangle.draw();

        System.out.println("-----------------------------------------------");
        Square mySquare = new Square(12);
        mySquare.draw();
        System.out.println("Length " + mySquare.getLength());
        System.out.println("Diagonal is " + mySquare.getDiagonal());

        System.out.println("-----------------------------------------------");
        Shape myShape1 = new Square();
        Shape myShape2 = new Triangle();
        Shape myShape3 = new Rectangle();
        Shape myShape4 = new Circle();

        System.out.println("-----------------------------------------------");
        myShape1.draw();
        myShape2.draw();
        myShape3.draw();
        myShape4.draw();

        System.out.println("-----------------------------------------------");
        Person teacher1 = new Teacher("UPB");
        teacher1.setName("Alex");
        teacher1.setSurname("G");
        teacher1.eat();
        ((Teacher)teacher1).teachCourse();

        System.out.println("-----------------------------------------------");
        Person student1 = new Student();
        student1.setName("Andrei");
        student1.setSurname("Studentila");
        student1.eat();
        ((Student)student1).takeExam();

        System.out.println("-----------------------------------------------");
        if(student1.getName() == null){
            throw new IllegalArgumentException("No name for the student");
        }

        try{
            myExceptionMethod();
        }catch (IllegalArgumentException | MyException ex){
            System.out.println("Ooppsss an exception " + ex.getMessage());
        }
        catch (Exception ex){
            System.out.println("Generic exception");
        }

        try {
            int argument = Integer.parseInt(args[2]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Not enough params provided");
        }catch (NumberFormatException ex){
            System.out.println("Input is not a integer");
        }catch (Exception ex){
            System.out.println("Generic exception");
        }finally {
            System.out.println("This line will always execute");
        }
    }

    public static void myExceptionMethod() throws MyException {
        Student s1 = new Student();

        if(s1.getName() == null){
            //throw new IllegalArgumentException("Exception: No name for the student");
            throw new MyException("Exception: No name for the student");
        }
    }

    private static void drawShapeCorneres(int width) {
        drawShapeCorneres(width,width);
    }

    private static void drawShapeOutline(int width) {
        drawShapeOutline(width, width);
    }

    private static void drawFullShape(int width) {
        drawFullShape(width, width);
    }
    private static void addNumbers(int i, int j) {
        System.out.println("Adding 2 int numbers with sum " +(i+j));
    }
    private static void addNumbers(float i, float j) {
        System.out.println("Adding 2 float numbers with sum " +(i+j));
    }
    private static void addNumbers(Double i, Double j) {
        System.out.println("Adding 2 Double numbers with sum " +(i+j));
    }

    private static void drawShapeCorneres(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(i == 0 && j == 0 || i == 0 && j == width - 1 || j == 0 && i == height - 1 || j == width -1 && i == height - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void drawShapeOutline(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(i == 0 || i == height - 1 || j == 0 || j == width -1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void drawFullShape(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static float myFirstMethod(float input1, float input2){
        return input1+input2;
    }

    public static boolean isOddNumber(int input1){
        return input1 % 2 != 0;
    }

    public static void printMessage(int number){
        /*
        if(isOddNumber(number)){
            System.out.println("Number " + number + " is odd");
        }else{
            System.out.println("Number " + number + " is even");
        }
         */

        String type = isOddNumber(number) ? "odd" : "even";
        System.out.println("Number " + number + " is " + type + " !");

    }
}
