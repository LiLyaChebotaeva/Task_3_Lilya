import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    public String name;
    public float price;
    public int quantity;
}

class Store {
    List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product)
    {
        products.add(product);
    }

    public void remProduct(Product product)
    {
        products.remove(product);
    }

    public List<Product> searchName(String name)
    {
        return products.stream()
                .filter(product -> product.name == name)
                .collect(Collectors.toList());
    }
}




