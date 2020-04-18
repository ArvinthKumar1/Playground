#include<iostream>
int swap_fun(int &x,int &y)
{
  int temp=y;
  y=x;
  x=temp;
}
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap_fun(a,b);
  std::cout<<"After swapping a= "<<a<<" and b="<<b;
  return 0;
}
