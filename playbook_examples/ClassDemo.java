/* ClassDemo.java
 *
 * Demonstrates:
 * - constructors
 * - access modifiers (public/private/protected)
 * - static vs instance members
 *
 * Compile & run:
 *   javac ClassDemo.java
 *   java ClassDemo
 */
public class ClassDemo {

    // static member - shared across all instances
    public static int instancesCreated = 0;

    // private instance field - encapsulated per object
    private final String name;

    // public constructor
    public ClassDemo(String name) {
        this.name = name;
        instancesCreated++;
        System.out.println("Constructor: created instance '" + name + "'");
    }

    // protected method (visible to subclasses and package)
    protected void protectedInfo() {
        System.out.println("Protected info for: " + name);
    }

    // public instance method
    public String getName() {
        return name;
    }

    // public static utility method
    public static void printSummary() {
        System.out.println("Instances created so far: " + instancesCreated);
    }

    // A subclass in same file to demonstrate protected visibility and inheritance
    static class DemoChild extends ClassDemo {
        public DemoChild(String name) {
            super(name);
        }

        public void showProtected() {
            // can call protected method from parent
            protectedInfo();
        }
    }

    // demonstration
    public static void main(String[] args) {
        System.out.println("=== ClassDemo run ===");

        ClassDemo object1 = new ClassDemo("alpha");
        ClassDemo object2 = new ClassDemo("beta");

        System.out.println("object1 name: " + object1.getName());
        object1.protectedInfo();               // allowed here (same class)
        printSummary();                   // static call
        System.out.println("Direct static access: " + ClassDemo.instancesCreated);

        // Use subclass to show protected access from subclass
        DemoChild child = new DemoChild("child-1");
        child.showProtected();

        // Show static vs instance difference
        System.out.println("Creating another instance...");
        ClassDemo object3 = new ClassDemo("gamma");
        System.out.println("Final instancesCreated: " + ClassDemo.instancesCreated);

        System.out.println("=== ClassDemo complete ===");
    }
}
