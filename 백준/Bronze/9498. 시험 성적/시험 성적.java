import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int grade = sc.nextInt();
    sc.close();
/*
    if(grade >= 90) {
      System.out.println("A");
    }
    else if(grade >= 80) {
      System.out.println("B");
    }
    else if(grade >= 70) {
      System.out.println("C");
    }
    else if(grade >= 60) {
      System.out.println("D");
    }
    else {
      System.out.println("F");
    }

*/

    // 삼항연산자 사용
    System.out.println((grade>=90)?"A" : (grade>=80)?"B" : (grade>=70)?"C" : (grade>=60)?"D":"F");
  }
}