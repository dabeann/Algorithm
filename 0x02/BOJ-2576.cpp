#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>

int main() {
    
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int a[7], min=0, total=0;

    for (int i=0; i<7; i++){
        cin >> a[i];
    }

    for (int i=0; i<7; i++){
        if(a[i]%2 != 0){
            total += a[i];
            if((min == 0) || (min > a[i]))
                min = a[i];
        }
    }

    if(min == 0)
        cout << -1;
    else
        cout << total << '\n' << min;

    return 0;
}