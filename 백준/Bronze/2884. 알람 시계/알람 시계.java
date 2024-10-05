import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // 45분 일찍 알람 설정하기

    Scanner sc = new Scanner(System.in);

    int H = sc.nextInt();
    int M = sc.nextInt();
    // 24시간 표현 0:0 ~ 23:59
    // 입력받은 m을 45 기준으로 45보다 작으면 h - 1, 아닐경우 m - 45
    sc.close();

    // 10시 10분 -> 9시 25분
    if(M < 45){
      H--;    // hour 1 감소
      M = 60 - (45 - M);    // min 분 감소
      if(H < 0){
        H = 23;
      }
      System.out.println(H + " " + M);
    }
    else {
      System.out.println(H + " " + (M - 45));
    }

  }

}