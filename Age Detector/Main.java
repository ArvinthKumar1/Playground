#include<iostream>
using namespace std;
int main()
{
  int year,c_year;
  std::cin>>year>>c_year;
  (year<c_year)?std::cout<<(c_year-year):std::cout<<(100-year+c_year);
}