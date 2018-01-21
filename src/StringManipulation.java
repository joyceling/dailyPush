public class StringManipulation {

    public static String reverseAString(String string) {
        int length = string.length();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = length-1; i >= 0; i--) {
            stringBuilder.append(string.charAt(i));
        }

        String reversedString = stringBuilder.toString();

        return reversedString;

    }

}
