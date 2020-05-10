package hw5.Task2;

//Используя enum, реализуйте метод, который должен возвращать позицию буквы в алфавите.
//Например, А – 1, B – 2 и т.д.

public class Position {
    public static void main(String[] args) {
        Alphabet letter = Alphabet.Z;
        System.out.println(getLetterPosition(letter));
    }

    public static int getLetterPosition(Alphabet a){
        return (a.ordinal()+1);
    }


}



