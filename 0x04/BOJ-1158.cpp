#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, k;
    cin >> n >> k;
    list<int> L = {};
    list<int> R = {};

    for(int i=0; i<n; i++) L.push_back(i+1);
    list<int>::iterator t = L.begin();
    advance(t, k-1);

    for(int i=0; i<n; i++){
        R.push_back(*t);
        t = L.erase(t);
        if(t == L.end()) t++;
        for(int j = 1; j<k; j++){
            t++;
            if(t == L.end()) t++;
        }
    }
    cout << '<';
    list<int>::iterator s = R.begin();
    for(int i=0; i<R.size(); i++){
        if(i == R.size()-1) cout << *s << '>';
        else cout << *s << ", ";
        s++;
    }
    cout << '\n';
    
}