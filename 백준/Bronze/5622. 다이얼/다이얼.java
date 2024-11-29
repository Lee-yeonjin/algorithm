import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'C') {
                sum += 3;
            } else if (ch >= 'D' && ch <= 'F') {
                sum += 4;
            } else if (ch >= 'G' && ch <= 'I') {
                sum += 5;
            } else if (ch >= 'J' && ch <= 'L') {
                sum += 6;
            } else if (ch >= 'M' && ch <= 'O') {
                sum += 7;
            } else if (ch >= 'P' && ch <= 'S') {
                sum += 8;
            } else if (ch >= 'T' && ch <= 'V') {
                sum += 9;
            } else if (ch >= 'W' && ch <= 'Z') {
                sum += 10;
            }
        }
        sc.close();
        System.out.println(sum);
    }
}