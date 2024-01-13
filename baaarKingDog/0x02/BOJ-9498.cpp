#include <iostream>
#include <bits/stdc++.h>

int main() {
    
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int a;
    std::cin >> a;

    if(a>=90)
        std::cout << "A";
    else if(a>=80)
        std::cout << "B";
    else if(a>=70)
        std::cout << "C";
    else if(a>=60)
        std::cout << "D";
    else
        std::cout << "F";


    return 0;
}