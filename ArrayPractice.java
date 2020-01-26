
package arraypractice;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ArrayPractice {
    
    public static void printArray(int[] array) {
        System.out.print("[");
        
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i < array.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // This is bad practice in computer science to have two methods that do the
    // same thing. Will come across how to deal with this issue later when looking
    // at interfaces.
    public static void printArray(String[] array) {
        System.out.print("[");
        
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i < array.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
            

    
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaring, allocating, initializing
        
        int[] intArray1;
        int[] intArray2 = new int[4];
        int[] intArray3 = {5, 3, 2, 1};
        
        // Strings are also referenced data types, meaning there won't actually 
        // be 'bob' or whatever inside the array. There will be the pointer to 
        // 'bob' inside the array. So when you change an initial value of the 
        // array at a particular index, you swap out the initial address in the 
        // array for a new one that points to a different location in memory.
        String[] shoppingList = {"apples", "bananas", "carrots"};
        
        
        // Print out arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        
        // Not turning array to string, print's the reference to where it is
        // stored in memory. An array is a referenced data type, meaning it's an
        // address. An address of where that data is stored in memory.
        System.out.println(intArray2);
        
        // Index: 0,  1, 2, 3 --> length 4
        // Array:[10, 5, 3, 10] --> length 4
        // Change index values of array
        intArray2[0] = 10;
        intArray2[1] = 5;
        intArray2[2] = 3;
        intArray2[3] = 10;
        
        
        // Prints updated array, if you change something at a particular index
        // it is destructed, that thing you had there before is gone, there 
        // are no pointers to it, nothing. In other words the initial properties,
        // those are gone, you can no longer access them anymore.
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();
        
        // Custom print out arrays
        printArray(intArray2);
        printArray(intArray3);
        
        // Retrieve objects
        System.out.println(intArray2[3]);
        System.out.println(Array.get(intArray2, 2));
        System.out.println();
        
        // In-built functions
        
        // So because this function ( the sort function ) doesn't return anything
        // it's going to be destructive. Meaning it's values will be flipped and
        // switched around meaning you won't be able to access the initial values.
      Arrays.sort(intArray3);
      printArray(intArray3);
      
      // Print string array
      printArray(shoppingList);
      
      // Special for loop: foreach loop
      System.out.println("Special for loop: ");
      for(String s : shoppingList) {
          System.out.println(s);
      }
    }
    
}
