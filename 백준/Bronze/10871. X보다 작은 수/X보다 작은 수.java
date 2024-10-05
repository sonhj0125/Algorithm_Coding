import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
/*
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }

    sc.close();

    for(int i=0; i<n; i++){
      if(arr[i] < x) {
        System.out.print(arr[i]+" ");
      }
    }
*/
  // 배열을 사용하지 않는 방법
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    
    StringBuilder sb = new StringBuilder();
    
    for(int i=0; i<n; i++){
      
      int value = sc.nextInt();
      if(value < x) {
        sb.append(value + " ");
      }
      
    }
    
    System.out.println(sb);
    

  }

}