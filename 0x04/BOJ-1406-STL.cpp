#include <bits/stdc++.h>
using namespace std;

int main(void){
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    list<char> L = {};
    string str;
    cin >> str;

    for(char c : str) L.push_back(c);

    list<char>::iterator t = L.end(); //커서는 맨 끝을 나타냄

    int n; //명령어의 개수
    cin >> n;
    char m, k; //명령어, 문자
    for(int i=0; i<n; i++){
        cin >> m ;
        
        if(m == 'L' && t != L.begin()) t--;
        else if(m == 'D' && t != L.end()) t++;
        else if(m == 'B' && t != L.begin()){
            t--;
            t = L.erase(t);
        }
        else if(m == 'P'){
            cin >> k;
            L.insert(t, k);
        }
        
    }
    
    for(auto i : L) cout << i;

    return 0;
}