#include <stdio.h>

// Function to calculate the factorial of a number
int factorial(int num)
{
    if (num == 0)
        return 1;
    return num * factorial(num - 1);
}

// Function to get a number from the user
int getUserNumber()
{
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);
    return num;
}

int main()
{
    int num = getUserNumber();
    printf("Factorial of %d is %d\n", num, factorial(num));
    return 0;
}
