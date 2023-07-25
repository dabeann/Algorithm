#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>

int main() {
    
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    long long a, b, temp;
    cin >> a >> b;
    if ( a > b ){
        temp = a;
        a = b;
        b = temp;
    }

    if( a == b || b-a == 1){
        cout<<0;
    }
    else{
        cout << b-a-1 << '\n';
        for (long long i=a+1; i<b; i++){
            cout << i << ' ';
        }
    }

    return 0;
}