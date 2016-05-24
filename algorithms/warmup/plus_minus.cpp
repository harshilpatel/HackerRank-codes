// harshil912@gmail.com
// hackerrank


#include <stdio.h>


int main(){
	int count;
	scanf("%d", &count);

	int items[count];
	long pos = 0;
	long negs = 0;
	long zeros = 0;
	for (int i = 0; i < count; ++i){
		scanf("%d", &items[i]);
		if ( items[i] == 0) zeros += 1;
		if ( items[i] > 0) pos += 1;
		if ( items[i] < 0) negs += 1;
	}

	printf("%f\n", (float)pos/count);
	printf("%f\n", (float)negs/count);
	printf("%f\n", (float)zeros/count);

	return 0;
}
