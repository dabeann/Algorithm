#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int ans = 0;
    int n;
    cin >> n;

    while(n--){
        string str;
        cin >> str;

        stack<int> S;
        for(auto c : str){
            if(c == 'A'){
                if(S.size() == 0){
                    S.push(c);
                }
                else if(S.top() == 'A') S.pop();
                else{
                    S.push(c);
                }
            }
            else if(c == 'B'){
                if(S.size() == 0){
                    S.push(c);
                }
                else if(S.top() == 'B') S.pop();
                else{
                    S.push(c);
                }
            }
        }
        if(S.size() == 0){
            ans++;
        }
        
    }
    cout << ans;

    return 0;
}