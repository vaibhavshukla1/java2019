#include<stdio.h>
void main()
{
int m,n,b;
scanf("%d%d%d",&m,&n,&b);
if((m>n)&&(m>b))
{
printf("%d",m," is greater");
}
else if((n>m)&&(n>b))
{
printf("%d",n," is greater");
}
else{
printf("%d",b," is greater");
}
}
