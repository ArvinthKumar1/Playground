#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  float a=0.5;
  std::cout<<a<<" ";
  if(n>1)
  {
  for(int i=1;i<n;i++)
  {
    a=a*3;
    std::cout<<a<<" ";
  }
  }
}
    