import java.util.ArrayList;

public class Proba {
    public static void main(String[] args) {
       /*
        Написать код, который принимает строку
        и оставляет в ней только буквы и числа,
        убирая все остальное.
         */

        String text = "Hello. My name is Mike. My age - 23.";

        for (int i = 0; i < text.length(); i++) {
            Character ch = (char) text.charAt(i);
            int code = ch.hashCode();

            if (code >= 65 && code <= 90 ||
                    code >= 97 && code <= 122 ||
                    code >= 48 && code <= 57) {
                System.out.print(ch + " - " + code + "\n");
            }
        }
    }
}
