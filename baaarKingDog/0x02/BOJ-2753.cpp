#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
    
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int a;
    cin >> a;

    if((a%4 == 0)&&(a%100 != 0))
        cout<<1;
    else if(a%400 == 0)
        cout<<1;
    else
        cout<<0;


    return 0;
}