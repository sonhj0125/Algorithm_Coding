import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // a^2 = b^2 + c^2
    Scanner sc = new Scanner(System.in);

    while(true) {

      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      // 0 0 0 입력시 종료
      if(a == 0 && b == 0 && c == 0) {
        break;
      }
      // a, b, c 중 어떤 값이 대각선인지 모름
      if((a*a + b*b) == c*c) {
        System.out.println("right");
      }
      else if((b*b + c*c == a*a)) {
        System.out.println("right");
      }
      else if((a*a + c*c == b*b)){
        System.out.println("right");
      }
      else {
        System.out.println("wrong");
      }
      
    }

  }

}