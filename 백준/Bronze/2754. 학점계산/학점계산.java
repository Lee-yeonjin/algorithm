import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String grade = br.readLine();

        if(grade.equals("A+")) bw.write(String.valueOf(4.3));
        else if(grade.equals("A0")) bw.write(String.valueOf(4.0));
        else if(grade.equals("A-")) bw.write(String.valueOf(3.7));
        else if(grade.equals("B+")) bw.write(String.valueOf(3.3));
        else if(grade.equals("B0")) bw.write(String.valueOf(3.0));
        else if(grade.equals("B-")) bw.write(String.valueOf(2.7));
        else if(grade.equals("C+")) bw.write(String.valueOf(2.3));
        else if(grade.equals("C0")) bw.write(String.valueOf(2.0));
        else if(grade.equals("C-")) bw.write(String.valueOf(1.7));
        else if(grade.equals("D+")) bw.write(String.valueOf(1.3));
        else if(grade.equals("D0")) bw.write(String.valueOf(1.0));
        else if(grade.equals("D-")) bw.write(String.valueOf(0.7));
        else bw.write(String.valueOf(0.0));
        
        bw.flush();
        bw.close();
    }
}