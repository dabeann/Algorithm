#include <bits/stdc++.h>
using namespace std;

const int MX = 1000005;
int dat[MX];
int pos = 0;

void push(int x){
    dat[pos++] = x;
}

void pop(){
    pos--;
}

int top(){
    return dat[pos-1];
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;

    for(int i=0; i<n; i++){
        string op;
        cin >> op;
        if(op.compare("push") == 0){
            int x;
            cin >> x;
            push(x);
        }
        else if(op.compare("pop") == 0){
            if(!pos) cout << -1 << '\n';
            else{
                cout << top() << '\n';
                pop();
            }
        }
        else if(op.compare("size") == 0) cout << pos << '\n';
        else if(op.compare("empty") == 0){
            if(pos) cout << 0 << '\n';
            else cout << 1 << '\n';
        }
        else{
            if(!pos) cout << -1 << '\n';
            else cout << top() << '\n';
        }
    }


    return 0;
}