import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner s = new Scanner(System.in);
    int a = Integer.parseInt(s.nextLine());
    int b = Integer.parseInt(s.nextLine());
    int c = Integer.parseInt(s.nextLine());
    if(a < (b+c) && b < (a+c) && c <(a+b)){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}