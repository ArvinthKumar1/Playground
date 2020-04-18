#include<iostream>
using namespace std;
int main()
{
 int n;
  std::cin>>n;
  int count=0;
  while(n>0)
  {
    n--;
    count+=n;
  }
  std::cout<<count;
}