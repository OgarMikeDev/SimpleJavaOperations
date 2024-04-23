public class Main {
    public static void main(String[] args) {
        String text = "Hello. My name is Mike. My age - 23.";
        String updateText = "";
//        String regexForLetters = "[a-zA-Z]";
//        String regexForNumbers = "[0-9]";
        String regex = "[^a-zA-Z0-9]";

        updateText = text.replaceAll(regex, "");
//        for (int i = 0; i < text.length(); i++) {
//            if (String.valueOf(text.charAt(i)).matches(regexForLetters)
//                    || String.valueOf(text.charAt(i)).matches(regexForNumbers)) {
//                updateText += String.valueOf(text.charAt(i));
//            }
//        }
        System.out.println(updateText);
    }
}
