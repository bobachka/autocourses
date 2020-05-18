package hw6.Task2;

import java.util.List;

public class Customer implements Comparable{
    private String name;
    private List<String> purchases;

    public Customer(String name, List<String> purchases) {
        this.name = name;
        this.purchases = purchases;
    }

    public String getName() {
        return name;
    }

    public List<String> getPurchases() {
        return purchases;
    }

    public void cleanPurchases() {
        purchases.clear();
        System.out.println("Shopping is done!\n");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
