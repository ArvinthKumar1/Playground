#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int s,sum=0;
  while(n>0)
  {
    s=n%10;
    n=n/1000;
    sum=sum+s;
  }
  std::cout<<sum;
}