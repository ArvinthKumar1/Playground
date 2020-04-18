#include<iostream>
using namespace std;
int main()
{
  int s,m,t,w,th,f,sa,sum;
  int we;
  std::cin>>s>>m>>t>>w>>th>>f>>sa;
  we=m+t+w+th+f+sa+s;
  if(s<=8)
  {
    int sunday=s*100;
    sum=sum+sunday+(sunday*0.5);
  }
  else
  {
    int e=s-8;
    s=8;
    sum=sum+(s*100)+(s*100*0.5)+(e*115*0.5);
  }
  if(m<=8)
    sum=sum+(m*100);
  else
  {
    int e=m-8;
    m=8;
    sum=sum+(m*100)+(e*15)+(e*100);
  }
  if(t<=8)
    sum=sum+(t*100);
  else
  {
    int e=t-8;
    t=8;
    sum=sum+(t*100)+(e*15)+(e*100);
  }
  if(w<=8)
    sum=sum+(w*100);
  else
  {
    int e=w-8;
    w=8;
    sum=sum+(w*100)+(e*15)+(e*100);
  }
  if(th<=8)
    sum=sum+(th*100);
  else
  {
    int e=th-8;
    th=8;
    sum=sum+(th*100)+(e*15)+(e*100);
  }
  if(f<=8)
    sum=sum+(f*100);
  else
  {
    int e=f-8;
    f=8;
    sum=sum+(f*100)+(e*15)+(e*100);
  }
  if(sa<=8)
  {
    int sat=sa*100;
    sum=sum+sat+(sat*0.25);
  }
  else
  {
    int e=sa-8;
    sa=8;
    sum=sum+(sa*100)+(sa*100*0.25)+(e*15*0.25)+(e*100*0.25);
  }
  if(we<=40)
  std::cout<<sum;
  else
  {
    int extra=we-40;
    extra=extra*25;
    std::cout<<sum;
  }
}