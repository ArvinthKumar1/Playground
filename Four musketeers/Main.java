#include<iostream>
using namespace std;
int main()
{
  float x1,x2,x3,y1,y2,y3;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  float d1,d2;
  d1=(x1+x2+x3)/3;
  d2=(y1+y2+y3)/3;
  std::cout<<d1<<"\n"<<d2;
  return 0;
}