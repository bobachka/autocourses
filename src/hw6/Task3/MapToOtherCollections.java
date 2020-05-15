package hw6.Task3;

//Создайте карту (Map), заполните ее элементами (ключ + значение), запишите все ключи в одну коллекцию, а значения в другую, организуйте вывод.
//Используйте соответствующую коллекцию для хранения ключей, которые являются уникальными.

import java.util.*;

public class MapToOtherCollections {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "cat");
        map.put(2, "dog");
        map.put(3, "rabbit");
        map.put(4, "tiger");
        map.put(5, "mouse");
        map.put(6, "cat");
        map.put(9, "pony");

        Set<Integer> collectionForKeys = new HashSet<>();
        List<String> collectionForValues = new ArrayList<>();

        collectionForKeys.addAll(map.keySet());
        System.out.println(collectionForKeys);

        collectionForValues.addAll(map.values());
        System.out.println(collectionForValues);
    }
}
