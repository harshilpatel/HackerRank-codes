#include <string.h>
#include <stdio.h>


int main(){
	int count;
	scanf(" %d", &count);

	long items[count];
	long result=0;

	for (int i = 0; i < count; ++i)
	{
		scanf("%ld", &items[i]);
		result += items[i];
	}

	printf("%ld\n", result);
}