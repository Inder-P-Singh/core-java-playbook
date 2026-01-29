/**

* OperatorsPrecedenceDemo.java
*
* Demonstrates:
* 1. All arithmetic operators: + - * / %
* 2. Pre-increment (++x) and post-increment (x++)
* 3. Operator precedence in arithmetic expressions
* 4. Use of parentheses to override precedence
*
* How to compile & run (from repo root):
* javac playbook_examples/OperatorsPrecedenceDemo.java
* java -cp playbook_examples OperatorsPrecedenceDemo
  */
public class OperatorsPrecedenceDemo {

  public static void main(String[] args) {



    System.out.println("=== Operators & Precedence Demo ===\n");

    // ------- 1. Arithmetic operators -------
    int a = 10;
    int b = 3;

    System.out.println("-- Basic arithmetic (integers) --");
    System.out.println("a = " + a + ", b = " + b);
    System.out.println("a + b = " + (a + b));     // addition
    System.out.println("a - b = " + (a - b));     // subtraction
    System.out.println("a * b = " + (a * b));     // multiplication
    System.out.println("a / b = " + (a / b));     // integer division (truncates)
    System.out.println("a % b = " + (a % b));     // remainder/modulo

    // show floating point division
    double dDiv = (double) a / b;
    System.out.println("a / b (double) = " + dDiv);

    // ------- 2. Pre-increment vs Post-increment -------
    System.out.println("\n-- Pre-increment (++x) vs Post-increment (x++) --");
    int x = 5;
    System.out.println("Initial x = " + x);
    System.out.println("Post-increment x++ yields (value used in expression): " + (x++));
    System.out.println("Value of x after post-increment = " + x);

    x = 5; // reset
    System.out.println("Reset x = " + x);
    System.out.println("Pre-increment ++x yields (value used in expression): " + (++x));
    System.out.println("Value of x after pre-increment = " + x);

    // Demo difference inside an expression
    int i = 2;
    int expr1 = i++ + 3; // uses i (2) then increments i to 3
    System.out.println("\nExample: i=2; expr1 = i++ + 3  => expr1 = " + expr1 + ", i now = " + i);
    i = 2;
    int expr2 = ++i + 3; // increments i to 3, then uses 3
    System.out.println("Example: i=2; expr2 = ++i + 3  => expr2 = " + expr2 + ", i now = " + i);

    // ------- 3. Operator precedence -------
    System.out.println("\n-- Operator precedence --");
    int p1 = 2 + 3 * 4;      // multiplication before addition
    int p2 = 2 + (3 * 4);    // explicit, same as p1
    System.out.println("2 + 3 * 4 = " + p1 + "  (multiplication before addition)");

    // Mixed operators with division and modulo
    int p3 = 10 - 6 / 3 + 2; // division first: 6/3=2 => 10-2+2 = 10
    System.out.println("10 - 6 / 3 + 2 = " + p3 + "  (division before subtraction/addition)");

    // ------- 4. Parentheses override precedence -------
    System.out.println("\n-- Parentheses change evaluation order --");
    int withParen = (2 + 3) * 4; // addition first due to parentheses
    System.out.println("(2 + 3) * 4 = " + withParen + "  (parentheses force addition first)");

    // Complex example mixing increments and precedence (left-to-right evaluation of operands)
    int z = 3;
    System.out.println("\nComplex expression example with increments:");
    System.out.println("Start z = " + z);
    int complex = z++ * 2 + ++z; // evaluate step-by-step:
    // step: z++ returns 3, z becomes 4; ++z increments to 5 and returns 5; expression = 3*2 + 5 = 11
    System.out.println("Expression: z++ * 2 + ++z  => result = " + complex + ", z final = " + z);

    // ------- Summary -------
    System.out.println("\n=== Demo summary ===");
    System.out.println("Precedence: *, /, % higher than + and -; parentheses override evaluation order.");
    System.out.println("Be careful about side-effects with ++/-- in expressions; prefer separate statements for clarity.");
}
}