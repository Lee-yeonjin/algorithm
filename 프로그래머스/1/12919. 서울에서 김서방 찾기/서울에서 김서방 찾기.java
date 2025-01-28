class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int order = -1;
        
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")) order = i;
        }
        
        answer = "김서방은 " + order + "에 있다";
        return answer;
    }
}