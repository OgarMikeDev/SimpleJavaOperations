import java.util.ArrayList;

public class MainTwo {
    public static void main(String[] args) {
        /*
        Обработать код, который получает два списка целых,
        заполненных случайными числами.
        Код формирует и возвращает новый список,
        содержащий элементы обоих списков без повторений.
         */

        ArrayList<Integer> listFirst = new ArrayList<>();
        ArrayList<Integer> listSecond = new ArrayList<>();
        ArrayList<Integer> listThird = new ArrayList<>();

        for (int i = 0; i < (int) (5 + Math.round(Math.random() * 5)); i++) {
            listFirst.add((int) (1 + Math.round(Math.random() * 5)));
            listSecond.add((int) (1 + Math.round(Math.random() * 5)));

            if (listFirst.contains(listSecond.get(i)) &&
                    !listThird.contains(listSecond.get(i))) {
                listThird.add(listSecond.get(i));
            }
        }

        System.out.print("Fist list: ");
        listFirst.forEach(System.out::print);
        System.out.print("\nSecond list: ");
        listSecond.forEach(System.out::print);
        System.out.print("\nThird list: ");
        listThird.forEach(System.out::print);
    }
}
