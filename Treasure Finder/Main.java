#include<iostream>
using namespace std;
int main()
{
  int a,b,c,i=1;
  int l_num;
  std::cin>>a>>b>>c;
  if((a<b && a>c) || (a>b && a<c))
  {
    std::cout<<"The treasure is in box which has number "<<a;
    if(c>a)
      l_num=c;
    else 
      l_num=b;
  }
  
  else if((b<a && b>c) || (b>a && b<c))
  {
    std::cout<<"The treasure is in box which has number "<<b;
    if(c>a)
      l_num=c;
    else 
      l_num=a;
  }
  else
  {
    std::cout<<"The treasure is in box which has number "<<c;
    if(b>a)
      l_num=b;
    else 
      l_num=a;
  }
  for(i=l_num;i>0;i--)
  {
        if(a%i==0 && b%i==0 && c%i==0)
        {
        std::cout<<"\nThe code to open the box is "<<i;
        break;
        }
  }
}