#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>

int main() {
    
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n;
    cin >> n;

    for (int i=n-1; i>=0; i--){
        for (int j=n-1; j>i; j--) cout << ' ';
        for (int j=0; j<=i; j++) cout << '*';
        cout << '\n';
    }


    return 0;
}