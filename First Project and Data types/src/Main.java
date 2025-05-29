/**
 * This is the main class for demonstrating Java fundamentals.
 * 
 * 2.1 Project Creation and IDE Usage:
 * - Create a new Java project in your IDE (IntelliJ IDEA, Eclipse, etc.)
 * - Create a new Java class with a main method
 * - Write your code in the main method
 * - Run the program using the IDE's run button
 */
public class Main {
    /**
     * The main method is the entry point of the Java application.
     * 
     * @param args Command line arguments passed to the program
     */
    public static void main(String[] args) {
        // 2.2 Comments in Java
        // This is a single-line comment
        
        /*
         * This is a multi-line comment
         * You can write multiple lines here
         */
        
        /**
         * This is a documentation comment (Javadoc)
         * Used for generating documentation
         */
        
        // 2.3 Print Operations
        System.out.println("Hello, World!"); // Prints text and adds a new line
        System.out.print("This is printed "); // Prints text without a new line
        System.out.print("on the same line\n"); // \n adds a new line
        System.out.printf("Formatted output: %d %s %.2f\n", 10, "text", 5.12345); // Formatted output
        
        // 2.4 Variable Concept
        // A variable is a container that holds a value
        // Declaration: dataType variableName;
        // Initialization: variableName = value;
        // Or combined: dataType variableName = value;
        
        String name = "John"; // String variable
        int age; // Declaration
        age = 25; // Initialization
        System.out.println("Name: " + name + ", Age: " + age);
        
        // 2.5 Integer Types
        // byte: 8-bit signed integer (-128 to 127)
        byte byteValue = 100;
        System.out.println("Byte value: " + byteValue);
        
        // short: 16-bit signed integer (-32,768 to 32,767)
        short shortValue = 30000;
        System.out.println("Short value: " + shortValue);
        
        // int: 32-bit signed integer (-2^31 to 2^31-1)
        int intValue = 2000000000;
        System.out.println("Int value: " + intValue);
        
        // long: 64-bit signed integer (-2^63 to 2^63-1)
        long longValue = 9000000000000000000L; // Note the 'L' suffix
        System.out.println("Long value: " + longValue);
        
        // 2.6 Fractional Types
        // float: 32-bit floating point
        float floatValue = 3.14159f; // Note the 'f' suffix
        System.out.println("Float value: " + floatValue);
        
        // double: 64-bit floating point (more precision than float)
        double doubleValue = 3.141592653589793;
        System.out.println("Double value: " + doubleValue);
        
        // 2.7 Type Conversions
        // Widening Casting (automatically) - converting a smaller type to a larger type
        // byte -> short -> int -> long -> float -> double
        int myInt = 100;
        long myLong = myInt; // Automatic casting: int to long
        float myFloat = myLong; // Automatic casting: long to float
        double myDouble = myFloat; // Automatic casting: float to double
        
        System.out.println("Widening casting example:");
        System.out.println("int value: " + myInt);
        System.out.println("long value: " + myLong);
        System.out.println("float value: " + myFloat);
        System.out.println("double value: " + myDouble);
        
        // Narrowing Casting (manually) - converting a larger type to a smaller type
        // double -> float -> long -> int -> short -> byte
        double largeDouble = 9.78;
        int narrowedInt = (int) largeDouble; // Manual casting: double to int
        
        System.out.println("Narrowing casting example:");
        System.out.println("double value: " + largeDouble);
        System.out.println("int value (after casting): " + narrowedInt); // Decimal part is lost
        
        // 2.8 Operators
        // Arithmetic Operators
        int a = 10;
        int b = 3;
        
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division (integer division)
        System.out.println("a % b = " + (a % b)); // Modulus (remainder)
        
        // Unary Operators
        int c = 5;
        
        System.out.println("Unary Operators:");
        System.out.println("+c = " + (+c)); // Unary plus
        System.out.println("-c = " + (-c)); // Unary minus
        System.out.println("++c = " + (++c)); // Pre-increment
        System.out.println("c++ = " + (c++)); // Post-increment
        System.out.println("c = " + c); // Value after post-increment
        System.out.println("--c = " + (--c)); // Pre-decrement
        System.out.println("c-- = " + (c--)); // Post-decrement
        System.out.println("c = " + c); // Value after post-decrement
        
        // Equality and Relational Operators
        int x = 5;
        int y = 10;
        
        System.out.println("Equality and Relational Operators:");
        System.out.println("x == y: " + (x == y)); // Equal to
        System.out.println("x != y: " + (x != y)); // Not equal to
        System.out.println("x > y: " + (x > y)); // Greater than
        System.out.println("x < y: " + (x < y)); // Less than
        System.out.println("x >= y: " + (x >= y)); // Greater than or equal to
        System.out.println("x <= y: " + (x <= y)); // Less than or equal to
    }
}