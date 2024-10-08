public class Hello {

    public static void main(String[] args) {

        int myFirstVariable = 100;
        int mySecondVariable = 0;
        final int MAX_SIZE = 10;

        System.out.println("Hello world!");

        System.out.println("Second variable value is " + mySecondVariable);

        System.out.println(args[0] + args[1]);

        int operandLeft = Integer.parseInt(args[0]);
        int operandRight = Integer.parseInt(args[1]);
        System.out.println(operandLeft + operandRight);

        String currentDay = "Monday";

        switch (currentDay){
            case "Monday":{
                System.out.println("Noo Monday");
                break;
            }
            case "Friday":{
                System.out.println("Yeee Friday");
                break;
            }
            default:{
                System.out.println("Meah");
            }
        }

        int currentNumber = 1;
        while(currentNumber <= MAX_SIZE){
            System.out.println("Current number is "+currentNumber);
            currentNumber++;
        }

        currentNumber = 1;
        do{
            System.out.println("Current number is "+currentNumber);
            currentNumber++;
        }while(currentNumber <= MAX_SIZE);

        for(int i = 1; i <= MAX_SIZE; i++){
            System.out.println("Current number is "+i);
        }

        for(String arg : args){
            System.out.println(arg);
        }
/*
        for(int i = 2; i<= 1000000; i++){
            boolean isPrime = true;
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Number " + i + " is prime.");
            }
        }
 */
        //Calculate the sum of the first 100 numbers higher than 0. Name the class (and java file) SumOfNumbers.
        int sum=0;
        for(int i = 1; i<=100; i++){
            sum +=i;
        }
        System.out.println(sum);
        //Display the number of days in month February from a year between 1900-2016 that is read from keyboard
        int year = Integer.parseInt(args[2]);
        if(year % 4 == 0 && year% 100 != 0){
            System.out.println("February has 29 days in the year " + year);
        }else if(year % 100 != 0 && year % 400 == 0){
            System.out.println("February has 29 days in the year " + year);
        }else{
            System.out.println("February has 28 days in the year " + year);
        }

    }
}
