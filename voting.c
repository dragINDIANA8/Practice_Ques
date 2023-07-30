#include<stdio.h>
int main(){
    int age;
    while(1)
    {
    printf("enter the age:");
    scanf("%d",&age);
    if(age>=18)
    printf("\nELIGIBLE FOR VOTE\n");
    else
    printf("\nNOT ELIGIBLE FOR VOTE\n");
    }
    return 0;
}
