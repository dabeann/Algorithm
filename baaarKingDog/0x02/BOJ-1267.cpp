#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>

int main() {
    
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n, Y=0, M=0;
    cin >> n;
    int a[10000];
    for (int i=0; i<n; i++) cin >> a[i];

    for (int i=0; i<n; i++){
        Y += ((a[i]/30) + 1) * 10;

        M += ((a[i]/60) + 1) * 15;
    }

    if(Y < M) cout << "Y " << Y;
    else if(Y > M) cout << "M " << M;
    else cout << "Y M " << Y;

    return 0;
}