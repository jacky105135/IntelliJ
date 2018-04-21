import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = Integer.parseInt(scan.nextLine());
      if(a % 4 != 0 ){
        System.out.println("Regular");
      }else {
        if (a % 100 == 0 && a % 400 !=0){
          System.out.println("Regular");
        }else if (a %100 != 0){
          System.out.println("Leap");
        }else if (a % 400 == 0){
          System.out.println("Leap");
        }
      }
  }
}