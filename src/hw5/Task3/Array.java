package hw5.Task3;

//Написать класс, который умеет хранить в себе массив любых типов данных (int, long, double и т.д.). Generics
//Реализовать в данном классе метод,который возвращает элемент массива по индексу.

public class Array<T> {
    private T[] array;

    public Array(T[] array) {
        this.array = array;
    }

    public T returnElement(int position) {
        return array[position];
    }
}
