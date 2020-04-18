#include<iostream>
#include<cstdlib>
int main(){
  int n,ac=0,bc=0;
  std::cin>>n;
  int *p=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    std::cin>>p[i];
  }
  for(int i=0;i<n;i++)
  {
    if(p[i]%2==0)
      ac+=1;
    else
      bc+=1;
  }
  std::cout<<bc<<"\n"<<ac;
  free(p);
  return 0;
}