#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>

int main() {
    
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n;
    cin >> n;

    for (int i=0; i<n; i++){
        for (int j=0; j<=i; j++) cout << '*';
        cout << '\n';
    }


    return 0;
}