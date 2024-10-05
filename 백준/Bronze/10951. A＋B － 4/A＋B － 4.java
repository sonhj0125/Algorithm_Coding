import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

/*    Scanner sc = new Scanner(System.in);

    while (sc.hasNextInt()) {

      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(a + b);

    }

    sc.close();*/

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str;

    while( (str = br.readLine()) != null ) {

      int a = str.charAt(0) - 48;
      // charAt()은 해당 문자의 아스키코드 값을 반환하기 때문에 정수형태로 변환(-48)
      int b = str.charAt(2) - 48;
      sb.append(a+b).append("\n");
    }
    
    System.out.println(sb);

  }
}