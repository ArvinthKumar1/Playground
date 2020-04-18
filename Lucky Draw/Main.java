#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int count=0;
  bool b=true;
  if(n>1)
  {
  for(int i=2;i<n;i++)
  {
    if(n%i==0)
    {
      b=false;
      break;
    }
    
  }
  if(b)
    std::cout<<"Eligible";
  else
    std::cout<<"Not eligible";
  }
  else
  {
    std::cout<<"Not eligible";
  }
}
      