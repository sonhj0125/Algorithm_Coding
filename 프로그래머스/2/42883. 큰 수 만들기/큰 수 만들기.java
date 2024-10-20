import java.util.*;
// 각 자리 수마다 가장 큰 수가 오게끔 하기
// k는 제거할 수의 개수
// number에서 k개의 수를 제거했을 때 만들 수 있는 가장 큰 수를 문자열 형태로 return

// 자리수가 n이라고 치면, 뒤에서 n-1개 만큼 빼고 앞에서 최댓값을 구한다.

/*
    현재 내가 뽑아야 할 숫자의 갯수는 6개로, 맨 뒤부터 5자리 수는 남겨둔다.
    (그래야 숫자 1개를 뽑더라도 뒤 5자리가 남아 무사히 6자리를 만들 수 있다.)
    "4177252841"에서 "52841"을 빼고 "41772"에서 가장 큰 수를 찾는다.
    가장 큰 수 7을 뽑아 answer에 붙여준다. 이 때 7의 index는 2, 그 전 문자들은 다 지워준다. (순서가 중요하기 때문에 7을 뽑은이상 어차피 뒤의 숫자를 가지고 만들 수 없다.) answer ="7";
    417을 지운 후 "7252841"에서 "2841"을 빼고 "725"에서 가장 큰 수를 찾는다.
    7을 뽑아 붙여준다. answer = "77" 뽑은 7 이전의 숫자들은 다 버린다.
    "252841"에서 "841"을 빼고 "252"에서 가장 큰 수를 찾는다.
    5를 뽑아 붙여준다. answer = "775" 뽑은 '5'이전의 숫자들은 다 버린다.
    "2841"에서 "41"을 빼고 "28"에서 가장 큰 수를 찾는다.
    8을 뽑아 붙여준다. answer = "7758" 뽑은 '8'이전의 숫자들은 다 버린다.
    "41"에서 "1"을 빼고 "4"에서 가장 큰 수를 찾는다.
    이러한 방식으로 4와 1을 붙여 answer = "775841"을 만든다.
*/

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        
        int len = number.length() - k;
        int start = 0;
        
        while(start < number.length() && answer.length() != len) {
            
            int leftNum = k + answer.length() + 1;
            int max = 0;
            
            for(int j = start; j < leftNum; j++){
                if(max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    start = j + 1;
                }
                
            } // end of for
            
            answer.append(Integer.toString(max));
            
        } // end of while
        
        return answer.toString();
    }
}