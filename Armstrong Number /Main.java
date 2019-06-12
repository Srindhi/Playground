#include <stdio.h>
#include<math.h>
int main() 
{
  int n,i,sum=0,temp,r,l;
  scanf("%d",&n);
  temp=n;
  l=n%10;
  while(n>0)
  {
    r=n%10;
    sum=sum+pow(r,l);
    n=n/10;
  }
  if( temp==sum )
  {
    printf("Armstrong Number\n");
  }
    else
      printf("Not an Armstrong Number\n");
 
  

  


  
  
	//Type your code
	return 0;
}