class Solution {
    public int solution(int a, int b, boolean flag) {
        
        int answer = 0;
        
        // flag true : a + b
        // flag false : a - b
        
        if(flag == true){
            answer = a + b;
        }
        else if(flag == false){
            answer = a - b;
        }
        
        return answer;
        
        
        
    }
}