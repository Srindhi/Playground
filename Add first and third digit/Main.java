#include<stdio.h>
int main()
{
  int n;
  int first,last,sum;
 
  
  scanf("%d",&n);
  first=n/100;
  last=(n%100)%10;
  sum=first+last;
  printf("%d\n",sum);
  
  
  
  
  //Type your code here
  return 0;
}