import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String first, String second) {
        first = first.replaceAll("\\s", "").toLowerCase();
        second = second.replaceAll("\\s", "").toLowerCase();

        if (first.length() != second.length()) {
            return false;
        }

        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        
        return Arrays.equals(firstArray, secondArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String first = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String second = sc.nextLine();

        if (isAnagram(first, second)) {
            System.out.println("Yes, they are anagrams.");
        } else {
            System.out.println("No, they are not anagrams.");
        }

        sc.close();
    }
}