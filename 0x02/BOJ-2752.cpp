#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
    
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int a, b, c;
    cin>> a >> b >> c;

    int d, e, f;
    d = min({a, b, c});
    f = max({a, b, c});
    e = a+b+c-d-f;
    cout<<d<<' '<<e<<' '<<f;


    return 0;
}