#include<iostream>
using namespace std;
int main()
{
  float m;
  int l,d;
  std::cin>>m>>l>>d;
  float d_c=m*l;
  (d_c<=d)?std::cout<<"Cannot reach":std::cout<<"Can reach";
}