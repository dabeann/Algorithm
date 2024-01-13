#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>


int main(void){
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int a, b, c, arr[10];
    cin >> a >> b >> c;
    fill(arr, arr+10, 0);

    a = a * b * c;

    while(a>0){
        arr[a%10]++;
        a/=10;
    }

    for(int i=0; i<10; ++i)
        cout << arr[i] << '\n';

    return 0;
}