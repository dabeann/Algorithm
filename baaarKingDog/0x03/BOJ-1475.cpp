#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>


int main(void){
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n, arr[10];
    cin >> n;
    fill(arr, arr+10, 0);

    while(n > 0){
        
        arr[n%10]++;

        n /= 10;
    }

    int max=0;
    for (int i=0; i<10; i++){
        if(i==6 || i==9) continue;
        if(arr[i]>max){
            max = arr[i];
        }
    }

    if((arr[6]+arr[9]+1)/2 > max) max = (arr[6]+arr[9]+1)/2;

    cout << max;

    return 0;
}