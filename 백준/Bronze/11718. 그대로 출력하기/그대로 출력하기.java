import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(sc.hasNextLine()){
            String str = sc.nextLine();
            if(str.isEmpty()) break;
            else sb.append(str).append('\n');
        }

        System.out.print(sb.toString());
    }
}