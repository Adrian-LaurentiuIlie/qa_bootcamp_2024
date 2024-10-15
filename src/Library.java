public class Library {
    public static void main(String[] args) {

        Author author1 = new Author("Adrian Ilie","adrianIlie@email.com");
        Book book1 = new Book("Cum Sa Treci De Facultate",2024,author1, 15.35);
        Utils.bookDetails(book1);

    }
}
