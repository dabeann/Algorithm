#include <stdio.h>
#include <math.h>

int func4(int n);

int main() {
    
    printf("%d\n", func4(5));
    printf("%d\n", func4(97615282));
    printf("%d\n", func4(1024));


    return 0;
}

int func4(int n){
    
    int val = 1;
    while(2*val <=n){
        val *= 2;
    }

    return val;
}