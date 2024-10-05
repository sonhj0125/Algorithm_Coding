import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
/*
    Scanner sc = new Scanner(System.in);

    String str = sc.next();
    int n = sc.nextInt() - 1;

    System.out.println(str.charAt(n));

    sc.close();
 */
    // BufferedReader 사용
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String st = br.readLine();
    int n = Integer.parseInt(br.readLine()) - 1;
    
    br.close();
    
    System.out.println(st.charAt(n));
    
  }
}