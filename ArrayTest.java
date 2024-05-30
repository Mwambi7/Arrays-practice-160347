
import java.util.Arrays;
import java.util.Collections;
public class ArraySorting{
    public static void main(String[] args)
    {
        //sort()Method, (ascending order)
    int[] myArray ={5, 2, 8, 3, 1, 6, 4};
    Arrays.sort(myArray);
    
    //Parallel Sort()Method
    int[] largeArray ={1, 7, 8, 45, 78, 89, 80};
    Arrays.parallelSort(largeArray);
    
    System.out.println(Arrays.toString(largeArray));
    System.out.println("Sorted Array:");
    for (int i: myArray){
        System.out.print(i+ " ");
    }

    }
}

// Copying Arrays

public class ArrayPractice2 {
    public static void main(String[] args) {
        // Initialize the source array
        String[] copyFrom = {
            "affogato", "Americano", "cappuccino", "correto", "cortado",
            "doppio", "espresso", "frappuccino", "Maruchino", "freddo",
            "lungo", "machiato", "ristretto"
        };
        
        // Initialize the destination array
        String[] copyTo = new String[7];
        
        // Copy elements from copyFrom to copyTo
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        
        // Print the elements of copyTo
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
    }
}

//Bubble sort

class HelloWorld {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3, 4, 5, 6, 5, 6, 67, 8, 9, 1, 23, 49, 54, 65, 77, 87, 34, 56, 89, 100};

        System.out.println("Array before sorting:");
        printArray(array);

        bubbleSort(array);

        System.out.println("\nArray after sorting:");
        printArray(array);
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }
}



import java.util.Arrays; // Import the Arrays class

public class HelloWorld {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 40, 50, 60, 70, 80, 90, 100};
        
        // Calculate the sum of elements in the array
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
        
        // Sort the array in ascending order
        Arrays.sort(array);
        
        // Reverse the array to get it sorted in descending order
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Array sorted in descending order: " + Arrays.toString(array));
        
        // Replace the first occurrence of 100 with 1000
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 100) {
                array[i] = 1000;
                break;
            }
        }
        System.out.println("Array after replacing 100 with 1000: " + Arrays.toString(array));
    }
}
