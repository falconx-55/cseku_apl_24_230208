#include <stdio.h>

// Function to print Fibonacci series up to n terms
void printFibonacci(int n)
{
    int t1 = 0, t2 = 1, nextTerm;
    for (int i = 1; i <= n; i++)
    {
        printf("%d ", t1);
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
    }
    printf("\n");
}

// Function to get the number of terms from the user
int getNumberOfTerms()
{
    int n;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    return n;
}

int main()
{
    int n = getNumberOfTerms();
    printf("Fibonacci Series: ");
    printFibonacci(n);
    return 0;
}
