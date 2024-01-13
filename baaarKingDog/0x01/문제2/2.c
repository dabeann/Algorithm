#include <stdio.h>

int func2(int arr[], int n);

int main() {
    
    int arr1[] = {1, 52, 48};
    int arr2[] = {50, 42};
    int arr3[] = {4, 13, 63, 87};

    printf("%d\n", func2(arr1, 3));
    printf("%d\n", func2(arr2, 2));
    printf("%d\n", func2(arr3, 4));


    return 0;
}

int func2(int arr[], int n){
    for (int i=0; i<n; i++){
        for (int j= i+1; j<n; j++){
            if(arr[i] + arr[j] == 100){
                return 1;
            }
        }
    }
    return 0;
}