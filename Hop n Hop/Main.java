#include<iostream>
using namespace std;
int main()
{
  int x,y;
  std::cin>>x>>y;
  if(x-3>y-4)
    std::cout<<x-3;
  else
    std::cout<<y-4;
}