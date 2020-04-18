#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,t=0;;
  std::cin>>n;
  do
  {
    int k;
    std::cin>>k;
    sum+=k;
    t+=1;
  }
  while(sum<n);
  std::cout<<"The number of turns is "<<t;
}