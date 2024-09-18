import java.util.ArrayList;
import java.util.List;

public class Order {
    int orderNum;
    int sumCost;
    ArrayList<product> products = new ArrayList<product>();
    public Order(int orderNum, int sumCost, ArrayList<product> products) {
        this.orderNum = orderNum;
        this.products = products;
        for (product product : products)
        {
            this.sumCost += product.cost;
        }
    }
    public void getCost(){
        System.out.println(this.sumCost);
    }
}

class product {
    String name;
    int cost;
    public product(String name, int cost) {
        this.cost = cost;
        this.name = name;
    }
}

class Customers {
    String name;
    ArrayList<Order> orders = new ArrayList<Order>();
    public void CreateOrder(int orderNum, ArrayList<product> products){
        int sumCost = 0;
        for (product product : products)
        {
            sumCost += product.cost;
        }
        Order newOrder = new Order(orderNum,sumCost,products);
        orders.add(newOrder);
    }
    public void history(){
        for (Order order : orders){
            System.out.println(order.orderNum);
        }
    }
}
