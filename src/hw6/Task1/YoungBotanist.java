package hw6.Task1;

//Написать программу «молодого ботаника».
//Программа должна рассказывать людям о типах растений, существующих в природе, и их примерах.
//Для хранения типов растений и примеров необходимо использовать Map, которая хранит пары типа «ключ:значение».
//Например, в роли ключа может выступать «арбуз», а в роли значения – «ягода».
//Реализовать метод, выводящий все типы растений с примерами.
//Реализовать метод, который выводит тип конкретного растения, переданного ему в качестве параметра (например, что арбуз – это ягода).

import java.util.HashMap;
import java.util.Map;

public class YoungBotanist {
    public static void main(String[] args) {
        Map<String, String> giftsOfNature = new HashMap<>();

        giftsOfNature.put("berry", "watermelon");
        giftsOfNature.put("tree", "birch");
        giftsOfNature.put("bush", "juniper");
        giftsOfNature.put("veggie", "cucumber");
        giftsOfNature.put("fruit", "apple");
        giftsOfNature.put("grass", "sedge");
        giftsOfNature.put("cereal", "wheat");

        printAll(giftsOfNature);
        printNeededOne("cereals", giftsOfNature);

    }

    private static void printAll(Map<String, String> map) {

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("There is a %s in the list. And it's a %s.\n", value, key);
        }
    }

    private static void printNeededOne(String neededOne, Map<String, String> map) {
        if (map.containsKey(neededOne)) {
            System.out.printf("The %s is a %s", map.get(neededOne), neededOne);
        } else {
            System.out.println("There is not such key in the table. Please try again.");
        }
    }
}
