/*
Divide- Dividing problem into smaller sub-problems.
Conquer- Solve sub-problems by calling recursively until solved.
Combine- Combine sub-problems to get the final solution.

Divide and Conquer should be used when the same subproblems are not evaluated many times.
Otherwise Dynamic Programming or Memoization should be used.

Typical structure:

DAC(a, i, j){
    if (small(a, i, j))
        return (Solution(a, i, j))
    else
        mid = divide(a, i, j)         //f1(n)
        b = DAC(a, i, mid)            //T(n/2)
        c = DAC(a, mid+1, j)          //T(n/2)
        d = combine(b, c)             //f2(n)

    return (d)
}

Recurrence relation:
In mathematics, a recurrence relation is an equation according to which the nth term
of a sequence of numbers is equal to some combination of the previous terms.

In computer science, Recurrence relations are used to determine the running time of recursive programs.

For a DAC Algorithm, Recurrence relation is as follows:
T(n) = f1(n) + 2T(n/2) + f2(n)

*/

#include <stdlib.h>
#include <stdio.h>

int maximum(int arr[], int start, int end)
{
    if (start == end)
    {
        return arr[start];
    }
    else if (start + 1 == end)
    {
        if (arr[start] >= arr[end])
        {
            return arr[start];
        }
        return arr[end];
    }
    else
    {
        int left_max = maximum(arr, start, (start + end) / 2);
        int right_max = maximum(arr, (start + end) / 2 + 1, end);
        if (left_max >= right_max)
        {
            return left_max;
        }
        return right_max;
    }
}

int main(void)
{
    int arr[10] = {0, 9, 1, 6, 5, 4, 8, 2, 3, 7};
    int max = maximum(arr, 0, 9);
    printf("%i\n", max);
    return 0;
}