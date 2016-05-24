#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <iostream>
// #include <sstream>

using namespace std;


int main(){
    int sample_int;
    int teams[sample_int];
    int count;
    cin >> count;

    for (int i = 0; i < count; ++i){
        cout << &teams[i] << " ";
    }
    cout << "\n";
    return 0;   
}