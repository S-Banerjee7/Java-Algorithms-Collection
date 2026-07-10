import java.util.Scanner;

public class MaxSubarray {

    public static int findMaxSum(int[] input) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            sum += input[i];

            if (sum > maxsum) {
                maxsum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] input = new int[n];
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        int result = findMaxSum(input);
        System.out.println("Maximum Subarray Sum is: " + result);
        
        sc.close();
    }
}