public class MainFive {
    public static void main(String[] args) {
        /*
        Написать метод, который принимает один аргумент –
        целое шестизначное число.
        Метод проверяет, является ли число счастливым
        (сумма первой тройки чисел равна сумме второй тройки чисел) или нет.
        В случае, если число является таковым, возвращает true, иначе – false.
         */

        System.out.print(happyNumber(123411));
    }

    public static boolean happyNumber(int number) {
        boolean bol = false;
        if (!(String.valueOf(number).length() == 6)) {
            System.out.println("Count symbol < zero");
        } else {
            //sample number - 123321
            int num1 = number / 100_000;
            int num2 = (number / 10_000) % 10;
            int num3 = (number / 1_000) % 10;
            int num4 = (number / 100) % 10;
            int num5 = (number / 10) % 10;
            int num6 = number % 10;
            if (num1 + num2 + num3 == num4 + num5 + num6) {
                bol = true;
            }
        }
        return bol;
    }
}
