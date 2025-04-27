import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toString(num);
        String[] nums = str.split("");

        Arrays.sort(nums, Comparator.reverseOrder());

        for(String s : nums){
            System.out.print(s);
        }
    }
}