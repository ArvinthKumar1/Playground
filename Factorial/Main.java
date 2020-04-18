#include<iostream>
int fac(int n)
{
  if(n>1)
    return n*fac(n-1);
  else 
    return n;
}
int main()
{
  int n;
  std::cin>>n;
  std::cout<<"The factorial of "<<n<<" is "<<fac(n);
}
