#include <stdio.h>
#include <math.h>

int func3(int n);

int main() {
    
    printf("%d\n", func3(9));
    printf("%d\n", func3(693953651));
    printf("%d\n", func3(756580036));


    return 0;
}

int func3(int n){
    
    int squareRoot = (int)sqrt(n);
    if(squareRoot * squareRoot == n)
        return 1;
    else
        return 0;
    
    return 0;
}