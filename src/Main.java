import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SearchEngine engine = new SearchEngine();

        // Набор книг для поиска
        List<Book> books = new ArrayList<>();
        books.add(new Book("Гарри Поттер и философский камень"));
        books.add(new Book("Анна Каренина"));
        books.add(new Book("Война и мир"));
        books.add(new Book("Гарри Поттер и узник Азкабана"));
        books.add(new Book("Граф Монте-Кристо"));
        books.add(new Book("Двенадцать стульев"));
        books.add(new Book("Гарри Поттер и Дары Смерти"));

        // Поиск всех книг, содержащих слово "Гарри"
        List<Searchable> results = engine.findAllMatches(books, "Гарри");

        // Выводим все подходящие результаты
        System.out.println("Книги, содержащие " + "Гарри ");
        for (Searchable book : results) {
            System.out.println(book.getTitle());
        }
    }
}