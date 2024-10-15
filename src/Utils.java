public class Utils {

    public static void printSquare(Square sq){
        System.out.println("Square with side " + sq.getLength() +" has area of " + sq.getArea());
    }

    public static void bookDetails(Book bk){
        System.out.println("Book " + bk.getName() + " (" + bk.getPrice() + " RON), by " + bk.getAuthor().getName()
                + ", published in " + bk.getYear() + ".");
    }
}
