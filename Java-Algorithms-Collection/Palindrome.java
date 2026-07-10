import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        
        word = word.toLowerCase().trim().replace(" ", "");
        int j = word.length() - 1;
        
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) == word.charAt(j)) {
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        if (isPalindrome(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }
        
        sc.close();
    }
}