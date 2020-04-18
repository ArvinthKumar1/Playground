#include<iostream>
int main()
{
  int id,m;
  std::cin>>id>>m;
  if(m>0 && m<=10)
    std::cout<<id<<" is eligible for reward.";
}