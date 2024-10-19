import java.util.*;
// 논문 n편 중 h번 이상 인용된 논문이 h편 이상이고
// 나머지 논문이 h번 이하 인용되었다면,
// h의 최댓값이 이 과학자의 H-Index
class Solution {
    public int solution(int[] citations) {

        int answer = 0;
        
        // Arrays.sort 정렬
        // citations[i]에서 i값을 증가시키고,
        // 논문의 수를 감소시키면서 비교하면
        // 인용 횟수가 논문의 수 이상이 되었을 때가 H값
        Arrays.sort(citations);
        
        for(int i=0; i<citations.length; i++){
            
            // 인용된 논문의 수
            int h = citations.length - i;

            if(citations[i] >= h){
                answer = h;
                break;
            }
            
        } // end of for
        
        return answer;
    }
}