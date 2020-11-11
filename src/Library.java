import java.util.Scanner;

/**
 * The library that consists of a Librarian, a Student and a NonStudent, simulating the process
 * involved in returning and borrowing books to and from a library
 */
public class Library {
    /**
     * The driver class
     * @param args arguments
     */
    public static void main(String[] args) {
                // Skapa bibliotekarien
                Librarian librarian = new Librarian();
                // Skapa en student
                Student student;
                // NonStudent nonStudent = new NonStudent("960503","Sharre", "Daahir" );
                // Skannerobjektet som läser inmatning från användaren
                Scanner scanner = new Scanner(System.in);
                System.out.println("Welcome to Nackademin library");

                System.out.println("Enter your student ID");
                String studentID = scanner.nextLine();
                System.out.println("Enter your first name");
                String firstName = scanner.nextLine();
                System.out.println("Enter your last name");
                String lastName = scanner.nextLine();
                student = new Student(studentID, firstName, lastName);
                System.out.println("Good work, your profile has been created");

                // Dags att sköta studenternas önskemål
                int menuChosen = 0;
                // Denna while loop fortsätter så länge användaren inte skrev in 4 som menyalternativ
                while(menuChosen != 4) {
                    // Skriver ut menyn
                    System.out.println("What would you like to do?");
                    System.out.println("1. Borrow book");
                    System.out.println("2. Return book");
                    System.out.println("3. Update your profile");
                    System.out.println("4. Exit application");
                    // Användaren väljer ett menyalternativ
                    menuChosen = scanner.nextInt();
                    // om den valda menyn är 1 vill användaren låna
                    if(menuChosen == 1){
                        System.out.println("How many books do you want to borrow");
                        int numBookToBorrow = scanner.nextInt();
                        student.borrowBook(librarian, numBookToBorrow);
                    }
                    // om den valda menyn är 2 vill användaren återvända
                    else if(menuChosen == 2){
                        System.out.println("How many books do you want to return");
                        int numBookToReturn = scanner.nextInt();
                        student.returnBook(librarian, numBookToReturn);
                    }
                    // om den valda menyn är 3 vill användaren ändra status
                    else if(menuChosen == 3){
                        System.out.println("Type 1 to change your first name, type 2 to change your last name");
                        int nameToChange = scanner.nextInt();
                        if(nameToChange == 1){
                            System.out.println("Type in your new first name");
                            scanner.nextLine();
                            String newFirstName = scanner.nextLine();
                            student.updateFirstName(newFirstName);
                            System.out.println("This is your updated profile");
                            System.out.println(student);
                        }
                        else if(nameToChange == 2){
                            System.out.println("Type in your new ¨last name");
                            scanner.nextLine();
                            String newLastName = scanner.nextLine();
                            student.updateLastName(newLastName);
                            System.out.println("This is your updated profile");
                            System.out.println(student);
                        }
                    }
                }

                // Vid den här meny valet väljer användaren 4 - för att avsluta
                System.out.println("Thank you for using this library service");
            }
}