#include <string>
#include <iostream>
#include <stdio.h>
#include <algorithm>

using namespace std;
int main(){
    int test;
    cin >> test;
    for(int i=0; i<test; i++){
        string input_string;
        cin >> input_string;
        
        if( input_string.length() % 2 != 0){
            cout << "-1" << endl;
            continue;
        }
        
        int length = input_string.length();
        string a = input_string.substr(0 , length/2);
        string b = input_string.substr(length/2, length);
        
        sort(a.begin(), a.end());
        sort(b.begin(), b.end());

        long change = 0;
        for(long j=0; j<length/2;j++){
            if(a[j] != b[j]){
                change++;
            }
        }
        
        cout << change << endl;
        
    }
    return 0;
}