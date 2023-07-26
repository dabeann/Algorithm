#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>


int main(void){
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n, arr[1000], v, ans=0;
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> arr[i];
    }
    cin >> v;

    for(int i=0; i<n; i++){
        if(arr[i] == v)
            ans++;
    }
    cout << ans;

    return 0;
}