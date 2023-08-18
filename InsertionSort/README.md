# Insertion Sort Algorithm

Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time. It's similar to the way you sort a hand of playing cards: you pick one card and insert it into its correct position among the already sorted cards.

## Algorithm Steps

1. Start with the second element (index 1) and assume the first element is sorted.
2. Compare the current element with the elements before it in the sorted portion of the array.
3. Move the compared elements one position ahead to make space for the current element.
4. Repeat steps 2 and 3 until you find the correct position for the current element.
5. Move to the next element and repeat steps 2-4 until the entire array is sorted.

## Example

Let's walk through an example using the list `[5, 2, 9, 1, 5]`:

### Step 1:
- Start with the second element, which is 2.
- Compare 2 with the elements before it (5). Move 5 one position ahead to make space.
- Insert 2 into the first position: `[2, 5, 9, 1, 5]`

### Step 2:
- Move to the next element, which is 9.
- Compare 9 with the elements before it (5 and 2). No need to move elements.
- Insert 9 into its position: `[2, 5, 9, 1, 5]`

### Step 3:
- Move to the next element, which is 1.
- Compare 1 with the elements before it (9, 5, and 2). Move 9, 5, and 2 one position ahead.
- Insert 1 into the first position: `[1, 2, 5, 9, 5]`

### Step 4:
- Move to the next element, which is 5.
- Compare 5 with the elements before it (9 and 5). Move 9 one position ahead.
- Insert 5 into its position: `[1, 2, 5, 9, 5]`

### Step 5:
- Move to the last element, which is 5.
- Compare 5 with the elements before it (9). Move 9 one position ahead.
- Insert 5 into its position: `[1, 2, 5, 5, 9]`

The array is now sorted: `[1, 2, 5, 5, 9]`.

## Complexity Analysis

Insertion Sort has an average and worst-case time complexity of O(n^2), but it's more efficient than Bubble Sort for small lists or nearly sorted lists. It's used in practice for sorting small datasets or as a building block for more advanced algorithms.
