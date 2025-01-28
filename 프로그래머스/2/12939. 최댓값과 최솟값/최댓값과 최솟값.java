class Solution {
    public String solution(String s) {
        String answer = "";
        String[] Array = s.split(" ");
        int min = Integer.valueOf(Array[0]);
        int max = Integer.valueOf(Array[0]);
        
        for(int i=1; i<Array.length; i++){
            if(Integer.valueOf(Array[i]) > max) max = Integer.valueOf(Array[i]);
            if(Integer.valueOf(Array[i]) < min) min = Integer.valueOf(Array[i]);
        }
        
        answer = Integer.toString(min) + " " + Integer.toString(max);
        return answer;
    }
}