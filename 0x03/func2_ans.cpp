#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#include <algorithm>

int func2(int arr[], int N){
  int occur[101] = {};
  for(int i = 0; i < N; i++){
    if(occur[100-arr[i]] == 1)
      return 1;
    occur[arr[i]] = 1;
  }
  return 0;
}

/*

0x01강의 연습 문제 2

주어진 길이 N의 int 배열 arr에서 합이 100인 서로 다른 위치의
두 원소가 존재하면 1을, 존재하지 않으면 0을 반환하는 함수
func2(int arr[], int N)을 작성하라.
arr의 각 수는 0 이상 100 이하이고 N은 1000 이하이다.

-------------------------------------------------------

이전에는 모든 쌍을 살펴보며 합이 100이 되는 쌍의 존재 여부를 확인했다.
이번에는 수를 차례로 하나씩 읽으면서 이전에 등장한 수 중에서 
지금 보고 있는 수와 더해 100이 되는 수가 있는지를 체크한다.

*/