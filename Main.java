import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        // Ask for user name and ID
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your user ID: ");
        int userId = sc.nextInt();
        sc.nextLine(); // consume newline

        User user1 = new User(name, userId);
        System.out.println("👋 Welcome " + user1.getName() + "!");

        // Sample books
        lib.addBook(new Book("Java Basics", "James Gosling"));
        lib.addBook(new Book("OOP Concepts", "Alan Kay"));
        lib.addBook(new Book("Data Structures", "Robert Lafore"));

        while (true) {
            System.out.println("\n📘 Menu:");
            System.out.println("1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    lib.showBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = sc.nextLine();
                    lib.issueBook(issueTitle);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = sc.nextLine();
                    lib.returnBook(returnTitle);
                    break;
                case 4:
                    System.out.println("👋 Goodbye " + user1.getName() + "!");
                    sc.close();
                    return;
                default:
                    System.out.println("⚠️ Invalid choice. Try again.");
            }
        }
    }
}