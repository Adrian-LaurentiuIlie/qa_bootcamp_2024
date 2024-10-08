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
