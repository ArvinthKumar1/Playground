#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int sum;
  if(n<=200)
  {
    sum=n*0.5;
  }
  else if(n>200 && n<=400)
  {
    sum=(n*0.65)+100;
  }
  else if(n>400 && n<=600)
  {
    sum=(n*0.80)+200;
  }
  else
  {
    sum=(n*1.25)+425;
  }
  std::cout<<"Rs."<<sum;
  return 0;
}