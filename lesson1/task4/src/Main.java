import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner s = new Scanner(System.in);
    int a = Integer.parseInt(s.nextLine());
    if(a <= 12 && a > -15){
      System.out.println("True");
    }else if (a >= 19 || a ==15 ||a == 16){
      System.out.println("True");
    }else{
      System.out.println("False");
    }
  }
}