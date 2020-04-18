#include<iostream>
#include<string>
int main() 
{ 
 std::string s;
 std::getline(std::cin,s);
  for(auto i=s.rbegin();i<s.crend();i++)
    std::cout<<*i;
}