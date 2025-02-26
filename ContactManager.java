import java.util.ArrayList;
import java.util.Scanner;
class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}


public class ContactManager {
    private static final ArrayList<Contact> contacts = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1 -> addContact();
                case 2 -> viewContacts();
                case 3 -> updateContact();
                case 4 -> deleteContact();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 5);
    }

    private static void addContact() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        contacts.add(new Contact(name, phone, email));
        System.out.println("Contact added successfully!");
    }

    private static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("\n--- Contact List ---");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i));
            }
        }
    }

    private static void updateContact() {
        viewContacts();
        if (contacts.isEmpty()) return;

        System.out.print("Enter the number of the contact to update: ");
        int index = sc.nextInt() - 1;
        sc.nextLine(); 

        if (index < 0 || index >= contacts.size()) {
            System.out.println("Invalid contact number!");
            return;
        }

        Contact contact = contacts.get(index);
        System.out.print("Enter new name (or press Enter to keep \"" + contact.getName() + "\"): ");
        String newName = sc.nextLine();
        if (!newName.isEmpty()) contact.setName(newName);

        System.out.print("Enter new phone (or press Enter to keep \"" + contact.getPhone() + "\"): ");
        String newPhone = sc.nextLine();
        if (!newPhone.isEmpty()) contact.setPhone(newPhone);

        System.out.print("Enter new email (or press Enter to keep \"" + contact.getEmail() + "\"): ");
        String newEmail = sc.nextLine();
        if (!newEmail.isEmpty()) contact.setEmail(newEmail);

        System.out.println("Contact updated successfully!");
    }

    private static void deleteContact() {
        viewContacts();
        if (contacts.isEmpty()) return;

        System.out.print("Enter the number of the contact to delete: ");
        int index = sc.nextInt() - 1;
        sc.nextLine(); // Consume newline

        if (index < 0 || index >= contacts.size()) {
            System.out.println("Invalid contact number!");
            return;
        }

        contacts.remove(index);
        System.out.println("Contact deleted successfully!");
    }
}
