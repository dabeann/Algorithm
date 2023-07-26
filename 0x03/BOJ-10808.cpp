#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>


int main(void){
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    string str;
    cin >> str;
    //a = 97

    int a[26];
    fill(a, a+26, 0);

    for (char c : str){
        int idx = c-97;
        a[idx] += 1;
    }

    for (int i=0; i<26; i++)
        cout << a[i] << ' ';


    return 0;
}