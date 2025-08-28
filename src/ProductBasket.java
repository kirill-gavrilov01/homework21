import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class productBasket {
    private List<Product> products = new ArrayList<>();

    // Метод добавляет продукт в корзину
    void addProduct(Product product) {
        products.add(product);
    }

    // Метод печати содержимого корзины
    void printBasket() {
        for(Product product : products) {
            System.out.println(product.getName());
        }
    }

    // Метод удаления продуктов по имени
    List<Product> removeProductsByName(String name) {
        List<Product> removedProducts = new ArrayList<>();
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product currentProduct = iterator.next();
            if (currentProduct.getName().equals(name)) {
                removedProducts.add(currentProduct); // собираем удалённые продукты
                iterator.remove();                   // удаляем из корзины
            }
        }
        return removedProducts;
    }

    // Дополнительно: очистка корзины
    void clearBasket() {
        products.clear();
    }
}
class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


