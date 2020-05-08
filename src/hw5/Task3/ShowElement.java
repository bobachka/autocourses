package hw5.Task3;

public class ShowElement {
    public static void main(String[] args) {
        Array<Boolean> booleanArray = new Array<Boolean>(ArrayExamples.booleans);
        Array<Byte> bytesArray = new Array<Byte>(ArrayExamples.bytes);
        Array<Short> shortsArray = new Array(ArrayExamples.shorts);
        Array<Integer> intsArray = new Array(ArrayExamples.ints);
        Array<Long> longsArray = new Array(ArrayExamples.longs);
        Array<Float> floatsArray = new Array(ArrayExamples.floats);
        Array<Double> doublesArray = new Array(ArrayExamples.doubles);
        Array<Character> charsArray = new Array(ArrayExamples.chars);
        Array<String> stringsArray = new Array(ArrayExamples.strings);

        System.out.println(booleanArray.returnElement(1));
        System.out.println(bytesArray.returnElement(3));
        System.out.println(shortsArray.returnElement(0));
        System.out.println(intsArray.returnElement(1));
        System.out.println(longsArray.returnElement(3));
        System.out.println(floatsArray.returnElement(2));
        System.out.println(doublesArray.returnElement(0));
        System.out.println(charsArray.returnElement(2));
        System.out.println(stringsArray.returnElement(3));
    }
}
