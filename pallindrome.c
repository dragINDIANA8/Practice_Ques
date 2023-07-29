#include <stdio.h>
int main()
{
    int n, r, temp, sum = 0;
    printf("enter the number:");
    scanf("%d", &n);
    temp = n;
    while (n > 0)
    {
        r = n % 10;
        sum = (sum * 10) + r;
        n = n / 10;
    }
    if (temp == sum)
        printf("number is pallindrome");
    else
        printf("number is not pallindrome");

    return 0;
}