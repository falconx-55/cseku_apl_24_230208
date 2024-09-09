#include <stdio.h>

int sumOfNumbers(int n, int even)
{
    int sum = 0;
    for (int i = 1; i <= n; i++)
    {
        if (even && i % 2 == 0)
        {
            sum += i;
        }
        else if (!even && i % 2 != 0)
        {
            sum += i;
        }
    }
    return sum;
}

int main()
{
    int n, choice;
    printf("Enter a number: ");
    scanf("%d", &n);

    do
    {
        printf("Do you want to sum (1) odd or (2) even numbers? ");
        scanf("%d", &choice);
    } while (choice != 1 && choice != 2);

    if (choice == 1)
    {
        printf("Sum of odd numbers up to %d is %d\n", n, sumOfNumbers(n, 0));
    }
    else
    {
        printf("Sum of even numbers up to %d is %d\n", n, sumOfNumbers(n, 1));
    }

    return 0;
}
