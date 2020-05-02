package hw4.task2;

//Фигуры можно добавлять в контейнер до тех пор, пока там хватает места (считаем только объем фигуры).
//Если места не хватает, метод добавления новой фигуры должен вернуть false, и программа должна
//сообщить пользователю, что добавление новой фигуры невозможно.

public class Packaging {
    public static void main(String[] args) {
        Box box = new Box(150);
        Cylinder cylinder = new Cylinder(4, 6);
        Ball ball = new Ball(3);
        Pyramid pyramid = new Pyramid(3, 5);
        Pyramid pyramid1 = new Pyramid(6, 10);

        box.addShape(cylinder);
        box.addShape(ball);
        box.addShape(pyramid);
        box.addShape(pyramid1);

    }
}