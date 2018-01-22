public class Main {
    public static void main(String[] args) {
        StringManipulation stringManipulation = new StringManipulation();
        System.out.println(stringManipulation.reverseAString("hello"));
        stringManipulation.checkIfPalindrome("hannah");
        stringManipulation.checkIfPalindrome("");
        stringManipulation.checkIfPalindrome(null);

    }
}
