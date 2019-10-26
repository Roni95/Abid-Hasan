#include <stdio.h>
#include <stdlib.h>

int main()
{
    int test,i;
    scanf("%d",&test);
    for (i=0;i<test ;i++ )
        Digit();
    return 0;
}
int Digit()
{
    int dig,j;
    scanf("%d",&dig);
    char str[1000];
    scanf("%s",str);
    int k ;
    for (k=0;k<dig ;k++ )
    {
        printf("%s",str);
        if(k+1!=dig)
            printf(" ");
        else
            printf("\n");
    }
}
