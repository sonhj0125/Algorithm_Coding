import java.util.*;
// works = (100 - progresses) / speeds
// 각 배포마다 몇 개의 기능이 배포되는가?

/*
1. 작업일수 배열(works)을 구한다.
2. works를 for문을 돌린다.
3. 전에 나온게(x) 나중에 나온 것(works[i])보다 크거나 같으면(작업일수가) count를 증가, 
   아니면 count를 list에 추가, count를 1로 초기화, x = works[i] 처리
4. for문을 빠져나와서 마지막 처리 count를 리스트에 추가한다.
5. list를 출력한다.
*/

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<>();
        int[] works = new int[progresses.length];
        
        for(int i=0; i<speeds.length; i++){
            
            works[i] = (100 - progresses[i]) / speeds[i];
            
            if((100 - progresses[i]) % speeds[i] != 0) { // 나머지가 0이 아닌경우
                works[i] += 1;
            }
            
        } // end of for
        
        int x = works[0]; 
        int count = 1;
        
        for(int i=1; i<progresses.length; i++){
            
            if(x >= works[i]) { // 전에 나온게 나중에 나온 작업일수보다 크거나 같으면
                count += 1;
            }
            else {
                list.add(count);
                count = 1;
                x = works[i];
            }
            
        } // end of for
        
        list.add(count);
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
        
        
        
    }
}