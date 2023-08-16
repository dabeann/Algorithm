#include <bits/stdc++.h>
using namespace std;

void func1(int n){
    if(n == 0) return;
    cout << n << ' ';
    func1(n-1);
} // n부터 1까지 출력

int func2(int n){
    if(n == 0) return 0;
    return n+func2(n-1);
} // 1부터 n까지의 합


int main(void){
    ios::sync_with_stdio(0);
    cin.tie(0);

    func1(3);
    cout << func2(3);

    return 0;
}