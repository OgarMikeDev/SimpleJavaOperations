import java.util.ArrayList;
import java.util.Collections;

public class MainFour {
    public static void main(String[] args) {
        /*
        Написать функцию, которая принимает список целых, заполненный случайными числами. Функция формирует и возвращает новый список, содержащий:
        1) Минимальный элемент
        2) Максимальный элемент
        3) Число отрицательных элементов
        4) Число положительных элементов
        5) Число нулей
         */

        ArrayList<Integer> listFirst = new ArrayList<>();
        int countZeros = 0;
        int countNegativeNumbers = 0;
        int countPositiveNumbers = 0;

        for (int i = 0; i < (int) (10 + Math.round(Math.random() * 10)); i++) {
            listFirst.add((int) (-5 + Math.round(Math.random() * 10)));
            if (listFirst.get(i) == 0) {
                countZeros++;
            }

            if (listFirst.get(i) > 0) {
                countPositiveNumbers++;
            }

            if (listFirst.get(i) < 0) {
                countNegativeNumbers++;
            }
        }

        System.out.print("Fist list: ");
        listFirst.forEach(System.out::print);

        System.out.println("\nMin value: " + Collections.min(listFirst));
        System.out.println("Max value: " + Collections.max(listFirst));
        System.out.println("Count zeros: " + countZeros);
        System.out.println("Count positive numbers: " + countPositiveNumbers);
        System.out.println("Count negative numbers: " + countNegativeNumbers);
    }
}
