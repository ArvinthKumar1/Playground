#include<iostream>
using namespace std;
int main()
{
  float m=0;
  int count=0;
  bool flag=true;
  do
  {
    int n;
    std::cin>>n;
    if(n>0)
    {
      if(n%2==1)
      {
        m=m+1;
        count+=1;
      }
      else
        m=m-0.5;
    }
    else
    {
      m=m-1;
      flag=false;
    }
  }
  while(flag==true && count<3);
  std::cout<<m;
}