import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) {
        // method_1 : use StringTokenizer
		Scanner in = new Scanner(System.in);
 
		String S = in.nextLine();
		in.close();
 
		// st 에 공백을 기준으로 나눈 토큰들을 st 에 저장한다
		StringTokenizer st = new StringTokenizer(S," ");
		
		// countTokens() 는 토큰의 개수를 반환한다
		System.out.println(st.countTokens());	
        
        
        // not use buffer. 
        // 원시 입력 형태로 문자 하나씩 읽어들이면서 읽어들인 문자가 공백인지 아닌지에 따라 count 를 해주는 방법
        /*
            int count = 0;
            int pre_str = 32; // 공백을 의미한다.
            int str;
            
            while(true) {
                str = System.in.read();
                
                // 입력받은 문자가 공백일 때,
                if(str == 32){
                    // 이전의 문자가 공백이 아니면
                    if(pre_str != 32) count++;
                }
                
                // 입력받은 문자가 개행일때 ('\n')
                else if(str == 10){
                    // 이전의 문자가 공백이 아니면
                    if(pre_str != 32) count++;
                    break;
                }
                
                pre_str = str;
                
            }
            
            System.out.println(count);
        */
        
		
	}
 
}