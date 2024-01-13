#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int ans;
    int n;
    cin >> n;

    while(n--){
        string str;
        cin >> str;

        ans = 0;
        stack<int> S;
        for(auto c : str){
            if(c == '(') S.push(c);
            else if(c == ')'){
                if(S.size() == 0){
                    cout << "NO\n";
                    ans = 1;
                    break;
                }
                else if(S.top() == '(') S.pop();
                else{
                    cout << "NO\n";
                    ans = 1;
                    break;
                }
            }
        }
        if (ans == 1) continue;
        else if(S.size() == 0){
            cout << "YES\n";
        }
        else cout<< "NO\n";
    }

    return 0;
}