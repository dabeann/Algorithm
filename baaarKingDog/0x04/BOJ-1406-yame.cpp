#include <bits/stdc++.h>
using namespace std;

const int MX = 1000005;
char dat[MX];
int pre[MX], nxt[MX];
int unused = 1;

void insert(int addr, char num){
    dat[unused] = num;
    pre[unused] = addr;
    nxt[unused] = nxt[addr];
    if(nxt[addr] != -1) pre[nxt[addr]] = unused; 
    /*맨 마지막 원소 뒤에 새 원소를 추가하는 상황일 때, 삽입할 위치의 다음 원소가
    존재하지 않는다.*/
    nxt[addr] = unused;
    unused++;
}

void erase(int addr){
    nxt[pre[addr]] = nxt[addr];
    if(nxt[addr] != -1) pre[nxt[addr]] = pre[addr];
    /*제일 마지막 원소를 지우는 상황에서 nxt[addr]이 -1일 수 있기 때문*/
}

void traverse(){
  int cur = nxt[0];
  while(cur != -1){
    cout << dat[cur];
    cur = nxt[cur];
  }
}

int main(void){
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    fill(pre, pre+MX, -1);
    fill(nxt, nxt+MX, -1);
    string str;
    cin >> str;
    int t=0;
    for(auto c : str){
        insert(t, c);
        t++;
    }

    int n; //명령어의 개수
    cin >> n;
    char m, k; //명령어, 문자
    for(int i=0; i<n; i++){
        cin >> m ;
        
        if(m == 'L' && pre[t] != -1) t = pre[t];
        else if(m == 'D' && nxt[t] != -1) t = nxt[t];
        else if(m == 'B' && pre[t] != -1){
            erase(t);
            t = pre[t];
        }
        else if(m == 'P'){
            cin >> k;
            insert(t, k);
            t = nxt[t];
        }
        
    }
    
    traverse();

    return 0;
}