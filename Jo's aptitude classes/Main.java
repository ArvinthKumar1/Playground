#include<iostream>
using namespace std;
int check_small(int,int,int);
int cal_hcf(int ,int ,int,int);
int main()
{
  int n1,n2,n3,ans;
  std::cin>>n1>>n2>>n3>>ans;
  int small=check_small(n1,n2,n3);
  int gcd=cal_hcf(n1,n2,n3,small);
  if(gcd==ans)
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
}
int check_small(int n1,int n2,int n3)
{
  if(n1<n2 && n1<n3)
    return n1;
  else if(n2<n1 && n2<n3)
    return n2;
  else if(n3<n1 && n3<n2)
    return n3;
}
int cal_hcf(int n1,int n2,int n3,int small)
{
  while(small>=1)
  {
    if(n1%small==0 && n2%small==0 && n3%small==0)
    {
      return small;
      break;
    }
    small--;
  }
}