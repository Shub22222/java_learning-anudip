// package Selection Sort;
public class selctionsort {
    public static void main(String[] args) {
        // Initialize the array to be sorted
        int [] Arr = {7, 12, 9, 11, 3};

        // Outer loop: runs n-1 times (each pass places one element in correct position)
        for (int i = 0; i < Arr.length - 1; i++) {
            // Assume the current index i holds the minimum value
            int minValue = i;

            // Inner loop: find the index of the smallest element in the unsorted part
            for (int j = i + 1; j < Arr.length; j++) {
                // If a smaller element is found, update minValue
                if (Arr[j] < Arr[minValue]) {
                    minValue = j;
                }
            }

            // Swap the found minimum element with the element at index i
            int temp = Arr[minValue];
            Arr[minValue] = Arr[i];
            Arr[i] = temp;
        }

        // Print the sorted array
        for (int i : Arr) {
            System.out.println(i);
        }
    }
}
