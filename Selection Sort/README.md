# Selection Sort Algorithm

Selection Sort is a simple sorting algorithm that works by dividing the array into two parts: the sorted part and the unsorted part. It repeatedly selects the smallest (or largest) element from the unsorted part and swaps it with the first element of the unsorted part.

## Algorithm Steps

1. Find the smallest element in the unsorted part of the array.
2. Swap the smallest element with the first element of the unsorted part.
3. Move the boundary between the sorted and unsorted parts one step to the right.
4. Repeat steps 1-3 until the entire array is sorted.

## Example

Let's walk through an example using the list `[5, 2, 9, 1, 5]`:

### Step 1:
- Find the smallest element (1) in the unsorted part (the whole array).
- Swap it with the first element (5): `[1, 2, 9, 5, 5]`

### Step 2:
- Move the boundary between sorted and unsorted parts to the right (excluding the first element).
- Find the smallest element (2) in the unsorted part (`[2, 9, 5, 5]`).
- Swap it with the first element of the unsorted part (2 with 2, no change): `[1, 2, 9, 5, 5]`

### Step 3:
- Move the boundary to the right again (excluding the first two elements).
- Find the smallest element (5) in the unsorted part (`[9, 5, 5]`).
- Swap it with the first element of the unsorted part (5 with 9): `[1, 2, 5, 9, 5]`

### Step 4:
- Move the boundary to the right (excluding the first three elements).
- Find the smallest element (5) in the unsorted part (`[5, 5]`).
- Swap it with the first element of the unsorted part (5 with 5, no change): `[1, 2, 5, 9, 5]`

### Step 5:
- Move the boundary to the right (excluding the first four elements).
- Find the smallest element (5) in the unsorted part (`[5]`).
- Swap it with the first element of the unsorted part (5 with 9): `[1, 2, 5, 5, 9]`

The array is now sorted: `[1, 2, 5, 5, 9]`.

## Complexity Analysis

Selection Sort has an average and worst-case time complexity of O(n^2), making it inefficient for large lists. Similar to Bubble Sort, it's mainly used for educational purposes and not recommended for practical applications with large datasets.
