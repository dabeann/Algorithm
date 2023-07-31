#include <bits/stdc++.h>
using namespace std;

const int MX = 1000005;
int dat[MX];
int head = 0, tail = 0;

void push(int x){
    dat[tail++] = x;
}

void pop(){
    head++;
}

int front(){
    return dat[head];
}

int back(){
    return dat[tail-1];
}


int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;

    for (int i=0; i<n; i++){
        string op;
        cin >> op;

        if(op == "push"){
            int x;
            cin >> x;
            push(x);
        }
        else if(op == "pop"){
            if(tail==head) cout << -1 << '\n';
            else{
                cout << front() << '\n';
                pop();
            }
        }
        else if(op == "size") cout << tail-head << '\n';
        else if(op == "empty"){
            if(tail==head) cout << 1 << '\n';
            else cout << 0 << '\n';
        }
        else if(op == "front"){
            if(tail==head) cout << -1 << '\n';
            else cout << front() << '\n';
        }
        else{
            if(tail==head) cout << -1 << '\n';
            else cout << back() << '\n';
        }

    }
}