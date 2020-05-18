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
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AutoDealer {
    public static void main(String[] args) {
        YearValidator yv = new YearValidator();
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Audi", "S 90", 2016, 20000));
        carList.add(new Car("Fiat", "Panda Cross", 2012, 7000));
        carList.add(new Car("Dodge", "Journey Eco+", 2009, 7500));
        carList.add(new Car("Citroen", "Nemo", 2007, 9000));
        carList.add(new Car("GreatWall", "Hover H3 Luxe", 2015, 12000));
        carList.add(new Car("Renault", "Sandero Stepway", 2017, 9000));
        carList.add(new Car("BMW", "X7 xDrive 50i", 2018, 35000));
        carList.add(new Car("Volvo", "X70", 2013, 14000));

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите нужную опцию:\n" +
                    "1. Получить информацию о всех машинах\n" +
                    "2. Добавить машину в список\n" +
                    "3. Получить информацию о машине конкретной марки\n" +
                    "4. Купить машину\n" +
                    "5. Выход из меню");

            int option = 0;
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Введённая опция некорректна. Попробуйте ещё раз.\n");
                continue;
            }

            switch (option) {
                case (1):
                    Menu1.menu1(carList);
                    break;
                case (2):
                    Menu2.menu2(carList);
                    break;
                case (3):
                    Menu3.menu3(carList);
                    break;
                case (4):
                    Menu4.menu4(carList);
                    break;
                case (5):
                    System.out.println("До встречи!\n");
                    return;
                default:
                    System.err.println("Опция не верна. Попробуйте ещё раз.\n");
                    break;
            }
        }
    }
}
