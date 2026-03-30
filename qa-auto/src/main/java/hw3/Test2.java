package hw3;

public class Test2 {
    public static void main(String[] args) {
        Library library = new Library();
        library.setBookTitle("Война и мир");
        library.setAuthor("Пушкин");
        library.setCategory("Вау");
        library.setYear(321);
        System.out.println(library.category);
        System.out.println(library.bookTitle);
        System.out.println(library.author);
        System.out.println(library.year);
    }
}
