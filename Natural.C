#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    long long sum_loop = 0, sum_formula = 0; // Use long long to handle large sums

    printf("Enter a positive integer n: ");
    if (scanf("%d", &n) != 1) {
        printf("Invalid input. Please enter an integer.\n");
        return 1;
    }

    if (n <= 0) {
        printf("n must be a positive integer.\n");
        return 1;
    }

    // Method 1: Using a loop
    for (int i = 1; i <= n; i++) {
        sum_loop += i;
    }
    sum_formula = (long long)n * (n + 1) / 2;

    printf("\nSum of first %d natural numbers (loop method): %lld\n", n, sum_loop);
    printf("Sum of first %d natural numbers (formula method): %lld\n", n, sum_formula);

    return 0;
}
