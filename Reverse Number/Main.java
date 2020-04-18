#include <iostream>
int main() 
{
	int n;
    std::cin>>n;
  int v;
  while(n>0)
  {
    v=n%10;
    std::cout<<v;
    n=n/10;
  }
	return 0;
}