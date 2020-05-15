package hw6.Task4;

//Напишите программу, эмулирующую работу автосалона:
//- есть определенное количество машин разных марок и моделей, выставленных на продажу.
//- в автосалон поступают машины на продажу, а также уезжают уже проданные автомобили.
//- в автосалон обращаются клиенты для получения информации о машинах.
//Программа должна содержать пользовательское меню с пунктами:
//- «добавить машину»,
//- «получить информацию по машине»,
//- «купить»,
//- «получить весь список машин».
//Все возможные исключительные ситуации в программе должны быть правильно обработаны, и на экран должно выводиться понятное сообщение об ошибке.

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class AutoDealer {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Audi", "S 90", 2016, 20000));
        carList.add(new Car("Fiat", "Panda Cross", 2012, 7000));
        carList.add(new Car("Dodge", "Journey Eco+", 2009, 7500));
        carList.add(new Car("Citroen", "Nemo", 2007, 9000));
        carList.add(new Car("GreatWall", "Hover H3 Luxe", 2015, 12000));
        carList.add(new Car("Renault", "Sandero Stepway", 2017, 9000));
        carList.add(new Car("BMW", "X7 xDrive 50i", 2018, 35000));
        carList.add(new Car("Volvo", "X70", 2013, 14000));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите нужную опцию:\n" +
                    "1. Получить информацию о всех машинах\n" +
                    "2. Добавить машину в список\n" +
                    "3. Получить информацию о машине конкретной марки\n" +
                    "4. Купить машину\n" +
                    "5. Выход из меню");

            int option = 0;
            try {
                option = scanner.nextInt();
            } catch (Exception e) {
                System.err.println("Введённая опция некорректна. Попробуйте ещё раз.");
                return;
            }

            switch (option) {
                case (1):
                    for (Car c : carList) {
                        System.out.println(c.toString() + "\n");
                    }
                    break;
                case (2):
                    System.out.print("Введите марку автомобиля: ");
                    String manufacturer = scanner.next();
                    System.out.print("Введите модель автомобиля: ");
                    String model = scanner.next();
                    System.out.print("Введите год выпуска автомобиля: ");
                    int year = scanner.nextInt();
                    System.out.print("Введите цену автомобиля: ");
                    int price = scanner.nextInt();

                    Car newCar = new Car(manufacturer, model, year, price);
                    carList.add(newCar);

                    System.out.printf("Автомобиль %s %s %d года стоимостью %d добавлен!\n\n",
                            newCar.getManufacturer(), newCar.getModel(), newCar.getYear(), newCar.getPrice());

                    break;
                case (3):
                    System.out.print("Введите марку автомобиля: ");
                    String maker = scanner.next();

                    boolean isPresent = false;

                    for (Car c : carList) {
                        if (c.getManufacturer().equalsIgnoreCase(maker)) {
                            System.out.println(c.toString() + "\n");
                            isPresent = true;
                        }
                    }

                    if (!isPresent) {
                        System.out.println("Данная марка не представлена в нашем салоне.\n");
                    }

                    break;
                case (4):
                    System.out.print("Введите марку автомобиля, который вы хотите купить: ");
                    String make = scanner.next();

                    boolean isBought = false;
                    ListIterator<Car> litr = carList.listIterator();

                    while (litr.hasNext()) {
                        Car c = litr.next();

                        if (c.getManufacturer().equalsIgnoreCase(make)) {
                            System.out.printf("Вы купили ааааавтомобиль %s %s %d года выпуска за %d денег! Ура!\n\n",
                                    c.getManufacturer(), c.getModel(), c.getYear(), c.getPrice());
                            isBought = true;

                            litr.remove();
                        }
                    }

                    if (!isBought) {
                        System.out.println("Данная марка не представлена в нашем салоне.\n");
                    }


                    break;
                case (5):
                    System.out.println("До встречи!\n");
                    return;
                default:
                    System.out.println("Опция не верна. Попробуйте ещё раз.\n");
                    break;

            }

        }

    }
}
