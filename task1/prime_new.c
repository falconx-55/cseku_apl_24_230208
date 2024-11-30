#include <stdio.h>
#include <math.h>

// Function to check if a number is prime
int isPrime(int num)
{
    if (num <= 1) return 0;
    for (int i = 2; i <= sqrt(num); i++)
    {
        if (num % i == 0) return 0;
    }
    return 1;
}

// Function to get user input
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

    if (isPrime(num))
        printf("%d is a prime number.\n", num);
    else
        printf("%d is not a prime number.\n", num);

    return 0;
}
