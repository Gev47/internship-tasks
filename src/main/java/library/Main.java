package library;

public class Main {
    public static void main (String[] args) {
        Library library = new Library();
        library.addBook("Core Java");
        library.addBook("Java 8");
        library.addBook("Spring Boot");
        library.addBook("Spring MVC");

        library.getAllBooks().forEach(System.out::println);

        System.out.println(library.getBookInfoById(2));
        System.out.println(library.getBookInfoById(3));
        System.out.println(library.getBookInfoById(4));

        System.out.println(library.removeBook(2));
        System.out.println(library.removeBook(99));


        System.out.println(library.getBookInfoById(2));
        library.getAllBooks().forEach(System.out::println);
    }
}