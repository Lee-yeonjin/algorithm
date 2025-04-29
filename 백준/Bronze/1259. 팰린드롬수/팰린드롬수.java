import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true){
            String s = sc.nextLine();
            if(s.equals("0")) break;
            else list.add(s);
        }

        for (String s : list) {
            boolean plan = true;
            for(int i=0; i<s.length()/2; i++){
                if(s.charAt(i) != s.charAt(s.length()-1-i)) plan = false;
            }
            if(plan) System.out.println("yes");
            else System.out.println("no");
        }
    }
}