import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        int s = a.length();
        
        for(int i=0; i<s; i++){
            System.out.println(a.charAt(i));
        }
    }
}