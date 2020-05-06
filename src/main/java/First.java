public class First {
    static String[] word = {"ABADABA", "ABBA", "Forf", "reviver"};

    static boolean palindromeValidation(String j) {
        String reverse = "";
        int length = j.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + j.charAt(i);
        return j.equals(reverse);
    }

    public static void main(String args[]) {

        for (String j : word) {
            //palindromeValidation(j);
            if (palindromeValidation(j))
                System.out.println("Entered string/number " + j + " is a palindrome.");
            else
                System.out.println("Entered string/number " + j + " isn't a palindrome.");

        }
    }
}


