#include <stdio.h>
#include <stdlib.h>

int simpleArraySum(int* array, int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += array[i];
    }
    return sum;
}

int main() {
    int n; 
    scanf("%d", &n);
    int *array = malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++){
       scanf("%d", &array[i]);
    }
    printf("%d\n", simpleArraySum(array, n));
    return 0;
}

