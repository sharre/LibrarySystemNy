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
                Student student = new Student("90887", "Ilhan", "Daahir");
                NonStudent nonStudent = new NonStudent("960503","Sharre", "Daahir" );
                // Skannerobjektet som läser inmatning från användaren
                Scanner scanner = new Scanner(System.in);
                System.out.println("Welcome to Nackademin library");
                System.out.println("Are you a student or non-student? Type 1 for Student, type 2 for Non-Student");
                // Läs in studenttypen från användaren
                int studentType = scanner.nextInt();
                // om användaren är student får han veta att han kan låna max 3 böcker åt gången
                // om användaren är nonstudent får han veta att han kan låna max 1 bok åt gången
                if(studentType == 1){
                    System.out.println("Note: You are allowed to borrow a maximum of 3 books at a time");
                }
                else if(studentType == 2){
                    System.out.println("Note: You are allowed to borrow a maximum of 1 book at a time");
                }
                // Dags att sköta studenternas önskemål
                int menuChosen = 0;
                // Denna while loop fortsätter så länge användaren inte skrev in 4 som menyalternativ
                while(menuChosen != 4) {
                    // Skriver ut menyn
                    System.out.println("What would you like to do?");
                    System.out.println("1. Borrow book");
                    System.out.println("2. Return book");
                    System.out.println("3. Change student type");
                    System.out.println("4. Exit application");
                    // Användaren väljer ett menyalternativ
                    menuChosen = scanner.nextInt();
                    // om den valda menyn är 1 vill användaren låna
                    if(menuChosen == 1){
                        System.out.println("How many books do you want to borrow");
                        int numBookToBorrow = scanner.nextInt();
                        if(studentType == 1) {
                            student.borrowBook(librarian, numBookToBorrow);
                        }
                        else if(studentType == 2) {
                            nonStudent.borrowBook(librarian, numBookToBorrow);
                        }
                    }
                    // om den valda menyn är 2 vill användaren återvända
                    else if(menuChosen == 2){
                        System.out.println("How many books do you want to return");
                        int numBookToReturn = scanner.nextInt();
                        if(studentType == 1) {
                            student.returnBook(librarian, numBookToReturn);
                        }
                        else if(studentType == 2) {
                            nonStudent.returnBook(librarian, numBookToReturn);
                        }
                    }
                    // om den valda menyn är 3 vill användaren ändra status
                    else if(menuChosen == 3){
                        System.out.println("Are you a student or non-student? Type 1 for Student, type 2 for Non-Student");
                        studentType = scanner.nextInt();
                        if(studentType == 1){
                            System.out.println("Note: You are allowed to borrow a maximum of 3 books at a time");
                        }
                        else if(studentType == 2){
                            System.out.println("Note: You are allowed to borrow a maximum of 1 book at a time");
                        }
                    }
                }

                // Vid den här meny valet väljer användaren 4 - för att avsluta
                System.out.println("Thank you for using this library service");
            }
}