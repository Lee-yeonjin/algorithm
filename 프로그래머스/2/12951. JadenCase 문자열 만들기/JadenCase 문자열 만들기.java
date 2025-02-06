class Solution {
     public String solution(String str) {
        String answer = "";
        String[] arr = str.split(" ");

        for(int i=0; i<arr.length; i++){
            if(arr[i].length() == 0) {
                answer += " "; 
            } 
            else {
                answer += arr[i].substring(0,1).toUpperCase();
                answer += arr[i].substring(1,arr[i].length()).toLowerCase();
                answer += " ";
            }
        }
        if(str.substring(str.length()-1, str.length()).equals(" ")) return answer;
        else return answer.substring(0,answer.length()-1);
    }
}