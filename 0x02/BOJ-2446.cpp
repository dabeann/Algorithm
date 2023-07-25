#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>

int main() {
    
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n;
    cin >> n;

    for(int i = 0; i < n - 1; i++) {
        for(int j = 0; j < i; j++) cout << ' ';
        for(int j = 0; j < 2 * (n - i) - 1; j++) cout << '*';
        cout << "\n";
    }

    for(int j = 0; j < n - 1; j++) cout << ' ';
    cout << "*\n";

    for(int i = 1; i <= n - 1; i++) {
        for(int j = 1; j <= n - i - 1; j++) cout << ' ';
        for(int j = 1; j <= 2 * i + 1; j++) cout << '*';
        cout << "\n";
    }


    return 0;
}