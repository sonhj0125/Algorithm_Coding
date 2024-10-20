import java.util.*;
// 바로 앞번호나 뒷번호 학생에게만 빌려줄 수 있음
// 최대한 많은 학생이 수업 들어야함
// 전체 학생의 수 : n, 체육복 도난당한 학생번호 배열 : lost, 여벌가져온 학생 배열 : reserve
// 도난당하지 않은 학생의 수 : n - lost.length

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        int answer = 0;
        
        Arrays.sort(reserve);
        Arrays.sort(lost);
        
        // 도난 당하지 않은 학생의 수
        answer = n - lost.length;
        
        // 여벌 가져왔지만 도난당한 학생 수
        // lost, reserve 배열 둘다 존재시
        // 빌릴필요도 없고, 빌려줄수도 없음
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++){
                
                if(lost[i] == reserve[j]) {
                    answer++;   // 수업은 들을 수 있음
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
                
            } // end of for j
        } // end of for i
        
        
        // 도난당했지만 체육복 빌릴 수 있는 학생 수
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                
                if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {    // 앞 뒤 번호에게만 빌려줄 수 있으므로
                    answer++;
                    reserve[j] = -1;
                    break;
                }
                
            } // end of for j
        } // end of for i
        
        
        return answer;
        
        
    }
}