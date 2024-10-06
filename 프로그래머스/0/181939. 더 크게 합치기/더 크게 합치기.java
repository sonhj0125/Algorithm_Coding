class Solution {
    public int solution(int a, int b) {
        
        // a, b -> String ab or ba
        // String -> int : Integer.parseInt()
        // int -> String : String.valueOf()
        
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        
        if(Integer.parseInt(ab) >= Integer.parseInt(ba)){
            return Integer.parseInt(ab);
        }
        else {
            return Integer.parseInt(ba);
        }
        
        
    }
}