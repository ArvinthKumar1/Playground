#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  std::cin>>r>>c>>t;
  int firstColStart=c+1;
  int firstColEnd=r+c;
  int lastColStart=r*c-(r+c);
  int lastColEnd=r*c-c;
  if(t>=firstColStart && t<=firstColEnd)
    std::cout<<"It is a mango tree";
  else if(t>lastColStart && t<=lastColEnd)
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
  
  
}
