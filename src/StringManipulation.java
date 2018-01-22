public class StringManipulation {

    public String reverseAString(String string) {
        int length = string.length();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = length-1; i >= 0; i--) {
            stringBuilder.append(string.charAt(i));
        }

        String reversedString = stringBuilder.toString();

        return reversedString;

    }

    public void checkIfPalindrome(String string) {
        if (string != null && string.length() > 0) {
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
                    break;
                }
            }

            System.out.println("This is a palindrome!");

        } else {
            System.out.println("This is not a valid string.");
        }

    }

}
