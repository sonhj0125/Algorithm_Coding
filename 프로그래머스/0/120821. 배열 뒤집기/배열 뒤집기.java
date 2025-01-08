class Solution {
    public int[] solution(int[] num_list) {
        
        /*
            배열의 크기가 5일 때, 
            answer[0] = num_list[5-1-0]
            answer[1] = num_list[5-1-1]
            answer[2] = num_list[5-1-2]
            answer[3] = num_list[5-1-3]
            answer[4] = num_list[5-1-4]
        */
        
        int[] answer = new int[num_list.length];
        
        for(int i=0; i<=num_list.length-1; i++){
            answer[i] = num_list[num_list.length-1-i];
        }
        
        return answer;
    }
}