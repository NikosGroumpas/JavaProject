import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class main {

    public static void main(String[] args) {

        int choice;
        ContactsManager cm1 = new ContactsManager();
        do {
            Scanner console = new Scanner(System.in);
            System.out.println("Choose 1 or 2: ");
            System.out.println("1. Add contact ");
            System.out.println("2. Search Contact");
            System.out.println("Press 3 to exit.");
            choice = console.nextInt();


                if (choice == 1) {
                    Scanner console1 = new Scanner(System.in);
                    System.out.println("Enter name: ");
                    String name = console1.nextLine();
                    System.out.println("Enter email: ");
                    String email = console1.nextLine();
                    System.out.println("Enter phonenumber: ");
                    String phone = console1.nextLine();
                    Contact c1 = new Contact(name,email,phone);
                    cm1.addContact(c1);

                } else if (choice == 2) {
                    Scanner console2 = new Scanner(System.in);
                    System.out.println("Enter name you want to search: ");
                    String findname = console2.nextLine();
                    Contact result2 = cm1.searchContact(findname);

                    if (result2 != null) {
                        System.out.println("Found!");
                        System.out.println(result2.name);
                        System.out.println(result2.email);
                        System.out.println(result2.phoneNumber);
                    } else {
                        System.out.println("Not found!");
                    }


                } else {
                    System.out.println("Bye!");
                }
            }while (choice!=3);

    }
}

class Contact {
    String name;
    String email;
    String phoneNumber;
    Contact(String name,String email,String phoneNumber){
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;

    }
}

class ContactsManager {
    Contact[] myFriends;
    //ArrayList<Contact> myContact = new ArrayList<>();
    int friendsCount;

    ContactsManager() {
        this.myFriends = new Contact[500];
        //List al = Arrays.asList(myFriends);
        this.friendsCount = 0;
    }

    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                System.out.println(myFriends[i].email);
            }
        }
        return null;
    }
}
