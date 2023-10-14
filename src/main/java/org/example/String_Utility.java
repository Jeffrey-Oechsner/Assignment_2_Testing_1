package org.example;

public class String_Utility {

    public static String reverseString(String reverse) {
        char[] charArray = reverse.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {

            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;


            left++;
            right--;
        }


        return new String(charArray);
    }

    public  static String capitalizeString(String capitalize){
        if (capitalize == null || capitalize.isEmpty()) {
            return capitalize;
        }

        char[] charArray = capitalize.toCharArray();

        // Capitalize the first character
        if (charArray[0] >= 'a' && charArray[0] <= 'z') {
            charArray[0] = (char)(charArray[0] - 'a' + 'A');
        }

        // Capitalize characters after spaces or punctuation
        for (int i = 1; i < charArray.length; i++) {
            if ((charArray[i - 1] == ' ' || charArray[i - 1] == ',') &&
                    charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] = (char)(charArray[i] - 'a' + 'A');
            }
        }

        // Capitalize the last character if it's a lowercase letter
        int lastIndex = charArray.length - 1;
        if (charArray[lastIndex] >= 'a' && charArray[lastIndex] <= 'z') {
            charArray[lastIndex] = (char)(charArray[lastIndex] - 'a' + 'A');
        }

        return new String(charArray);
    }

    public static String lowercaseString(String lowercase) {
        if (lowercase == null) {
            return null; // Handle null input if needed
        }

        char[] charArray = lowercase.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            if (c >= 'A' && c <= 'Z') {
                // Convert uppercase character to lowercase
                charArray[i] = (char) (c - 'A' + 'a');
            }
        }

        return new String(charArray);
    }
}
