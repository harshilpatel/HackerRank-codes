#include <stdio.h>
#include <string.h>

int main(){
    int size;
    scanf("%d", &size);
    
    int items[size];
    int result = 0;
    for (int i=0; i<size; i++){
        scanf("%d", &items[i]);
        result += items[i];
    }
    
    printf("%d\n", result);
    
    return 0;
}
