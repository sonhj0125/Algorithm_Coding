import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int sum = 0;
    for (int i = 0; i < 5; i++) {
      int num = sc.nextInt();
      sum += num * num;
    }

    int result = sum % 10;

    sc.close();

    System.out.println(result);

  }
}