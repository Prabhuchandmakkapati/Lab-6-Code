#include <stdio.h>
#include<conio.h>
int main()
{
int arr_sort[]={1, 29, 14, 15, 94};
int n, i, j,k, pos, temp;
n=5;

for (i = 0;i<(n-1);i++ )
{
pos = i;

for (j =i+1;j<n;j++ )
{
if (arr_sort[pos]>arr_sort[j])
pos=j;
}
if (pos!=i)
{
temp = arr_sort[i];
arr_sort[i] = arr_sort[pos];
arr_sort[pos] = temp;
}
//print all iteration after the sorting
for(k=0;k<n;k++)
{
printf("%d ", arr_sort[k]);

}
printf("\n\n");
}

printf("\nFinal sorting using Selection sort:\n");

for (i=0 ;i<n;i++ )
{
printf("%d ", arr_sort[i]);
}

printf("\n");

return 0;
}