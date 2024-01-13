#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>

int main() {
    
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n, a, b;
    cin >> n;

    for (int i=0; i<n; i++){
        cin >> a >> b;
        cout << a+b << '\n';
    }


    return 0;
}