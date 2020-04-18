#include<iostream>
using namespace std;
int main()
{
  int c,s;
  std::cin>>c>>s;
  double a_s=double(4*(s*s));
  double a_c=(double)((2*3.16)*(c*c));
  (2*c<=s)?std::cout<<"circle can be inside a square":std::cout<<"circle cannot be inside a square";
  
}