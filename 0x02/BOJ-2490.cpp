#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>

int main() {
    
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int a[3][4];

    for (int i=0; i<3; i++){
        cin >> a[i][0] >> a[i][1] >> a[i][2] >> a[i][3];
    }

    for (int i=0; i<3; i++){
        int cnt = count(a[i], a[i]+4, 1);
        if(cnt == 0)
            cout << "D\n";
        else if(cnt == 1)
            cout << "C\n";
        else if(cnt == 2)
            cout << "B\n";
        else if(cnt == 3)
            cout << "A\n";
        else
            cout << "E\n";
    }

    return 0;
}