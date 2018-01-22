public class Main {
    public static void main(String[] args) {
        System.out.println(StringManipulation.reverseAString("hello"));

        System.out.println("All these should be true:");
        StringManipulation.checkIfPalindrome("hannah");
        StringManipulation.checkIfPalindrome("racecar");
        StringManipulation.checkIfPalindrome("deified");
        StringManipulation.checkIfPalindrome("deleveled");

        System.out.println("All these should be false:");
        StringManipulation.checkIfPalindrome("hannahh");
        StringManipulation.checkIfPalindrome("racecarrr");
        StringManipulation.checkIfPalindrome("deifieddd");
        StringManipulation.checkIfPalindrome("deleveledddd");


        System.out.println("All these should be non-valid strings:");
        StringManipulation.checkIfPalindrome("");
        StringManipulation.checkIfPalindrome(null);

        System.out.println("These should be in pig latin:");
        StringManipulation.convertToPigLatin("hello");
        StringManipulation.convertToPigLatin("hey");

    }
}
