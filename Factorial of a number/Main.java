#include <stdio.h>
int main() 
{
  int i,n,fact=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    fact=(fact*i);
  }
  printf("%d",fact);
	//Type your code
	return 0;
}