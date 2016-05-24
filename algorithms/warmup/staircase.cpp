#include <stdio.h>

int main(int argc, char const *argv[])
{
	int count;
	scanf("%d", &count);

	for (int i = 0; i < count; i++)
	{
		for (int j = count; j > 0; j--)
		{
			if ( j <= i+1){
				printf("#");
			}
			else printf(" ");
		}
		printf("\n");
	}
	return 0;
}