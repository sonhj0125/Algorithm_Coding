class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int x = 1;
        
        for(int i=0; i<num_list.length; i++) {
            sum += num_list[i];
            x *= num_list[i];
            
            if(sum*sum > x) {
                answer = 1;
            }
            else {
                answer = 0;    
            }
        }
        
        return answer;
    }
}