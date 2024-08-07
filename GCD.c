#include<stdio.h>
 int main(){
    int num1,num2,temp;
    printf("enter the first number:");
    scanf("%d",&num1);
    printf("enter the second number:");
    scanf("%d",&num2);

    while(num2!=0);{

        temp=num2;
        num2=num1%num2;
        num1=temp;
    }

     printf("GCD of the number is %d",num1) ; 

    return 0;
}
