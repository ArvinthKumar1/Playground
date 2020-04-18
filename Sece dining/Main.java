#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s;
  int n;
  std::cin>>s>>n;
  if(s=="front")
  {
    if(n==1)
      std::cout<<"Left Handed";
    else
      std::cout<<"Right Handed";
  }
  else if(s=="rear")
  {
    if(n==1)
      std::cout<<"Right Handed";
    else
      std::cout<<"Left Handed";
  }
  
  
}