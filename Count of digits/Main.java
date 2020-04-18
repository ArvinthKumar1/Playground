#include<iostream>
int main()
{
  // Type your code here
  int n,c=0;
  std::cin>>n;
  do
  {
    n=n/10;
    c+=1;
  }
  while(n>0);
  std::cout<<c;
}