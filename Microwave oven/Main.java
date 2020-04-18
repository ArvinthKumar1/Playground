#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  float h;
  std::cin>>n>>h;
  if(n<2)
    std::cout<<fixed<<setprecision(2)<<h;
  else if(n==2)
    std::cout<<fixed<<setprecision(2)<<(h+h*50/100);
  else if(n==3)
    std::cout<<fixed<<setprecision(2)<<(h*2);
  else if(n>3)
    std::cout<<"Number of items is more";
}