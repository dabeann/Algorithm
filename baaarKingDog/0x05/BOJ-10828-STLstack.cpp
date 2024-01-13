#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    stack<int> S;

    int n;
    cin >> n;

    for(int i=0; i<n; i++){
        string op;
        cin >> op;
        if(op.compare("push") == 0){
            int x;
            cin >> x;
            S.push(x);
        }
        else if(op.compare("pop") == 0){
            if(S.empty()) cout << -1 << '\n';
            else{
                cout << S.top() << '\n';
                S.pop();
            }
        }
        else if(op.compare("size") == 0) cout << S.size() << '\n';
        else if(op.compare("empty") == 0) cout << S.empty() << '\n';
        else{
            if(S.empty()) cout << -1 << '\n';
            else cout << S.top() << '\n';
        }
    }


    return 0;
}