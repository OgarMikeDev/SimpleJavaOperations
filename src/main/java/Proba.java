import java.util.ArrayList;

public class Proba {
    public static void main(String[] args) {
        //min + Math.round(Math.random() * (max - min))
        ArrayList<String> arrayList = new ArrayList<>() {{
            add("Hello");
            add("My name");
        }};
        arrayList.add("Max");

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
