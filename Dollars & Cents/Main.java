#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2;
  std::cin>>d1>>c1>>d2>>c2;
  int d=d1+d2;
  int c=c1+c2;
  int oc=0,dc=0;
  if(c>=100)
  {
    oc=c%100;
    c=c/100;
    d=d+c;
    std::cout<<d<<"\n"<<oc;
  }
  else
  {
    std::cout<<d<<"\n"<<c;
  }
  
}