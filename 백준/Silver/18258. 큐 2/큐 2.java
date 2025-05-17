import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] argvs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();

        int num = Integer.parseInt(br.readLine());

        int last = 0;
        for(int i=0; i<num; i++){
            String str = br.readLine();
            if(str.substring(0,3).equals("pus")) {
                last = Integer.parseInt(str.substring(5));
                queue.add(Integer.parseInt(str.substring(5)));
            }
            else if(str.substring(0,3).equals("pop")) {
                if(queue.isEmpty()) bw.write(-1 +"\n");
                else bw.write(queue.poll()+"\n");
            }
            else if(str.substring(0,3).equals("siz")) bw.write(queue.size()+"\n");
            else if(str.substring(0,3).equals("emp")) {
                if(queue.isEmpty()) bw.write(1 +"\n");
                else bw.write(0 +"\n");
            }
            else if(str.substring(0,3).equals("fro")) {
                if(queue.isEmpty()) bw.write(-1+"\n");
                else bw.write(queue.peek()+"\n");
            }
            else if(str.substring(0,3).equals("bac")) {
                if(queue.isEmpty()) bw.write(-1+"\n");
                else bw.write(last +"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}