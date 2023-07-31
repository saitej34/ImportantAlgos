#include <stdio.h>
#include<stdlib.h>
int main()
{
    int n;
    printf("Enter the n value : ");
    scanf("%d",&n);
    int *ptr = (int*)malloc(n*sizeof(int));
    for(int i=0;i<n;i++)
    {
        int k;
        scanf("%d",&k);
        ptr[i] = k;
    }
    for(int i=0;i<n;i++)
    {
        printf("%d\t",ptr[i]);
    }
    return 0;
}
