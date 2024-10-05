// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();

    scan.close();

    // if 구문 말고 삼항연산자 사용해보기
    // String str = (a>b) ? ">" : ((a<b) ? "<" : "==");
    // a>b가 true 일 때 > 출력, false면 : 뒤의 식으로 넘어감

    // 또는
    System.out.println( (a>b) ? ">" : ((a<b) ? "<" : "==") );

    /* 또는
      -- br.readLine()을 통해 읽어온 것을 split(" ") 하여 공백 단위로 나눠준 뒤
      String 배열에 각각 저장하는 방법 --

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String[] str = br.readLine().split(" ");
      int A = Integer.parseInt(str[0]);
      int B = Integer.parseInt(str[1]);

      System.out.println((A>B) ? ">" : ((A<B) ? "<" : "=="));
    */
  }

}