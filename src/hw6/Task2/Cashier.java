package hw6.Task2;

//Реализовать программу, эмулирующую работу одной кассы в магазине.
//В кассе есть очередь из покупателей.
//У каждого покупателя есть список продуктов, которые нужно пробить и выдать цену.
//Затем, покупателя нужно рассчитать.
//Для хранения покупателей использовать Queue.

import java.util.*;
import java.lang.Comparable;

public class Cashier {
    public static void main(String[] args) {

        Map<String, Integer> pricelist = new HashMap<>();
        pricelist.put("beer", 5);
        pricelist.put("juice", 15);
        pricelist.put("bread", 2);
        pricelist.put("meat", 9);
        pricelist.put("milk", 2);
        pricelist.put("eggs", 1);
        pricelist.put("cheese", 7);
        pricelist.put("apples", 3);
        pricelist.put("tomatoes", 2);
        pricelist.put("fish", 8);

        Customer customer1 = new Customer("Sasha", new ArrayList<String>(Arrays.asList("beer", "fish")));
        Customer customer2 = new Customer("Svieta", new ArrayList<String>(Arrays.asList("bread", "juice", "tomatoes", "meat", "eggs")));
        Customer customer3 = new Customer("Lena", new ArrayList<String>(Arrays.asList("beer", "meat", "eggs")));
        Customer customer4 = new Customer("Nata", new ArrayList<String>(Arrays.asList("cheese", "apples", "juice")));
        Customer customer5 = new Customer("Jura", new ArrayList<String>(Arrays.asList("apples", "milk")));
        Customer customer6 = new Customer("Stepan", new ArrayList<String>(Arrays.asList("fish", "bread", "milk", "eggs")));

        Queue<Customer> queue = new PriorityQueue<>();
        queue.add(customer1);
        queue.add(customer2);
        queue.add(customer3);
        queue.add(customer4);
        queue.add(customer5);
        queue.add(customer6);

        System.out.println(queue.isEmpty());

        while (!queue.isEmpty()) {
            Customer customer = queue.poll();
            int sum = 0;
            for (String product : customer.getPurchases()) {
                sum += pricelist.get(product);
            }
            System.out.printf("%s, the total price of your purchases is %d.\n", customer.getName(), sum);
            customer.cleanPurchases();
        }

        System.out.println(queue.isEmpty());
    }
}