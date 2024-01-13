#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>


int main(void){
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    string str, strf;
    int arr[26], arrr[26], ans=0;

    cin >> str >> strf;
    fill(arr, arr+26, 0);
    fill(arrr, arrr+26, 0);
    
    for (char c : str){
        arr[c-'a'] ++;
    }
    for (char c : strf){
        arrr[c-'a'] ++;
    }
    for(int j=0; j<26; j++){
        if(arr[j] != arrr[j]){
            if(arr[j] > arrr[j]) ans += arr[j]-arrr[j];
            else ans += arrr[j] - arr[j];
        }
    }
    cout << ans;

    return 0;
}