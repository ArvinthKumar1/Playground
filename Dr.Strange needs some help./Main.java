#include<iostream>
#include<cmath>
using namespace std;
int check_bacteria(int,int,int);
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if(check_bacteria(a,b,c))
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}
int check_bacteria(int x,int y,int z)
{
  int k=pow(x,y);
  if(k>=z)
    return 1;
  else
    return 0;
}
  
