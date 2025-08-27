import java.util.ArrayList;
import java.util.List;

class SearchEngine {
    // Теперь используем список для результатов поиска
    private List<Searchable> results = new ArrayList<>();

    // Метод поиска всех соответствий (возвращает весь список подходящих результатов)
    public List<Searchable> findAllMatches(List<? extends Searchable> items, String query) {
        results.clear(); // очищаем предыдущий результат
        for (Searchable item : items) {
            if (item.contains(query)) {
                results.add(item); // добавляем все подходящие элементы
            }
        }
        return results;
    }
}

abstract class Searchable {
    abstract boolean contains(String query);
    abstract String getTitle();
}

class Book extends Searchable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public boolean contains(String query) {
        return title.toLowerCase().contains(query.toLowerCase());
    }

    @Override
    public String getTitle() {
        return title;
    }
}