package Variables_and_Data_Types;

import java.util.ArrayList;
import java.util.Arrays;

class NonPrimitiveDataTypes {
    public static void main(String[] argc) {
        // Declaring and initializing non-primitive variables
            String myString = "Hello, world!";
            int[] myIntArray = {1, 2, 3, 4, 5};

            /*
            * collections I well create an example later where I well explain more about this important title,
              and Generics too.
             */
            ArrayList<String> myArrayList = new ArrayList<String>();
            myArrayList.add("Apple");
            myArrayList.add("Banana");
            myArrayList.add("Orange");

        // Printing the values of the variables
            System.out.println("String: " + myString);
            System.out.println("IntArray: " + Arrays.toString(myIntArray));
            System.out.println("ArrayList: " + myArrayList);

    }
}