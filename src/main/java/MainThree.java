public class MainThree {
    public static void main(String[] args) {
        String text = "Hello. My name is Mike. My age - 23.";
        int countLetters = 0;
        int countNumbers = 0;

        for (int i = 0; i < text.length(); i++) {
            Character ch = (char) text.charAt(i);
            int code = ch.hashCode();

            if (code >= 49 && code <= 57) {
                countNumbers++;
            }

            if (code >= 65 && code <= 90 ||
                    code >= 97 && code <= 122) {
                countLetters++;
            }
        }
        System.out.println(
                "Count letters: " + countLetters +
                        "\nCount numers: " + countNumbers);
    }
}
