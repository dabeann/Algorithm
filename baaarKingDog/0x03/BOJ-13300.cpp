#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>


int main(void){
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n, k, s, y, ans=0; //여자 s0 남자 s1
    int f[6], m[6];
    fill(f, f+6, 0);
    fill(m, m+6, 0);

    cin >> n >> k;
    for(int i=0; i<n; i++){
        cin >> s >> y;
        if(s==0) f[y-1] += 1;
        else m[y-1] += 1;
    }

    for(int i=0; i<6; i++){
        ans += f[i]/k;
        ans += m[i]/k;
        if(f[i]%k) ++ans;
        if(m[i]%k) ++ans;
    }

    cout << ans;

    return 0;
}