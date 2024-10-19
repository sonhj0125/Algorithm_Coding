import java.util.*;

class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        // mode 가 0일 때
        // code[idx] 가 "1"이 아니면 idx가 짝수일 때만 ret 맨 뒤에 code[idx]를 추가
        // code[idx] 가 "1" 이면, mode를 0에서 1로 변경
        
        // mode 가 1일 때
        // code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret 뒤에 추가
        // code[idx]가 "1" 이면, mode를 0으로
        
        for(int i=0; i<code.length(); i++){
            
            if(mode == 0) { // 0일 경우
                
                if(code.charAt(i) != '1') {
                    if(i % 2 == 0) {
                        answer += code.charAt(i);
                    }
                }
                else if(code.charAt(i) == '1'){
                    mode = 1;
                }
            }
            else { // 1일 경우
                
                if(code.charAt(i) != '1'){
                    if(i%2 == 1) {
                        answer += code.charAt(i);
                    }
                }
                else if(code.charAt(i) == '1') {
                    mode = 0;
                }
            }
            
        } // end of for
        
        // 시작할 때 mode는 0, ret이 만약 빈 문자열이라면 대신 "EMPTY" 리턴
        if(answer.equals("")) {
            answer = "EMPTY";
        }
        
        return answer;
    }
}