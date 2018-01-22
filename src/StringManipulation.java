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

    public static void checkIfPalindrome(String string) {
        OUTER_LOOP: if (string != null && string.length() > 0) {
            boolean isPalindrome = false;
            int length = string.length();
            int last = string.length()-1;
            boolean[] matchingArray = new boolean[length];

            for (int i = 0; i <= length - 1; i++) {

                if (string.charAt(i) == string.charAt(last)){
                    matchingArray[i] = true;
                }

                last--;

            }

            for (int i = 0; i <= length - 1; i++) {
                if (!matchingArray[i]) {
                    System.out.println("This is not a palindrome.");
                    break OUTER_LOOP;
                }
            }

            System.out.println("This is a palindrome!");

        } else {
            System.out.println("This is not a valid string.");
        }

    }

    public static String convertToPigLatin (String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        char[] vowels = {'a', 'e', 'i', 'o','u'};

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(0) == vowels[i]) {

                stringBuilder.append("ay");

            } else {

                if (string.charAt(i) == vowels[i]) {

                    String firstHalf = string.substring(string.indexOf(string.charAt(i)));
                    String secondHalf = string.charAt(0) + "ay";

                    System.out.println(firstHalf + secondHalf);
                }
            }
        }



        return stringBuilder.toString();

    }

}
