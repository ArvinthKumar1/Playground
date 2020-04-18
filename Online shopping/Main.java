#include<iostream>
using namespace std;
int main()
{
  int sa,sd,ss,fa,fd,fs,aa,ad,as;
  std::cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  int flip=fa-(fa*fd/100)+fs;
  std::cout<<"In Flipkart Rs."<<flip<<"\n";
  int snap=sa-(sa*sd/100)+ss;
  std::cout<<"In Snapdeal Rs."<<snap<<"\n";
  int amaz=aa-(aa*ad/100)+as;
  std::cout<<"In Amazon Rs."<<amaz<<"\n";
  if(flip<=snap && flip<=amaz)
    std::cout<<"He will prefer Flipkart";
  else if(snap<=flip && snap<=amaz)
    std::cout<<"He will prefer Snapdeal";
  else if(amaz<=flip && amaz<=snap)
    std::cout<<"He will prefer Amazon";
}