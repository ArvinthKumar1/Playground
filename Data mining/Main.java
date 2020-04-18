#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int o=0,e=0;
  while(n>0)
  {
    o=o+(n%10);
    n=n/10;
    
    e=e+(n%10);
    n=n/10;
    
  }
  if(e==o)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}