#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>


int main(void){
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n, arr[26], arrr[26], ans=0;
    string str, strf;

    cin >> n;

    for(int i=0; i<n; i++){
        cin >> str >> strf;
        fill(arr, arr+26, 0);
        fill(arrr, arrr+26, 0);
        ans = 0;
        for (char c : str){
            arr[c-'a'] ++;
        }
        for (char c : strf){
            arrr[c-'a'] ++;
        }
        for(int j=0; j<26; j++){
            if(arr[j] != arrr[j]){
                cout << "Impossible\n";
                ans = 1;
                break;
            }
        }
        if(ans == 0)cout << "Possible\n";
    }

    return 0;
}