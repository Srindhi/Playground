#include<stdio.h>
int main()
{
  int year,x;
  scanf("%d",&year);
  x=year%4;
  if(x!=0)
  {
    printf("Not Leap year\n");
  }
  else
    printf("Leap year\n");
  
  
  
  //Type your code here
  return 0;
}