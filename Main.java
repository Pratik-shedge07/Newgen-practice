import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
  
  System.out.println("enter the number: ");
  int num= sc.nextInt();
  
    if(num%2==0){
      System.out.println("Its the even number");
    }
    else{
      System.out.println("Its the odd number");
    }
  }
}
