import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.replace("c="," ");
        str = str.replace("c-"," ");
        str = str.replace("dz="," ");
        str = str.replace("d-"," ");
        str = str.replace("lj"," ");
        str = str.replace("nj"," ");
        str = str.replace("s="," ");
        str = str.replace("z="," ");

        System.out.println(str.length());
    }
}