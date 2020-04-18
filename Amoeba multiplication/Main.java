#include<iostream>
using namespace std;
int main()
{
  int n,t1=0,t2=1,sum=0;
  std::cin>>n;
  while(n>0)
  {
    sum+=t1;
    t1=t2;
    t2=sum;
    n--;
  }
  std::cout<<sum;
}