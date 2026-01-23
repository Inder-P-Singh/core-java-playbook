import java.util.*;

public class RunSample {

    public static void main(String[] args) {

        System.out.println("=== Sample Automation Execution ===");

        // Simulated test users
        List<String> users = Arrays.asList("admin", "tester", "viewer");

        // Simulated credentials
        Map<String, String> credentials = new HashMap<>();
        credentials.put("admin", "admin123");
        credentials.put("tester", "test123");

        for (String user : users) {
            System.out.println("Executing test for user: " + user);

            if (credentials.containsKey(user)) {
                System.out.println("Login successful for: " + user);
            } else {
                System.out.println("Login failed for: " + user);
            }
        }

        System.out.println("=== Execution Complete ===");
    }
}
