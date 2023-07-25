#include <stdio.h>

int main() {
    
    int N, total=0;
    scanf("%d", &N);

    for(int i=0; i<N; i++){
        if(i%3 == 0){
            total += i;
        }
        if(i%5 == 0){
            total += i;
        }
        if((i%3 == 0) && (i%5 == 0)){
            total -= i;
        }
    }

    printf("%d\n", total);


    return 0;
}
