import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int f=n/100;
      int l=n%10;
      System.out.println(f+l);
	}
}