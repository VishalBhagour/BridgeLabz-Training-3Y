package Level_1;

import java.util.Scanner;

public class SubstringCompare {
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String manualSubstring = createSubstring(text, start, end);
        String builtinSubstring = text.substring(start, end);
        boolean manualCompare = compareStrings(manualSubstring, builtinSubstring);
        boolean builtinCompare = manualSubstring.equals(builtinSubstring);
        System.out.println("Substring using charAt(): " + manualSubstring);
        System.out.println("Substring using substring(): " + builtinSubstring);
        System.out.println("Comparison using charAt(): " + manualCompare);
        System.out.println("Comparison using equals(): " + builtinCompare);

        if (manualCompare == builtinCompare) {
            System.out.println("Both methods give the SAME result.");
        } else {
            System.out.println(" Results are DIFFERENT.");
        }

    }
}

