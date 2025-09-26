package strings;

import java.util.Scanner;

public class ReverseStringWordWise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        String word = "";
        String result = "";
        boolean isFirstWord = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word += ch; // Build the current word
            } else {
                if (!word.equals("")) {
                    String reversed = "";
                    for (int j = word.length() - 1; j >= 0; j--) {
                        reversed += word.charAt(j);
                    }

                    if (isFirstWord) {
                        result += reversed;
                        isFirstWord = false;
                    } else {
                        result += " " + reversed;
                    }
                    word = ""; // Reset for next word
                }
                // If it's extra space, skip adding multiple spaces
            }
        }

        // Add the last word (if any)
        if (!word.equals("")) {
            String reversed = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reversed += word.charAt(j);
            }

            if (isFirstWord) {
                result += reversed;
            } else {
                result += " " + reversed;
            }
        }

        System.out.println("Output: " + result);
        sc.close();
    }
}