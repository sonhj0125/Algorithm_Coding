import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 윤년이면 1, 아니면 0
    // 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
    // 4의 배수일 경우 if(year % 4 == 0)
    // 4의 배수이면서 400의 배수일 경우 if(year % 400 == 0)
    // 4의 배수이면서 100의 배수일 경우 else if(year % 100 == 0)
    int year = sc.nextInt();
    sc.close();

    if(year % 4 == 0){

      if(year % 400 == 0) {
        System.out.println("1");
      }
      else if(year % 100 == 0) {
        System.out.println("0");
      }
      else {
        System.out.println("1");
      }

    }
    else {
      System.out.println("0");
    }










  }

}