#include<iostream>
using namespace std;
int main()
{
  int n;
  int temp=n;
  std::cin>>n;
  int sq=n*n;
  int sqr=sq;
  int c=0;
  int co=0;
  while(sq>0)
  {
    co+=1;
    sq=sq/10;
  }
  int p=10;
  while(c!=1 && co>0)
  {
    int k=sqr%p;
    co--;
    int num=sqr/p;
    int sum=k+num;
    if(sum==n)
 	  c=1;
    else
    {
      p=p*10;
    }
  }
  if(c==1)
  {
    std::cout<<"Kaprekar Number";
  }
  else
  {
    std::cout<<"Not a Kaprekar Number";
  }
}