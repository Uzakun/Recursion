import java.util.Scanner;

class Main {
  static int factorial(int n){
    if(n==1 || n==0){
      return 1;
    }
    else{
      return n * factorial(n-1);
    }
  }
  public static void main(String[] args) {
    System.out.println("enter the number you want the factorial of: ");
    Scanner sc= new Scanner(System.in);
   int a= sc.nextInt();
   System.out.println("The required factorial " + factorial(a)+ "."); 
    
  }
}