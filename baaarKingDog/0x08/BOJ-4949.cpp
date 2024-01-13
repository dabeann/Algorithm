#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int ans;

    while(1){
        string str;
        getline(cin, str);
        if(str.compare(".") == 0) break;

        ans = 0;
        stack<int> S;
        for(auto c : str){
            if(c == '(' || c == '[') S.push(c);
            else if(c == ')'){
                if(S.size() == 0){
                    cout << "no\n";
                    ans = 1;
                    break;
                }
                else if(S.top() == '(') S.pop();
                else{
                    cout << "no\n";
                    ans = 1;
                    break;
                }
            }
            else if(c == ']'){
                if(S.size() == 0){
                    cout << "no\n";
                    ans = 1;
                    break;
                }
                else if(S.top() == '[') S.pop();
                else{
                    cout << "no\n";
                    ans = 1;
                    break;
                }
            }
        }
        if (ans == 1) continue;
        else if(S.size() == 0){
            cout << "yes\n";
        }
        else cout<< "no\n";
    }
    


    

    return 0;
}