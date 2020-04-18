#include<iostream>
int main(){
  int n;
  int f=1;
  std::cin>>n;
  for(int i=1;i<=n;i++)
    f*=i;
  std::cout<<f;
}