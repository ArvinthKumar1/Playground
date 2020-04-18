#include<iostream>
using namespace std;
int main()
{
  int w,a,c;
  std::cin>>w>>a>>c;
  (w>=((a*75)+(c*30)))?std::cout<<"Boat is stable":std::cout<<"Boat will drow";
}