#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>

int main() {
    
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    //card 1~20
    int a[1000];
    int b, c;
    for (int i=0; i<20; i++) a[i]=i+1;

    for (int i=0; i<10; i++){
        cin >> b >> c;
        
        std::reverse(a+(b-1), a+c);
    }

    for (int i=0; i<20; i++) cout << a[i] << ' ';


    return 0;
}