package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
		String[] seasons = {"winter", "spring", "summer", "autumn"};
        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
   public int[] generateNumbers(int length) {
    if (length <=0)
    {
        System.out.println("Error");
        return null;
    }
    
    int[] numbers = new int[length];
    
    for(int i = 0; i < length; i++)
    {
        numbers[i] = i + 1;
    }
    System.out.print("Length = " + length + " -> [ ");
    for(int number : numbers)
    {
        System.out.print(number);
        System.out.print(" ");
    }
    System.out.print("]");
    return numbers;
}

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
   public int totalSum(int[] arr) {
    int sum = 0;
    for (int num : arr) 
    {
        sum = sum + num;
    }
    return sum;
}

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == number) {
            return i;  
        }
    }
    return -1;
}

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
   public String[] reverseArray(String[] arr) {
    int first = 0;
    int end = arr.length - 1;

    System.out.print("Original array: [");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");

    while (first < end) {
        // Swap elements at first and end indices
        String temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;

        first++;
        end--;
    }

    System.out.print("Reversed array: [");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
    
    return arr;
}

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
  public int[] getOnlyPositiveNumbers(int[] arr) {

    int countPositive = 0;
    for (int num : arr) {
        if (num > 0) {
            countPositive++;
        }
    }

    int[] positiveNumbers = new int[countPositive];
    int index = 0;

    for (int num : arr) {
        if (num > 0) {
            positiveNumbers[index++] = num;
        }
    }
    System.out.print("Positive numbers: ");
    for (int num : positiveNumbers) {
        System.out.print(num + " ");
    }

    return positiveNumbers;
}

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        return null;
    }

}
