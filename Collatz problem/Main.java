#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  std::cout<<n<<"\n";
  int temp=n;
  int count=0;
  while (n>1)
  {
    if(n%2==0)
    {
      n=n/2;
      count+=1;
      std::cout<<n<<"\n";
    }
    else
    {
      n=3*n+1;
      count+=1;
      std::cout<<n<<"\n";
    }
  }
  std::cout<<count;
    
}