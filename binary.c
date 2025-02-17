#include <stdio.h>
#define SIZE 10

// Binary Search function (Recursive)
int binarySearch(int a[], int key, int left, int right) {
    int mid;
    while (left <= right) {
        mid = (left + right) / 2;
        if (key == a[mid]) {
            return mid;  // Key found, return index
        } else if (key < a[mid]) {
            return binarySearch(a, key, left, mid - 1);  // Search left half
        } else {
            return binarySearch(a, key, mid + 1, right);  // Search right half
        }
    }
    return -1;  // Key not found
}

int main() {
    int a[SIZE];
    int i, key, result;

    // Input sorted array
    printf("Enter 10 array elements in sorted order:\n");
    for (i = 0; i < SIZE; i++) {
        scanf("%d", &a[i]);
    }

    // Search key
    printf("Enter element to search: ");
    scanf("%d", &key);

    // Perform binary search
    int left = 0, right = SIZE - 1;
    result = binarySearch(a, key, left, right);

    // Print result
    if (result == -1) {
        printf("Key not found\n");
    } else {
        printf("Key is found at index %d\n", result);
    }

    return 0;
}
