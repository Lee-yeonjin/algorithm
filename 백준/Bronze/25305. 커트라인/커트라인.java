import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        String[] people = br.readLine().split(" ");
        int peoples = Integer.parseInt(people[0]);
        int cutline = Integer.parseInt(people[1]);

        String[] score = br.readLine().split(" ");

        for(int i=0; i<peoples; i++) {
            list.add(Integer.parseInt(score[i]));
        }

        Collections.sort(list);
        System.out.println(list.get(peoples - cutline));
    }
}