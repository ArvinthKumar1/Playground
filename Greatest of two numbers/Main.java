import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n2=sc.nextInt();
      if(n>n2)
        System.out.println("num1 is the greatest number");
      else
        System.out.println("num2 is the greatest number");
	}
}