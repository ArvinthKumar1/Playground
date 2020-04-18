#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
    std::cin>>arr[i];
  int c,t=0;
  std::cin>>c;
  for(int i=0;i<n;i++)
  {
    if(c==arr[i])
      t=1;
  }
  if(t==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
}