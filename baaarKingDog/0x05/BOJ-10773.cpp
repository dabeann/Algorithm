#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    stack<int> S;

    int k;
    cin >> k;
    int n, total = 0;

    for(int i=0; i<k; i++){
        cin >> n;

        if(n){
            S.push(n);
            total += n;
        }
        else{
            total -= S.top();
            S.pop();
        }
    }

    cout << total;

    return 0;
}