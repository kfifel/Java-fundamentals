package Variables_and_Data_Types;

class PrimitiveDataTypes {
    public static void main(String[] argc) {
        // Declaring and initializing primitive variables
            byte myByte = -127; // [127 ~ -128]
            short myShort = 32_767;  // [32,767 ~ -32,768] same for others ...
            int myInt = 2_147_483_647; // adding _ betwen number just for good
            long myLong = 9_223_372_036_854_775_807L;
            float myFloat = 3.14f;
            double myDouble = 3.14159;
            boolean myBoolean = true;
            char myChar = 'A';

        // Printing the values of the variables
            System.out.println("Byte: " + myByte);
            System.out.println("Short: " + myShort);
            System.out.println("Int: " + myInt);
            System.out.println("Long: " + myLong);
            System.out.println("Float: " + myFloat);
            System.out.println("Double: " + myDouble);
            System.out.println("Boolean: " + myBoolean);
            System.out.println("Char: " + myChar);

    }
}