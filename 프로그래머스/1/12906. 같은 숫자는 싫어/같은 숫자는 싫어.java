import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) cnt++;
        }
        
        int[] answer = new int[cnt];
        answer[0] = arr[0];
         int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                answer[index++] = arr[i];
            }
        }

        return answer;
    }
}