package youtubeVedioIQ.IterableDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIstClassExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Blueberry");
        fruits.add("Carrot");
        fruits.add("Potato");
        System.out.println(fruits);


        List<String> fruit2= new ArrayList<>();
        fruit2.add("Biniyam");
        fruit2.add("Mekdi");
        fruit2.add("Rediet");
        fruit2.add("Mimi");

        fruit2.addAll(fruits);
        ArrayList<String> fruit3 = new ArrayList<>(fruit2);
        System.out.println(fruit2);
        System.out.println(fruit3);

        List<Integer> firstTenNumbers = new ArrayList<>();
        firstTenNumbers.add(3);
        firstTenNumbers.add(5);
        firstTenNumbers.add(7);
        firstTenNumbers.add(7);
        firstTenNumbers.add(39);

        ArrayList<Integer> number2 = new ArrayList<>();
        number2.addAll(0, firstTenNumbers);
        System.out.println(firstTenNumbers);
        System.out.println(number2);

        number2.get(3);
        number2.set(2, 33);
        System.out.println("number2.size() = " + number2.size());
        System.out.println("number2.isEmpty() = " + number2.isEmpty());
        System.out.println("number2.addAll(number2) = " + number2.addAll(number2));
        System.out.println("number2 = " + number2);

        number2.removeIf((e) -> e>20);
        System.out.println(number2);
        System.out.println("number2.removeAll(firstTenNumbers) = " + number2.removeAll(firstTenNumbers));
        System.out.println(number2);


    }
}
