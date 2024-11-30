import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] ans = {1, 1, 2, 2, 2, 8};
        String[] nums = str.split(" ");

        for (int i=0; i<nums.length; i++) {
            System.out.print(ans[i] - Integer.valueOf(nums[i]) + " ");
        }

        sc.close();
    }
}