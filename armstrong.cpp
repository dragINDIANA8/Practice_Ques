#include<iostream>
using namespace std;
int main(){
    int num,onum,rem,res=0;
    cout<<"enter the number: ";
    cin>>num;
    onum=num;
    while(onum!=0)
    {
        rem=onum%10;
        //or we can write res+=rem*rem*rem;
        res=res+rem*rem*rem;
        //or we an write onum/=10;
        onum=onum/10;
    }
    if(res==num)
    cout<<num<<" is an armstrong number";
    else
    cout<<num<<" is not an armstrong number";

    return 0;
}