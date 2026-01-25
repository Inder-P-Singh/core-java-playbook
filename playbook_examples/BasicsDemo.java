public class BasicsDemo {
    public static void main(String[] args) {
        // 1. Print something
        System.out.println("=== Java Basics Demo ===");

        // 2. Strings
        String name = "Software and Testing Training";
        String greeting = "Welcome to " + name + "!";
        System.out.println("String example: " + greeting);
        System.out.println("Length of name: " + name.length());

        // 3. Numbers
        int x = 10;
        double y = 3.5;
        System.out.println("Numbers example: x = " + x + ", y = " + y);

        // 4. Operators
        int sum = x + 5;
        double product = x * y;
        boolean comparison = x > y;
        System.out.println("Operators example: sum = " + sum + ", product = " + product + ", x > y = " + comparison);

        // 5. If statement
        if (x % 2 == 0) {
            System.out.println("If example: " + x + " is even");
        } else {
            System.out.println("If example: " + x + " is odd");
        }

        // 6. For loop
        System.out.println("For loop example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("  i = " + i);
        }

        // 7. While loop
        System.out.println("While loop example:");
        int count = 3;
        while (count > 0) {
            System.out.println("  Countdown: " + count);
            count--;
        }
        System.out.println("=== Demo Complete ===");
    }
}
