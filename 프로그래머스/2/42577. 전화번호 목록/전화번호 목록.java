import java.util.*;
// 접두어인 경우가 있으면 false, 아니면 true

class Solution {
    public boolean solution(String[] phone_book) {
        
        // 1. HashMap
        Map<String, Integer> map = new HashMap<>();
        
        // 2. 모든 전화번호 넣기
        for(int i=0; i<phone_book.length; i++){
            map.put(phone_book[i], i);
        }
        
        // 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인
        
        for(int i=0; i<phone_book.length; i++){
            
            for(int j=0; j<phone_book[i].length(); j++){
                
                if(map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
                           
            } // end of for(int j=0; j<phone_book[i].length(); j++)
            
        } // end of for(int i=0; i<phone_book.length; i++)
        
     return true; 
        
    }
}