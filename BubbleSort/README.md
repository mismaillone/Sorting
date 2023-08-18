# Bubble Sort Algorithm

Bubble Sort is a simple sorting algorithm that works by repeatedly stepping through a list of items, comparing adjacent items, and swapping them if they're in the wrong order. The process is named "bubble sort" because smaller elements "bubble" to the top of the list while larger elements "sink" to the bottom.

## Algorithm Steps

1. Start at the beginning of the list.
2. Compare the first two elements. If the first element is greater than the second, swap them.
3. Move to the next pair of elements and repeat step 2.
4. Continue this process until you reach the end of the list. At this point, the largest element will have "bubbled up" to the last position.
5. Ignore the last element (since it's already in the correct place) and repeat steps 2-4 for the remaining unsorted elements.
6. Repeat steps 2-5 until the entire list is sorted.

## Example

Let's walk through an example using the list `[5, 2, 9, 1, 5]`:

### Step 1:
- Compare 5 and 2. Swap them: `[2, 5, 9, 1, 5]`
- Compare 5 and 9. No swap.
- Compare 9 and 1. Swap them: `[2, 5, 1, 9, 5]`
- Compare 9 and 5. Swap them: `[2, 5, 1, 5, 9]`

### Step 2:
- Compare 2 and 5. No swap.
- Compare 5 and 1. Swap them: `[2, 1, 5, 5, 9]`
- Compare 5 and 5. No swap.

### Step 3:
- Compare 2 and 1. Swap them: `[1, 2, 5, 5, 9]`

### Step 4:
- No swaps needed. The list is now sorted.

After applying the bubble sort algorithm to the initial list `[5, 2, 9, 1, 5]`, we get the sorted list `[1, 2, 5, 5, 9]`.

## Complexity Analysis

Bubble Sort has an average and worst-case time complexity of O(n^2), making it inefficient for large lists. It's mainly used for educational purposes and not recommended for practical applications with large datasets.
