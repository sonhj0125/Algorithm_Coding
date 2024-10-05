import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 데이터 수

    for(int i=0; i<T; i++){
      int H = sc.nextInt(); // 호텔의 층 수
      int W = sc.nextInt(); // 각 층의 방 수
      int N = sc.nextInt(); // 몇 번째 손님

      // 1. 층 수 구하기(H)
      // N을 H로 나눈 나머지 값이 층 수
      // 10번째 손님 -> 4층 / 10 % 6으로 나머지 값인 4가 층 수가 된다.
      // 하지만, 만약 6번째 손님에 6층이라면? 나머지가 0이 되어 0층이 되버림
      // 사실은 0층이 아니고 6층이 됨.
      // 12번째 손님이 6층이여도 마찬가지임. 0이 나오면 안되고 6이 나와야함
      // 방번호는 YXX 또는 YYXX 이므로, 최소 100의 자릿수부터 시작하므로 Y에 100을 곱한다.

      // 2. 거리 구하기(X)
      // N번째 손님은 건물 층수(H)로 나눈 몫이 엘베로부터 떨어진 거리, 그리고 +1을 해야함.
      // 3번째 손님인데 8층일때, 나눗셈을 하면 몫이 0이지만, X는 0이 아닌 1부터 시작하기 때문
      // 즉, 호수가 201, 301, 401 처럼 1부터 시작함.
      // 하지만, N = 6, H = 6 이라면? +1을 하게되면 2호가 되므로 N % H == 0 일때는 +1을 더하지 않고 그냥 나눈다.


      if(N % H == 0){
        System.out.println((H * 100) + (N / H));
      }
      else {
        System.out.println(((N % H) * 100) + ((N / H) + 1));
      }
    }

  }

}