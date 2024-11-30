#include <stdio.h>

// Function to calculate the sum of even or odd numbers
int sumOfNumbers(int n, int isEven)
{
    int sum = 0;
    for (int i = 1; i <= n; i++)
    {
        if ((isEven && i % 2 == 0) || (!isEven && i % 2 != 0))
        {
            sum += i;
        }
    }
    return sum;
}

// Function to get user choice
int getUserChoice()
{
    int choice;
    do
    {
        printf("Do you want to sum (1) odd or (2) even numbers? ");
        scanf("%d", &choice);
    } while (choice != 1 && choice != 2);
    return choice;
}

int main()
{
    int n, choice;
    printf("Enter a number: ");
    scanf("%d", &n);

    choice = getUserChoice();

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
