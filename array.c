#include<stdio.h>
void main()
{
int N,K,a[10000],sum=0;
scanf("%d%d",&N,&K);
for(i=1;i<=N;i++)
{
scanf("%d",&a[i]);
}for(i=1;i<K;i++)
{
sum=sum+a[i];
}
printf("%d",sum);
}
