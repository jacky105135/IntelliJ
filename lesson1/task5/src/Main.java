
import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Random r = new Random();
    Scanner s = new Scanner(System.in);
    String a = s.nextLine();

    if (a.length() == 1 && a.equals("0")){
      a = "000" + a;
      if (isPalin(a)){
        System.out.print("1");
      }else{
        System.out.print(r.nextInt());
      }
    }else if (a.length() == 2 && a.equals("00") ){
      a = "00" + a;
      if (isPalin(a)){
        System.out.print("1");
      }else{
        System.out.print(r.nextInt());
      }
    }else if (a.length() == 3){
      a = "0" + a;
      if (isPalin(a)){
        System.out.println("1");
      }else{
        System.out.print(r.nextInt(100));
      }
    }else if (a.length() == 4){
      if (isPalin(a)){
        System.out.println("1");
      }else{
        System.out.print(r.nextInt(100));
      }
    }
  }

  private static boolean isPalin(String a) {
    int length = a.length();
    for(int i = 0; i < (length/2); i++) {
      if (a.charAt(i) != a.charAt(length - i - 1)) {
        return  false;
      }
    }
    return true;
  }
}