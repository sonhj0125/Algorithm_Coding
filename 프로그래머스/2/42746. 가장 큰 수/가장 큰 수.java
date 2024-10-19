import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        // 숫자들의 앞자리 숫자가 큰 수가 와야 함. 내림차순 정렬
        // compareTo()를 이용해 두 문자열을 합친 (o2 + o1)과 (o1 + o2) 중 값이 큰 값을 기준으로 내림차순 정렬하기!
        
        String[] str = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }
        
        // 두 수를 합친 값이 큰 순서(내림차순)
        Arrays.sort(str, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        // 첫 번째 수가 0이면 0으로만 이뤄진 배열이므로 0 리턴
        if(str[0].equals("0")){
            return "0";
        }
        
        return String.join("", str);
        
    }
}