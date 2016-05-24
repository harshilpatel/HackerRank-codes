#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <iostream>


using namespace std;

int main(){
	int rows;
	cin >> rows;
	int items[rows][rows];
	int result = 0;
	int result2 = 0;
	for (int i = 0; i < rows; i++){
		for(int j = 0; j < rows; j++ ){
			cin >> items[i][j];
		}
	}

	for (int i = 0; i < rows; i++){
		result += items[i][i];
	}

	for (int i = rows-1; i >= 0; i--){
		result2 += items[i][rows-1-i];
	}
	printf("%d\n", abs(result - result2) );


	return 0;
}
