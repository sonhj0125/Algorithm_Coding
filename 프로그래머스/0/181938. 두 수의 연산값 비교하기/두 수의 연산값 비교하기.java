class Solution {
    public int solution(int a, int b) {
        
        // int -> String : Integer.toString(int), String.valueOf(int)
        // String -> int : Integer.valueOf(String)

        String ab_str = Integer.toString(a) + Integer.toString(b);
        int ab = Integer.valueOf(ab_str);
        
        if(ab >= 2*a*b) {
            return ab;
        }
        else {
            return 2*a*b;
        }
        
        
    }
}