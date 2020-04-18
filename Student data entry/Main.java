#include <iostream>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   student s1;
  std::cin.getline(s1.name,50)>>s1.roll>>s1.marks;
  std::cout<<"\nStudent Details \n"<<"Name: "<<s1.name<<"\n";
  std::cout<<"Roll: "<<s1.roll;
  std::cout<<"\nMarks: "<<s1.marks;
}