class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        
        // ineq : < or >
        // eq : = or !
        // true : 1, false : 0
        
        if(ineq.equals(">")){
            if(eq.equals("=")){
                return n >= m ? 1 : 0;
            }
            else if(eq.equals("!")){
                return n > m ? 1 : 0;
            }
        }
        else if(ineq.equals("<")){
            if(eq.equals("=")){
                return n <= m ? 1 : 0;
            }
            else if(eq.equals("!")){
                return n < m ? 1 : 0;
            }
        }
        
        return 0;
        
        
    }
}