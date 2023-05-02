package Variables_and_Data_Types;

class TypeCasting {
    public static void main(String[] argc) {
        // Implicit type casting
        int myInt = 100;
        long myLong = myInt;

        float myFloat = 3.14f;
        double myDouble = myFloat;

        // Explicit type casting
        double myDouble1 = 3.14159;
        int myInt1 = (int) myDouble1;

        float myFloat1 = 3.14f;
        int myInt2 = (int) myFloat1;

        // Converting a String to a numeric type
        String myString = "123";
        int myInt3 = Integer.parseInt(myString);

        String myString1 = "3.14";
        float myFloat2 = Float.parseFloat(myString1);

    }
}