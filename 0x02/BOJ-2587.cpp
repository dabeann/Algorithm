#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>

int main() {
    
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int a[5], avg = 0, mid = 0;

    for (int i=0; i<5; i++){
        cin >> a[i];
    }
    
    avg = std::accumulate(std::begin(a), std::end(a), 0) / 5;
    sort(a, a+5);

    cout << avg << '\n' << a[2];

    return 0;
}