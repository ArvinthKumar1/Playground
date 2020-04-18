#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int tball,trun,crun,cball;
  std::cin>>tball>>trun>>crun>>cball;
  double overs=(double)tball/6;
  std::cout<<overs<<"\n";
  double e_ball=cball%6;
  e_ball=(double)e_ball/10;
  int c_over=cball/6;
  double ce_over=(double)c_over+e_ball;
  std::cout<<fixed<<setprecision(1)<<ce_over<<"\n";
  double c_rr=(double)crun/ce_over;
  std::cout<<c_rr<<"\n";
  double r_rr=(double)trun/overs;
  std::cout<<r_rr<<"\n";
  (c_rr>r_rr)?std::cout<<"Eligible to Win":std::cout<<"Not Eligible to Win";
}