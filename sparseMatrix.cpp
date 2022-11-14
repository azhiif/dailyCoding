#include <stdio.h>
using namespace std;

int main()
{
    int a[10][10], s[3][100], r, c, k = 0, value = 0;

    printf("ENTER NUMBER OF ROW AND COLOUMN IN MATRIC : ");
    scanf("%d  %d", &r, &c);

    // READ ELEMENTS FOR ARRAY

    printf("enter elements in matrix : \n");

    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {

            scanf("%d", &a[i][j]);
        }
    }

    // printf the matric

    printf("THE GIVEN MATRIC IS :    \n");

    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            printf("%d", a[i][j]);
        }
        printf("\n");
    }

    // CONVERT INTO SPARSE

    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            if (a[i][j] != 0)
            {
                value++;

                s[0][k] = i;
                s[1][k] = j;
                s[2][k] = a[i][j];
                k++;
            }
        }
    }

    // print sparse

    printf("sparce \n");

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < value; j++)
        {
            printf("%d", s[i][j]);
        }
        printf("\n");
    }
}