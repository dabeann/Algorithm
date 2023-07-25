#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>

int main() {
    
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n, max=0, maxidx=0;

    for (int i=0; i<9; i++){
        cin >> n;
        if(n > max){
            max = n;
            maxidx = i+1;
        }

    }

    cout << max << '\n' << maxidx;

    return 0;
}