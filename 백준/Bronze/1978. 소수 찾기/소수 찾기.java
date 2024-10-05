import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 제곱근을 이용한 판별법 - Number 의 제곱근까지만 검사하면 된다.
    // 소수 찾기 - 1과 자기 자신만을 약수로 가짐
    int N = sc.nextInt();

    int count = 0;

    for(int i = 0; i < N; i++){

      // 소수인경우 true, 아닌경우 false
      boolean isPrime = true;

      int num = sc.nextInt();

      if(num == 1) { // 1인경우 다음 반복문으로
        continue;
      }

      for(int j = 2; j <= Math.sqrt(num); j++){
        if(num % j == 0) {
          isPrime = false; // 소수가 아니므로 false
          break;
        }
      }
      if(isPrime){
        count++;
      }

    } // end of for

    System.out.println(count);

  }

}