#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
    
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int a, b, c;
    cin >> a >> b >> c;

    if((a==b) && (b==c))
        cout << 10000+(a*1000);
    else if(((a==b)&&(b!=c)) || ((a==c)&&(b!=c)))
        cout << 1000+(a*100);
    else if((c==b)&&(b!=a))
        cout << 1000+(c*100);
    else
        cout << max({a,b,c})*100;

    return 0;
}