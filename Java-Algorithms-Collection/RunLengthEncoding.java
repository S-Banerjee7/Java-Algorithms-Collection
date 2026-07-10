import java.util.Scanner;

public class RunLengthEncoding {

    public static String encode(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        }

        StringBuilder encoded = new StringBuilder();
        int counter = 1;
        int i;

        for (i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                counter++;
            } else {
                encoded.append(word.charAt(i)).append(counter);
                counter = 1;
            }
        }
        
        encoded.append(word.charAt(i)).append(counter);
        return encoded.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        
        System.out.println(encode(word));
        
        sc.close();
    }
}