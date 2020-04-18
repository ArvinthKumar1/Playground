import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a,t=0;
    while(n>0)
    {
      a=n%10;
      t=t*10+a;
      n=n/10;
    }
    System.out.println(t);
  }
}