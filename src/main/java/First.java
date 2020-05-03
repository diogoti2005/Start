public class First {
        static String[] word = {"ABADBA", "ABBA", "Ford", "reviver"};

        static boolean   palindromeValidation(String j)
        {
            String  reverse = "";
            int length = j.length();
            for ( int i = length - 1; i >= 0; i-- )
                reverse = reverse + j.charAt(i);
            if (j.equals(reverse))
                return true;
            else
                return false;
        }

        public static void main(String args[]){

            for (String j : word) {
                new First().palindromeValidation(j);

                    if (palindromeValidation(j) == true)
                        System.out.println("Entered string/number " + j + " is a palindrome.");
                    else
                        System.out.println("Entered string/number " + j + " isn't a palindrome.");

            }
        }
    }


